package com.example.hilt.room

import android.content.Context

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [User::class], version = 2, exportSchema = false)
abstract class UserRoomDatabase : RoomDatabase() {

  abstract fun userDao(): UserDao

  companion object {

    @Volatile private var INSTANCE: UserRoomDatabase? = null

    fun getDatabase(context: Context): UserRoomDatabase =
      INSTANCE ?: synchronized(this) { INSTANCE ?: buildDatabase(context).also { INSTANCE = it } }

    private fun buildDatabase(ctx: Context) =
      Room.databaseBuilder(ctx.applicationContext, UserRoomDatabase::class.java, "demo-hilt.db")
        .build()
  }

  private class UserDatabaseCallback(
    private val scope: CoroutineScope
  ) : RoomDatabase.Callback() {

    override fun onCreate(db: SupportSQLiteDatabase) {
      super.onCreate(db)
      INSTANCE?.let { database ->
        scope.launch {
          val userDao = database.userDao()

          // Delete all content here.
          userDao.deleteAll()

          // Add sample words.
          var user = User("Hello")
          userDao.insert(user)
          user = User("World!")
          userDao.insert(user)

          // TODO: Add your own words!
          user = User("TODO!")
          userDao.insert(user)
        }
      }
    }
  }
}

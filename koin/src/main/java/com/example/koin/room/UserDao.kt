package com.example.koin.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
  @Insert //(onConflict = OnConflictStrategy.IGNORE)
  suspend fun insert(user: User)

  @Query("DELETE FROM users")
  suspend fun deleteAll()

  @Query("SELECT * from users ORDER BY id Desc")
  fun getAllUsers(): Flow<List<User>>

  @Query("SELECT * from users where id = :userid")
  fun getUser(userid: String): User
}
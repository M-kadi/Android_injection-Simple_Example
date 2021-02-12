package com.example.koin.sqlite

import android.content.ContentValues
import android.content.Context
import android.content.res.Resources.NotFoundException
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import kotlin.jvm.Throws


//@Singleton
// Inject Sqlite
class DbHelper constructor( context: Context?,
                            dbName: String?,
                            version: Int?) : SQLiteOpenHelper(context, dbName, null, version!!) {

    override fun onCreate(db: SQLiteDatabase) {
        tableCreateStatements(db)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $USER_TABLE_NAME")
        onCreate(db)
    }

    private fun tableCreateStatements(db: SQLiteDatabase) {
        try {
            db.execSQL(
                    "CREATE TABLE IF NOT EXISTS "
                            + USER_TABLE_NAME + "("
                            + USER_COLUMN_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
                            + USER_COLUMN_USER_NAME + " TEXT NOT NULL )"
            )
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }

    @Throws(NotFoundException::class, NullPointerException::class)
    fun getUser(userId: Long): User {
        var cursor: Cursor? = null
        return try {
            val db = this.readableDatabase
            cursor = db.rawQuery(
                    "SELECT * FROM "
                            + USER_TABLE_NAME
                            + " WHERE "
                            + USER_COLUMN_USER_ID
                            + " = ? ", arrayOf(userId.toString() + ""))
            if (cursor.count > 0) {
                cursor.moveToFirst()
                val user = User()
                user.id = cursor.getLong(cursor.getColumnIndex(USER_COLUMN_USER_ID))
                user.name = cursor.getString(cursor.getColumnIndex(USER_COLUMN_USER_NAME))
                user
            } else {
                throw NotFoundException("User with id $userId does not exists")
            }
        } catch (e: NullPointerException) {
            e.printStackTrace()
            throw e
        } finally {
            cursor?.close()
        }
    }

    @Throws(Exception::class)
    fun insertUser(user: User): Long {
        return try {
            val db = this.writableDatabase
            val contentValues = ContentValues()
            contentValues.put(USER_COLUMN_USER_NAME, user.name)
            db.insert(USER_TABLE_NAME, null, contentValues)
        } catch (e: Exception) {
            e.printStackTrace()
            throw e
        }
    }

    val currentTimeStamp: String
        get() = (System.currentTimeMillis() / 1000).toString()

    companion object {

        //USER TABLE
        const val USER_TABLE_NAME = "users"
        const val USER_COLUMN_USER_ID = "id"
        const val USER_COLUMN_USER_NAME = "usr_name"
    }
}



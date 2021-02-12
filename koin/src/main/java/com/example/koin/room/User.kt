package com.example.koin.room

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
class User(val usr_name: String) {

  @PrimaryKey(autoGenerate = true)
  var id: Int = 0
}
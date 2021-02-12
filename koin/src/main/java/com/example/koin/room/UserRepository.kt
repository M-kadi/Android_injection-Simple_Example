package com.example.koin.room

import androidx.annotation.WorkerThread
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class UserRepository(private val userDao: UserDao) {
  val allUsers: Flow<List<User>> = userDao.getAllUsers()

  @WorkerThread
  suspend fun insert(User: String) = withContext(Dispatchers.IO) {
    userDao.insert(User(User))
  }

  @WorkerThread
  suspend fun insert(User: User) = withContext(Dispatchers.IO) {
    userDao.insert(User)
  }


  @WorkerThread
  suspend fun deleteAllUsers() = withContext(Dispatchers.IO) {
    userDao.deleteAll()
  }
}

/*
    // By default Room runs suspend queries off the main thread, therefore, we don't need to
    // implement anything else to ensure we're not doing long running database work
    // off the main thread.
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(User: User) {
        userDao.insert(User)
    }
* */
package com.example.dagger.userList

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.dagger.room.User
import com.example.dagger.room.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class UsersViewModel(private val repository: UserRepository) : ViewModel() {
  val allUsers: LiveData<List<User>>
    get() = repository.allUsers.flowOn(Dispatchers.Main)
      .asLiveData(context = viewModelScope.coroutineContext)

  fun insert(user: String) {
    viewModelScope.launch {
      repository.insert(user)
    }
  }

  fun deleteAllUsers() {
    viewModelScope.launch {
      repository.deleteAllUsers()
    }
  }
}
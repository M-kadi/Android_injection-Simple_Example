package com.example.hilt.userList

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.hilt.room.User
import com.example.hilt.room.UserRepository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class UsersViewModel @ViewModelInject constructor(private val repository: UserRepository) : ViewModel() {
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
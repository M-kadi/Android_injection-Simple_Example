package com.example.koin.dataModule

import androidx.lifecycle.SavedStateHandle
import com.example.koin.userList.UsersViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
// inject ViewModel
val MyViewModelModule = module {
    viewModel {
        MyViewModel(get())
    }



//    viewModel{ (handle: SavedStateHandle) ->
//        MyViewModel(handle, get())
//    }

}
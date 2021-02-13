package com.example.koin.dataModule

import androidx.lifecycle.*
// inject ViewModel
class MyViewModel  constructor(
//    private val savedStateHandle: SavedStateHandle,
    private val data: Data
) :
    ViewModel(), LifecycleObserver {


    fun addCounter() {
        data.addCounter()
    }

    fun getCounter() = data.getCounter()


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        // This is just to demo onPaused is called.
        // To save, we don't need to `set`. It is just same as set directly to textLiveData.value
        // Refer https://medium.com/@elye.project/unintuitive-livedata-savedstatehandle-3d01fbdbfc01
//        savedStateHandle.set(KEY, "From onPaused")
    }

    companion object {
        const val KEY = "DefaultKey"
    }

}


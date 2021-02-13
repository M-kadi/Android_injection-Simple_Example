package com.example.hilt.dataModule

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Data @Inject constructor(): ViewModel(){

    private var count_ = 0
    private val count = MutableLiveData<Int>()

    init {
        count.value = count_
    }

    fun addCounter() {
        count_ += 1
        count.value = count_
    }

    fun getCounter() = count as LiveData<Int>
    //------------
    private val _showMSG = MutableLiveData<String>()


    val showMSG : LiveData<String>
        get() {
            Log.i("_showMSG","_showMSG1")
            return _showMSG
        }


    fun showMyMSG(msg: String) {
        _showMSG.value = (msg)  // Trigger the event by setting a new Event as a new value
    }
    //-----------------
    private val _showMSG2 = MutableLiveData<Event<String>>()

    val showMSG2 : LiveData<Event<String>>
        //get() = _showMSG2
        get() {
            Log.i("_showMSG","_showMSG2")
            return _showMSG2
        }


    fun showMyMSG2(msg: String) {
        _showMSG2.value = Event(msg)  // Trigger the event by setting a new Event as a new value
    }

}

class DataSet{
    var data = Data()
        private set

    companion object {
        @Volatile private var instance: DataSet? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance
                    ?: DataSet()
                        .also { instance = it }
            }
    }

}

open class Event<out T>(private val content: T) {

    var hasBeenHandled = false
        private set // Allow external read but not write

    /**
     * Returns the content and prevents its use again.
     */
    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    /**
     * Returns the content, even if it's already been handled.
     */
    fun peekContent(): T = content
}
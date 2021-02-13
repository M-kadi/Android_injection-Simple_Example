package com.example.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.lifecycle.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.koin.dataModule.MyViewModel
import com.example.koin.room.UserDao
import com.example.koin.room.UserRepository
import com.example.koin.sqlite.DbHelper
import com.example.koin.sqlite.User
import com.example.koin.userList.UserListAdapter
import com.example.koin.userList.UsersViewModel
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.input_user.view.*
import kotlinx.android.synthetic.main.list_user.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import org.koin.android.ext.android.get
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.core.qualifier.named
import org.koin.core.qualifier.qualifier

class MainActivity : AppCompatActivity() {







//    val mySharedPreferences1 : qualifier named("constant_str") by inject()

//    val vv = (qualifier = named("secondary"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        testClassConstructor.test()

        testSharedPreferences.test()

        testViewModel.test()


        testSqlite.test()

        testRoom.test()

        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

    }


    val testClassConstructor = TestClassConstructor()
    inner class TestClassConstructor{
        //    @Inject
//    lateinit var car9: Car2
//
//    @Inject
//    lateinit var car10: Car3

        private val car2 : Car2 by inject()
        private val car3 : Car3 by inject()

        private val car1 : Car1 by inject { parametersOf("hello") }


        fun test(){
            btnClassConstructor.setOnClickListener {
                val value = car3.maker()
                Log.i("ooooooo","" + value)
                Toast.makeText(this@MainActivity, "ClassConstructor $value" , Toast.LENGTH_SHORT).show()
            }
        }
    }

    val testSharedPreferences = TestSharedPreferences()
    inner class TestSharedPreferences{
        val mySharedPreferences : MySharedPreferences by inject()

        fun test(){
            btnSharedPreferences.setOnClickListener {
                mySharedPreferences.putData("mmm", 99)
                val value = mySharedPreferences.getData("mmm")
                Log.i("ooooooo", "" + value)
                Toast.makeText(this@MainActivity, "mySharedPreferences $value" , Toast.LENGTH_SHORT).show()
            }
        }
    }

    val testViewModel = TestViewModel()
    inner class TestViewModel{
        private val myViewModel : MyViewModel by viewModel()
        fun test(){


            lifecycle.addObserver(myViewModel)
//        viewModel.showTextDataNotifier.observe(this, textDataObserver)
//        btn_fetch.setOnClickListener { viewModel.fetchValue() }
            ///
            myViewModel.getCounter().observe(this@MainActivity, Observer {
                txt1122.setText("Count is "+it)
            })

            btn22.setOnClickListener {
                myViewModel.addCounter()
            }
        }
    }


    val testSqlite = TestSqlite()
    inner class TestSqlite{
        val dbHelper : DbHelper by inject()

        fun test(){
            btnSqlite.setOnClickListener {
                val id = dbHelper.insertUser(User("mkadi"))
                val value = dbHelper.getUser(id)
                Log.i("ggggg","" + value)
                Toast.makeText(this@MainActivity, "Sqlie $value" , Toast.LENGTH_SHORT).show()
            }
        }

    }


    val testRoom = TestRoom()
    inner class TestRoom{
        fun test(){
//            test_show_room()
//            test_insert_room()

            testRoomUserList()
        }

        private val usersViewModel : UsersViewModel by viewModel()
        private fun testRoomUserList(){



            btnAdd.setOnClickListener {
                val btnsheet = layoutInflater.inflate(R.layout.input_user, null)
                val dialog = BottomSheetDialog(this@MainActivity)
                dialog.setContentView(btnsheet)

                fun onSave(){
                    GlobalScope.launch {
                        val user = btnsheet.editUser.text.toString()
                        when {
                            user.isBlank() ->
                                this@MainActivity.runOnUiThread(java.lang.Runnable {
                                    Toast.makeText(this@MainActivity, "Set User Name", Toast.LENGTH_SHORT)
                                            .show()
                                })
                            else -> {
                                usersViewModel.insert(user)
                                //or => //userDao.insert(com.example.koin.room.User(user))
                            }
                        }
                    }
                }

                btnsheet.btnSave.setOnClickListener {
                    onSave()
                    btnsheet.btnSave.hideKeyboard()
                    dialog.dismiss()
                }
                dialog.show()


                btnsheet.editUser.setOnKeyListener(View.OnKeyListener { _, keyCode, event ->
                    val hasEnterOrGo = keyCode == KeyEvent.KEYCODE_ENTER || keyCode == EditorInfo.IME_ACTION_GO
                    return@OnKeyListener when (event.action == KeyEvent.ACTION_DOWN && hasEnterOrGo) {
                        true -> btnsheet.btnSave.callOnClick().let { true }
                        false -> false
                    }
                })


            }


            val adapter = UserListAdapter(this@MainActivity).apply {
                registerAdapterDataObserver(object : RecyclerView.AdapterDataObserver() {
                    override fun onChanged() {
                        super.onChanged()
                        empty_view.isVisible = this@apply.itemCount == 0
                    }
                })
            }

            recyclerview.adapter = adapter
            recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)

            usersViewModel.allUsers.observe(this@MainActivity) { users ->
                adapter.setWords(users)
            }
        }

        // room
        private val userDao : UserDao by inject()
        private fun test_insert_room(){
//            btn_insert_room1.setOnClickListener {
//      val wordDao = WordRoomDatabase.getDatabase(requireContext()).wordDao()
                GlobalScope.launch {
//            userDao.run {
//
//            }
                    userDao.insert(com.example.koin.room.User("hello10000"))
                    userDao.insert(com.example.koin.room.User("hello12000"))
                    userDao.insert(com.example.koin.room.User("hello13000"))

                }
//            }
        }

        private val repository: UserRepository by inject()
        private fun test_show_room(){
            val allUsers =
                repository.allUsers.flowOn(Dispatchers.Main)
                    .asLiveData(context = GlobalScope.coroutineContext)

//            btn_show_room1.setOnClickListener {
                allUsers
                    .observe(this@MainActivity, Observer {
                        // foo is still nullable
                        // get value of LiveData : one times : after MainActivity onCreate
                        it.forEach { Log.i("fff", "nullable " +  it.usr_name) }
                    })

                allUsers
                    .nonNull()
                    .observe(this@MainActivity, {
                        // Now foo is non-null
                        // get value of LiveData : always
                        it.forEach { Log.i("fff", "non-null " +  it.usr_name) }

                        Log.i("fff", "non-null size " +  it.size)
                    })
//            }
        }
    }

}

// room
// get value of LiveData : always
class NonNullMediatorLiveData<T> : MediatorLiveData<T>()
fun <T> LiveData<T>.nonNull(): NonNullMediatorLiveData<T> {
    val mediator: NonNullMediatorLiveData<T> = NonNullMediatorLiveData()
    mediator.addSource(this, Observer { it?.let { mediator.value = it } })
    return mediator
}
fun <T> NonNullMediatorLiveData<T>.observe(owner: LifecycleOwner, observer: (t: T) -> Unit) {
    this.observe(owner, Observer {
        it?.let(observer)
    })
}


fun TextView.hideKeyboard() {
    clearFocus()
    getInputMethodManager()?.hideSoftInputFromWindow(windowToken, 0)
}

private fun TextView.getInputMethodManager() =
        ContextCompat.getSystemService(context, InputMethodManager::class.java)

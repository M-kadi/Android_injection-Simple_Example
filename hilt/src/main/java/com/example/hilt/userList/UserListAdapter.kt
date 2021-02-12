package com.example.hilt.userList

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hilt.R
import com.example.hilt.room.User

class UserListAdapter(context: Context) : RecyclerView.Adapter<ViewHolder>() {

  private val inflater: LayoutInflater = LayoutInflater.from(context)
  private var users: List<User>? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return object : ViewHolder(inflater.inflate(R.layout.row_user, parent, false)) {}
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    (holder.itemView.findViewById(R.id.textView) as TextView).text = users?.get(position)?.usr_name ?: "No User"
  }

  fun setWords(words: List<User>) {
    this.users = words
    notifyDataSetChanged()
  }

  override fun getItemCount() = users?.size ?: 0
}
package com.androiddevs.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_todo.view.*

// passing todo item in TodoAdapter constructor.
class TodoAdapter(
    var todos: List<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    // import missing items by pressing ALT+ENTER

    // each adapter for recycler view needs to have an inner class which is a view to hold a class.
    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    // onCreateViewHolder is called when you need a view.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return TodoViewHolder(view)
    }

    // onBindViewHolder is called by RecyclerView to display data at the specified position.
    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
       holder.itemView.apply {
           tvTitle.text = todos[position].title
           cbDone.isChecked = todos[position].isChecked
       }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}
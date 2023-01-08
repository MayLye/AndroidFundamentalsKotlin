package com.androiddevs.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList = mutableListOf(
            Todo("Follow Big Kids", false),
            Todo("Learn Recyclerview", true),
            Todo("Feed dogs", false),
            Todo("Prank Boss", false),
            Todo("Eat curry", true),
            Todo("Ask my lover out", false),
            Todo("Take shower", false)
        )

        val adapter = TodoAdapter(todoList)
        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title = etTodo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            // not recommended to use notifyDataSetChanged because it will update everything.
            // adapter.notifyDataSetChanged()
            adapter.notifyItemInserted(todoList.size - 1)
        }
    }
}
package com.example.testcompose_ipp

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createAt : Date
)

fun getFakeTodo() : List<Todo>{
    return listOf<Todo>(
        Todo(1, "First to do", Date.from(Instant.now())),
        Todo(2, "Second to do", Date.from(Instant.now())),
        Todo(3, "this is my third to do", Date.from(Instant.now())),
        Todo(4, "this will be my forth to do, so that i can use it in UI", Date.from(Instant.now()))
    )
}

/*
TodoDao
    - getAllData()
    - addTodo()
    - deleteTodo()

TodoDatabase
    -Name
    -getDao()
*/
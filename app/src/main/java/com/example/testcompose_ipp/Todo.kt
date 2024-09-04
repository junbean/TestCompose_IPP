package com.example.testcompose_ipp

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Date

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String,
    var createAt : Date
)


/*
Room DB 사용 조건

Entity(Todo)
    -id
    -title
    -createdAt

TodoDao
    - getAllData()
    - addTodo()
    - deleteTodo()

TodoDatabase
    -Name
    -getDao()
*/
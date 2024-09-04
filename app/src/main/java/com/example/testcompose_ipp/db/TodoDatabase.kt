package com.example.testcompose_ipp.db

import androidx.room.Database
import com.example.testcompose_ipp.Todo

@Database(entities = [Todo::class], version = 1)
abstract class TodoDatabase {

    companion object{
        const val NAME = "Todo_DB"
    }

    abstract fun getTodoDao() : TodoDao
}
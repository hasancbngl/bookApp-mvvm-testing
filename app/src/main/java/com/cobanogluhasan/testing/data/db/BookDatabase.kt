package com.cobanogluhasan.testing.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cobanogluhasan.testing.data.db.dao.BookDao
import com.cobanogluhasan.testing.data.db.entity.Book

@Database(entities = [Book::class], version = 1)
abstract class BookDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
}
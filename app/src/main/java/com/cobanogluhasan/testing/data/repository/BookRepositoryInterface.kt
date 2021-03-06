package com.cobanogluhasan.testing.data.repository

import androidx.lifecycle.LiveData
import com.cobanogluhasan.testing.data.db.entity.Book
import com.cobanogluhasan.testing.data.model.ImagesResponse
import com.cobanogluhasan.testing.util.Resource

interface BookRepositoryInterface {

    suspend fun insertBook(book: Book)

    suspend fun deleteBook(book: Book)

    fun getBooks(): LiveData<List<Book>>

    suspend fun searchImage(imageString: String): Resource<ImagesResponse>
}
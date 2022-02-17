package com.example.room_db_studing_example.repository

import com.example.room_db_studing_example.data.UserDao
import com.example.room_db_studing_example.model.User
import kotlinx.coroutines.flow.Flow

// 앱에서 사용하는 데이터와 그 데이터 통신을 하는 역할
class UserRepository(private val userDao: UserDao) {

    val readAllData : Flow<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

    suspend fun updateUser(user : User){
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user : User){
        userDao.deleteUser(user)
    }

    fun searchDatabase(searchQuery: String): Flow<List<User>> {
        return userDao.searchDatabase(searchQuery)
    }
}
package com.kp.stockmarketcode.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.kp.stockmarketcode.model.User


@Dao
interface UsersDao {

    @Insert
    suspend fun insertUser(users: Users)

    @Query("SELECT * FROM users")
    fun getUser(): Users

    @Query("SELECT * FROM users where email= :email and password= :password")
    fun getUser(email: String, password: String): LiveData<User>

    @Delete
    suspend fun deleteUser(users: Users)

}
package com.kp.stockmarketcode.dao

import android.content.Context
import com.kp.stockmarketcode.AppRoomDatabase

class UsersRepository(context: Context) {

    private var usersDao: UsersDao

    init {
        val appRoomDatabase = AppRoomDatabase.getDatabase(context)
        usersDao = appRoomDatabase!!.userDao()
    }

    /*fun getProfiles(): LiveData<Users> {
        return usersDao.getProfiles()
    }*/

    suspend fun updateProfile(users: Users) {
        //usersDao.updateProfile(users)
        //usersDao.
    }

    suspend fun insertProfile(users: Users) {
        //usersDao.insertProfile(playerProfile)
        usersDao.insertUser(users)
    }

}
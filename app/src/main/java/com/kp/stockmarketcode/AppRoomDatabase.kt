package com.kp.stockmarketcode

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mathrecycler.PlayedGame
import com.example.mathrecycler.PlayerProfile
import com.kp.stockmarketcode.dao.BacklogDao
import com.kp.stockmarketcode.dao.ProfilesDao
import com.kp.stockmarketcode.dao.UsersDao

@Database(entities = [PlayedGame::class, PlayerProfile::class], version = 1, exportSchema = false)
abstract class AppRoomDatabase : RoomDatabase() {

    abstract fun backlogDao(): BacklogDao

    abstract fun profilesDao(): ProfilesDao

    abstract fun userDao(): UsersDao

    companion object {
        private const val DATABASE_NAME = "REMINDER_DATABASE"

        @Volatile
        private var appRoomDatabaseInstance: AppRoomDatabase? = null

        fun getDatabase(context: Context): AppRoomDatabase? {
            if (appRoomDatabaseInstance == null) {
                synchronized(AppRoomDatabase::class.java) {
                    if (appRoomDatabaseInstance == null) {
                        appRoomDatabaseInstance = Room.databaseBuilder(
                            context.applicationContext,
                            AppRoomDatabase::class.java, DATABASE_NAME
                        )
                            .build()
                    }
                }
            }
            return appRoomDatabaseInstance
        }
    }
}
package com.kp.stockmarketcode.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mathrecycler.PlayerProfile

@Dao
interface ProfilesDao {

    @Query("SELECT * FROM profileTable")
    fun getProfiles(): LiveData<List<PlayerProfile>>

    @Insert
    suspend fun insertProfile(playerProfile: PlayerProfile)

    @Delete
    suspend fun deleteProfile(playerProfile: PlayerProfile)

    @Update
    suspend fun updateProfile(playerProfile: PlayerProfile)
}
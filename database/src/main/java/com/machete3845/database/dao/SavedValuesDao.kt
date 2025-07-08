package com.machete3845.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.machete3845.database.models.SavedValuesDBO

@Dao
interface AddressResultsDao {
    @Query("SELECT * FROM addressResults")
    fun getAllAddressResults(): List<SavedValuesDBO>

    @Insert
    suspend fun insertAddressResults(elements: List<SavedValuesDBO>)

    @Update
    suspend fun updateAddressResults(elements: List<SavedValuesDBO>)

    @Delete
    suspend fun removeAddressResult(elements: List<SavedValuesDBO>)

    @Query("DELETE FROM addressResults")
    suspend fun clear()
}

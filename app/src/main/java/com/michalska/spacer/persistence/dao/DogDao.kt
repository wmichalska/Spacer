package com.michalska.spacer.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.*
import com.michalska.spacer.persistence.entity.DogEntity

@Dao
interface DogDao {
    @Insert
    fun instertDog(dog: DogEntity): Long

    @Query("SELECT * FROM ${DogEntity.TABLE_NAME}")
    fun findAll(): List<DogEntity>

    @Update
    fun updateDog(currentDog: DogEntity)

    @Query("DELETE FROM ${DogEntity.TABLE_NAME}")
    fun deleteAll()

}
package com.michalska.spacer.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.michalska.spacer.persistence.dao.DogDao
import com.michalska.spacer.persistence.entity.DogEntity


@Database(
    entities = [
        DogEntity::class
    ], version = 1, exportSchema = false
)
@TypeConverters(Converters::class)
abstract class SpacerDatabase : RoomDatabase() {

    abstract fun dogDao(): DogDao

}
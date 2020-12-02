package com.michalska.spacer.persistence.entity

import android.app.DownloadManager.COLUMN_ID
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.RoomMasterTable.TABLE_NAME

@Entity(
    tableName = TABLE_NAME,
    indices = [Index(COLUMN_ID)]
)

data class DogEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_ID)
    var id: Long,

    @ColumnInfo(name = COLUMN_DOG_NAME)
    var dogName: String,

    @ColumnInfo(name = COLUMN_DOG_BREED)
    var dogBreed: String,

    @ColumnInfo(name = COLUMN_DOG_AGE)
    var dogAge: Int
) {
    companion object {
        const val TABLE_NAME = "dog"
        const val COLUMN_ID = "id_dog"
        const val COLUMN_DOG_NAME = "dog_name"
        const val COLUMN_DOG_BREED = "dog_breed"
        const val COLUMN_DOG_AGE = "dog_age"

    }

}

package com.michalska.spacer.persistence

import android.os.Build
import androidx.room.TypeConverter

object Converters {


    @TypeConverter
    @JvmStatic
    fun dateToString(date: java.time.LocalDateTime?) = date?.toString()

    @TypeConverter
    @JvmStatic
    fun stringToDate(date: String?) = date?.let { if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        java.time.LocalDateTime.parse(it)
    } else {
        TODO("VERSION.SDK_INT < O")
    }
    }
}
package com.example.dogapi_039.Modelo.Local.Entitys

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Breed")
 data class Breed (
 @PrimaryKey(autoGenerate = true)
val id :Int? = null,
val breed :String
 )
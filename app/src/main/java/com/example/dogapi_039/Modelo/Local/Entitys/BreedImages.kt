package com.example.dogapi_039.Modelo.Local.Entitys

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName ="Breed_images")
data class BreedImages (

    @PrimaryKey (autoGenerate = true)val id : Long =0,
    val imageUrls : String // Cadena de URLs separadas por comas
)
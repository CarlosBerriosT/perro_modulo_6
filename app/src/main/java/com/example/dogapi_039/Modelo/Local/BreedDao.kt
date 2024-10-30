package com.example.dogapi_039.Modelo.Local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dogapi_039.Modelo.Local.Entitys.Breed
import com.example.dogapi_039.Modelo.Local.Entitys.BreedImages
import com.example.dogapi_039.Modelo.Local.Entitys.Favorite


@Dao
interface BreedDao {


    //Insertar una raza o el listado de raza
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(breed: List<Breed>)


// obtener todas las razas

    @Query("SELECT * FROM Breed")
    suspend fun getAllBreeds(): LiveData<List<Breed>>


    // insertar multiples imágenes de razas
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllImages(breedImages: List<BreedImages>)


    // obtener todas las imágenes
    @Query("SELECT * FROM Breed_images")
    suspend fun getAllBreedsImage(): LiveData<List<BreedImages>>


    // insertar un favorito
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(favorite: Favorite)

    // obtener todas los favoritos
    @Query("SELECT * FROM Favorite")
    suspend fun getAlLFavorite(): LiveData<List<Favorite>>





}
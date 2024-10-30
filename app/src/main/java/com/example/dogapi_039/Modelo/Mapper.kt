package com.example.dogapi_039.Modelo

import com.example.dogapi_039.Modelo.Local.Entitys.Breed
import com.example.dogapi_039.Modelo.Local.Entitys.BreedImages
import com.example.dogapi_039.Modelo.Remote.Response.BreedImageResponse
import com.example.dogapi_039.Modelo.Remote.Response.BreedResponse


fun mapBreedResponseToBreedEntities(breedResponse: BreedResponse): List<Breed> {
    return breedResponse.message.map { (breedName, _) ->
        Breed(id = 0, breed = breedName) // Asumiendo que el ID se generará automáticamente
    }
}

fun mapBreedImagesResponseToBreedImagenes(breedImagesResponse: BreedImageResponse): List<BreedImages> {
    return breedImagesResponse.message.map { imageUrl ->
        BreedImages(imageUrls = imageUrl) // Crear una nueva instancia por cada URL
    }
}

package com.rxjava.mell.rxjavateste.model.api

import com.google.gson.annotations.SerializedName

/**
 * Created by Mell on 20/03/2018.
 */

data class FilmResult(val results: List<Film>)

data class Film(val title: String,
                @SerializedName("episode_id") val episodeId: Int,
                @SerializedName("characters") val personUrls : List<String>)

data class Person(val name : String, val gender: String)

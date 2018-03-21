package com.rxjava.mell.rxjavateste.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Mell on 20/03/2018.
 */
data class Movie(val title: String, val episodeId: Int, val characters: MutableList<Character>)

data class Character(val name: String, val gender : String){
    override fun toString(): String{
        return "${name} - ${gender}"
    }
}


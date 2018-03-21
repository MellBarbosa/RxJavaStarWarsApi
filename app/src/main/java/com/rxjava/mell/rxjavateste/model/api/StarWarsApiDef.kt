package com.rxjava.mell.rxjavateste.model.api

import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * Created by Mell on 20/03/2018.
 */
interface StarWarsApiDef{
    @GET("films")
    fun listMovies(): Observable<FilmResult>

    @GET("people/{personId}")
    fun loadPerson(@Path("personId") personId : String): Observable<Person>
}
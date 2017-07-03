package com.cleanarchitecture.data.ws

import com.cleanarchitecture.data.model.UserData
import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


interface GithubApi {

    @GET("users/{value}")
    fun user(@Path("value") username: String): Observable<UserData>

    @GET("users/{value}/followers")
    fun followers(@Path("value") username: String): Observable<List<UserData>>


    /**
     * Companion object for the factory
     */
    companion object Factory {
        fun create(): GithubApi {
            val retrofit = retrofit2.Retrofit.Builder()
                    .client(OkHttpClient.Builder().build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .baseUrl("https://api.github.com/")
                    .build()

            return retrofit.create(GithubApi::class.java)
        }
    }
}
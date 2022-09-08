package com.williamnery.retrofitexample

import retrofit2.Call
import retrofit2.http.GET

// https://jsonplaceholder.typicode.com/posts

interface UserService {

    @GET("users")
    fun list(): Call<List<PostEntity>>

}
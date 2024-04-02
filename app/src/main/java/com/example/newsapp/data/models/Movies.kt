package com.example.newsapp.data.models


import com.google.gson.annotations.SerializedName

data class Movies(
    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("previous")
    val previous: Previous,
    @SerializedName("status")
    val status: Int
)
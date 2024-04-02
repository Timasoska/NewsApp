package com.example.newsapp.data.models


import com.google.gson.annotations.SerializedName

data class Previous(
    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("name")
    val name: String
)
package com.example.equizz

data class Question (
    val id: Int,
    val question: String,
    val optionone: String,
    val optiontwo: String,
    val optionthree: String,
    val optionfour: String,
    val correctans: Int
        )
package com.example.emailapp.data

data class Email(
    val id : Long,
    val sender : Account,
    val subject : String,
    val body : String,
    val createAt : String
)
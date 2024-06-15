package com.app.cleanarchitecture.signup.domain.entities

data class SignupData(
    val email: String,
    val username: String,
    val password: String,
    val repeatPassword: String
)

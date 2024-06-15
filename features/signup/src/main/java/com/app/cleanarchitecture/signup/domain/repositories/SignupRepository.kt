package com.app.cleanarchitecture.signup.domain.repositories

import com.app.cleanarchitecture.signup.domain.entities.SignupData

interface SignupRepository {
    suspend fun signup(signupData: SignupData)
}
package com.app.cleanarchitecture.signup.domain

import com.app.cleanarchitecture.signup.domain.entities.SignupData
import com.app.cleanarchitecture.signup.domain.entities.SignupField
import com.app.cleanarchitecture.signup.domain.exceptions.EmptyFieldException
import com.app.cleanarchitecture.signup.domain.exceptions.PasswordMismatchException
import com.app.cleanarchitecture.signup.domain.repositories.SignupRepository
import javax.inject.Inject

class SignupUseCase @Inject constructor (
    private val signupRepository: SignupRepository
) {

    suspend fun signUp(signupData: SignupData) {
        if (signupData.email.isBlank()) throw EmptyFieldException(SignupField.EMAIL)
        if (signupData.username.isBlank()) throw EmptyFieldException(SignupField.USERNAME)
        if (signupData.password.isBlank()) throw EmptyFieldException(SignupField.PASSWORD)
        if (signupData.repeatPassword.isBlank()) throw EmptyFieldException(SignupField.REPEAT_PASSWORD)
        if (signupData.password != signupData.repeatPassword) throw PasswordMismatchException()
        signupRepository.signup(signupData)
    }

}
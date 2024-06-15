package com.app.cleanarchitecture.signup.domain.exceptions

import com.app.cleanarchitecture.common.AppException
import com.app.cleanarchitecture.signup.domain.entities.SignupField

class EmptyFieldException(val field: SignupField): AppException()
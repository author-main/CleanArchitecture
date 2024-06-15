package com.app.cleanarchitecture.signup.domain.exceptions

import com.app.cleanarchitecture.common.AppException

class AccountExistException(
    cause: Throwable?
): AppException(cause = cause)
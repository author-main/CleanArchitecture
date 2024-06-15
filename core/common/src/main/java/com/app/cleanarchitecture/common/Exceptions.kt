package com.app.cleanarchitecture.common

open class AppException(
    message: String = "",
    cause: Throwable? = null,
) : Exception(message, cause)
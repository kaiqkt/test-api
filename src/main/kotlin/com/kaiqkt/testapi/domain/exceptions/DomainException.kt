package com.kaiqkt.testapi.domain.exceptions

class DomainException(
    val type: ErrorType,
) : Exception(type.message)

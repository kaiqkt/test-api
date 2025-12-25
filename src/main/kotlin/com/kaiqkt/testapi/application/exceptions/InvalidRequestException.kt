package com.kaiqkt.testapi.application.exceptions

class InvalidRequestException(
    val errors: Map<String, Any>,
) : Exception()

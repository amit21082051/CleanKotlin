package com.cleanarchitecture.domain.exceptions

import com.cleanarchitecture.domain.validations.ValidationTypes


class ValidationException(value: ValidationTypes) : Exception() {

    val valueType: ValidationTypes = value
}
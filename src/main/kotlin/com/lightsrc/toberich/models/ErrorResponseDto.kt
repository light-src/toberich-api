package com.lightsrc.toberich.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param code 
 * @param message 
 */
data class ErrorResponseDto(

    @Schema(example = "404", description = "")
    @get:JsonProperty("code") val code: kotlin.Int? = null,

    @Schema(example = "Not Found", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null
    ) {

}


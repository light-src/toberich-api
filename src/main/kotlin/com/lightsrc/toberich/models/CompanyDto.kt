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
 * @param symbol 
 * @param cik 
 * @param currency 
 * @param companyName 
 * @param website 
 * @param exchange 
 * @param exchangeShortName 
 * @param industry 
 * @param country 
 * @param price 
 * @param beta 
 * @param volAvg 
 * @param mktCap 
 * @param lastDiv 
 * @param range 
 * @param changes 
 * @param ceo 
 * @param sector 
 * @param fullTimeEmployees 
 * @param phone 
 * @param address 
 * @param city 
 * @param state 
 * @param zip 
 * @param image 
 * @param ipoDate 
 * @param defaultImage 
 * @param isEtf 
 * @param isActivelyTrading 
 * @param isAdr 
 * @param isFund 
 */
data class CompanyDto(

    @Schema(example = "AAPL", description = "")
    @get:JsonProperty("symbol") val symbol: kotlin.String? = null,

    @Schema(example = "0000320193", description = "")
    @get:JsonProperty("cik") val cik: kotlin.String? = null,

    @Schema(example = "USD", description = "")
    @get:JsonProperty("currency") val currency: kotlin.String? = null,

    @Schema(example = "Apple Inc.", description = "")
    @get:JsonProperty("companyName") val companyName: kotlin.String? = null,

    @Schema(example = "https://www.apple.com", description = "")
    @get:JsonProperty("website") val website: kotlin.String? = null,

    @Schema(example = "NASDAQ Global Select", description = "")
    @get:JsonProperty("exchange") val exchange: kotlin.String? = null,

    @Schema(example = "NASDAQ", description = "")
    @get:JsonProperty("exchangeShortName") val exchangeShortName: kotlin.String? = null,

    @Schema(example = "Consumer Electronics", description = "")
    @get:JsonProperty("industry") val industry: kotlin.String? = null,

    @Schema(example = "US", description = "")
    @get:JsonProperty("country") val country: kotlin.String? = null,

    @Schema(example = "178.72", description = "")
    @get:JsonProperty("price") val price: kotlin.Float? = null,

    @Schema(example = "1.286802", description = "")
    @get:JsonProperty("beta") val beta: kotlin.Float? = null,

    @Schema(example = "58405568", description = "")
    @get:JsonProperty("volAvg") val volAvg: kotlin.Int? = null,

    @Schema(example = "2794144143933", description = "")
    @get:JsonProperty("mktCap") val mktCap: kotlin.Int? = null,

    @Schema(example = "0.96", description = "")
    @get:JsonProperty("lastDiv") val lastDiv: kotlin.Float? = null,

    @Schema(example = "124.17-198.23", description = "")
    @get:JsonProperty("range") val range: kotlin.String? = null,

    @Schema(example = "-0.13", description = "")
    @get:JsonProperty("changes") val changes: kotlin.Float? = null,

    @Schema(example = "Mr. Timothy D. Cook", description = "")
    @get:JsonProperty("ceo") val ceo: kotlin.String? = null,

    @Schema(example = "Technology", description = "")
    @get:JsonProperty("sector") val sector: kotlin.String? = null,

    @Schema(example = "164000", description = "")
    @get:JsonProperty("fullTimeEmployees") val fullTimeEmployees: kotlin.String? = null,

    @Schema(example = "408 996 1010", description = "")
    @get:JsonProperty("phone") val phone: kotlin.String? = null,

    @Schema(example = "One Apple Park Way", description = "")
    @get:JsonProperty("address") val address: kotlin.String? = null,

    @Schema(example = "Cupertino", description = "")
    @get:JsonProperty("city") val city: kotlin.String? = null,

    @Schema(example = "CA", description = "")
    @get:JsonProperty("state") val state: kotlin.String? = null,

    @Schema(example = "95014", description = "")
    @get:JsonProperty("zip") val zip: kotlin.String? = null,

    @Schema(example = "https://financialmodelingprep.com/image-stock/AAPL.png", description = "")
    @get:JsonProperty("image") val image: kotlin.String? = null,

    @Schema(example = "1980-12-12", description = "")
    @get:JsonProperty("ipoDate") val ipoDate: kotlin.String? = null,

    @Schema(example = "false", description = "")
    @get:JsonProperty("defaultImage") val defaultImage: kotlin.Boolean? = null,

    @Schema(example = "false", description = "")
    @get:JsonProperty("isEtf") val isEtf: kotlin.Boolean? = null,

    @Schema(example = "true", description = "")
    @get:JsonProperty("isActivelyTrading") val isActivelyTrading: kotlin.Boolean? = null,

    @Schema(example = "false", description = "")
    @get:JsonProperty("isAdr") val isAdr: kotlin.Boolean? = null,

    @Schema(example = "false", description = "")
    @get:JsonProperty("isFund") val isFund: kotlin.Boolean? = null
    ) {

}


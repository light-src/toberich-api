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
 * @param totalAssets 
 * @param totalLiabilities 
 * @param totalStockholdersEquity 
 * @param cashAndCashEquivalents 
 * @param shortTermInvestments 
 */
data class BalanceSheetDto(

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

    @Schema(example = "352755000000", description = "")
    @get:JsonProperty("totalAssets") val totalAssets: kotlin.Int? = null,

    @Schema(example = "302083000000", description = "")
    @get:JsonProperty("totalLiabilities") val totalLiabilities: kotlin.Int? = null,

    @Schema(example = "50672000000", description = "")
    @get:JsonProperty("totalStockholdersEquity") val totalStockholdersEquity: kotlin.Int? = null,

    @Schema(example = "23646000000", description = "")
    @get:JsonProperty("cashAndCashEquivalents") val cashAndCashEquivalents: kotlin.Int? = null,

    @Schema(example = "24658000000", description = "")
    @get:JsonProperty("shortTermInvestments") val shortTermInvestments: kotlin.Int? = null
    ) {

}


package com.lightsrc.toberich.apis

import com.lightsrc.toberich.models.BalanceSheetDto
import com.lightsrc.toberich.models.CashFlowDto
import com.lightsrc.toberich.models.CompanyDto
import com.lightsrc.toberich.models.ErrorResponseDto
import com.lightsrc.toberich.models.IncomeStatementDto
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/v1}")
class CompanyApiController() {

    @Operation(
        summary = "Get balance sheet for the company",
        operationId = "companyTickerBalancesheetGet",
        description = """Retrieve the balance sheet. of the company for a specific ticker.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful response with balance sheet data", content = [Content(schema = Schema(implementation = BalanceSheetDto::class))]),
            ApiResponse(responseCode = "404", description = "Balance sheet not found", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized - Authentication is required", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden - You do not have access to this resource", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/company/{ticker}/balancesheet"],
        produces = ["application/json"]
    )
    fun companyTickerBalancesheetGet(@Parameter(description = "The stock ticker symbol of the company (e.g., AAPL for Apple Inc.)", required = true) @PathVariable("ticker") ticker: kotlin.String): ResponseEntity<BalanceSheetDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get cash flow statement for the company",
        operationId = "companyTickerCashflowGet",
        description = """Retrieve the cash flow statement of the company for a specific ticker.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful response with cash flow statement data", content = [Content(schema = Schema(implementation = CashFlowDto::class))]),
            ApiResponse(responseCode = "404", description = "Cash flow statement not found", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized - Authentication is required", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden - You do not have access to this resource", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/company/{ticker}/cashflow"],
        produces = ["application/json"]
    )
    fun companyTickerCashflowGet(@Parameter(description = "The stock ticker symbol of the company (e.g., AAPL for Apple Inc.)", required = true) @PathVariable("ticker") ticker: kotlin.String): ResponseEntity<CashFlowDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get company information",
        operationId = "companyTickerGet",
        description = """Retrieve detailed company information for the specified ticker.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful response with company data", content = [Content(schema = Schema(implementation = CompanyDto::class))]),
            ApiResponse(responseCode = "404", description = "Company not found", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized - Authentication is required", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden - You do not have access to this resource", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/company/{ticker}"],
        produces = ["application/json"]
    )
    fun companyTickerGet(@Parameter(description = "The stock ticker symbol of the company (e.g., AAPL for Apple Inc.)", required = true) @PathVariable("ticker") ticker: kotlin.String): ResponseEntity<CompanyDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get income statement for the company",
        operationId = "companyTickerIncomestmtGet",
        description = """Retrieve the income statement of the company for a specific ticker.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful response with income statement data", content = [Content(schema = Schema(implementation = IncomeStatementDto::class))]),
            ApiResponse(responseCode = "404", description = "Income statement not found", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]),
            ApiResponse(responseCode = "401", description = "Unauthorized - Authentication is required", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]),
            ApiResponse(responseCode = "403", description = "Forbidden - You do not have access to this resource", content = [Content(schema = Schema(implementation = ErrorResponseDto::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/company/{ticker}/incomestmt"],
        produces = ["application/json"]
    )
    fun companyTickerIncomestmtGet(@Parameter(description = "The stock ticker symbol of the company (e.g., AAPL for Apple Inc.)", required = true) @PathVariable("ticker") ticker: kotlin.String): ResponseEntity<IncomeStatementDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}

package com.lightsrc.toberich.apis

import com.lightsrc.toberich.models.BalanceSheetDto
import com.lightsrc.toberich.models.CashFlowDto
import com.lightsrc.toberich.models.CompanyDto
import com.lightsrc.toberich.models.ErrorResponseDto
import com.lightsrc.toberich.models.IncomeStatementDto
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class CompanyApiTest {

    private val api: CompanyApiController = CompanyApiController()

    /**
     * To test CompanyApiController.companyTickerBalancesheetGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun companyTickerBalancesheetGetTest() {
        val ticker: kotlin.String = TODO()
        val response: ResponseEntity<BalanceSheetDto> = api.companyTickerBalancesheetGet(ticker)

        // TODO: test validations
    }

    /**
     * To test CompanyApiController.companyTickerCashflowGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun companyTickerCashflowGetTest() {
        val ticker: kotlin.String = TODO()
        val response: ResponseEntity<CashFlowDto> = api.companyTickerCashflowGet(ticker)

        // TODO: test validations
    }

    /**
     * To test CompanyApiController.companyTickerGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun companyTickerGetTest() {
        val ticker: kotlin.String = TODO()
        val response: ResponseEntity<CompanyDto> = api.companyTickerGet(ticker)

        // TODO: test validations
    }

    /**
     * To test CompanyApiController.companyTickerIncomestmtGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun companyTickerIncomestmtGetTest() {
        val ticker: kotlin.String = TODO()
        val response: ResponseEntity<IncomeStatementDto> = api.companyTickerIncomestmtGet(ticker)

        // TODO: test validations
    }
}

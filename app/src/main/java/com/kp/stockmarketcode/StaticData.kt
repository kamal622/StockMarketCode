package com.kp.stockmarketcode

import com.kp.stockmarketcode.model.*

object user {
    var user = User(
        "https://photos.google.com/photo/AF1QipOkVqBm81TFd_ftbOhSSNsJ-lW1RUoIGuR8UEhu",
        "kamal patel",
        "patelkamal115@gmail.com",
        8460298962,
        0.0,
        0.0,
        "PAN123NO",
        "Chikhli",
        "BOB_CHIKHLI",
        "ABC",
        0.0
    )
}

object bankDetails {
    val bankDetails = BankDetails(
        "BOB12CHIKHLI6622",
        "BOB",
        "9876543210",
        "IFSC1234",
        "FIX"
    )
}

object marketWatch {
    val marketWatch = MarketWatch(
        "a", "", "", "", "",
        "", "", "", "", "", ""
    )
}

object holdingPosition {
    val holdingPosition = ProtFolioHP("", "b", "", "")
}


val financialLedger = listOf<FinancialLedger>(
    FinancialLedger("NameTest", "Financial"),
    FinancialLedger("Namee", "Ledger"),
    FinancialLedger("test", "test")
)

val profitLoss = listOf<ProfitLoss>(
    ProfitLoss("sym", "29-8-2020", "12", "200", "4", "10", "180", "210"),
    ProfitLoss("symm", "30-8-2020", "2", "195", "20", "20", "190", "180")
)

val tradeReport = listOf<TradeReport>(
    TradeReport("29-8-2020", "10", "2", "120", "buy", "2", "active"),
    TradeReport("30-8-2020", "13", "4", "240", "sell", "4", "sould")
)

val stockList = listOf<String>(
    "KotakMahindraBank",
    "AsianPaint",
    "BajajFinserv",
    "PidiliteIndustries",
    "TataConsultancyServices",
    "Infosys",
    "SunPharmaceuticalIndustriesLtd",
    "MarutiSuzukiIndiaLtd",
    "TitanCompanyLimited"
)


/*enum class stockList{
    KotakMahindraBank,
    AsianPaint,
    BajajFinserv,
    PidiliteIndustries,
    TataConsultancyServices,
    Infosys,
    SunPharmaceuticalIndustriesLtd,
    MarutiSuzukiIndiaLtd,
    TitanCompanyLimited
}

val answers: Array<stockList> = stockList.values()
val rand = Random()

fun genAnswer ():String {
    val n = rand.nextInt(3)+1
    return answers[n].toString()
}*/

/*10rendom stock
observer
room database

get data from repocitory*/

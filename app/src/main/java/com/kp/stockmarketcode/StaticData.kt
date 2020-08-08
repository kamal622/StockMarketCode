package com.kp.stockmarketcode

import com.kp.stockmarketcode.model.BankDetails
import com.kp.stockmarketcode.model.MarketWatch
import com.kp.stockmarketcode.model.ProtFolioHP
import com.kp.stockmarketcode.model.User

object user{
    val user = User("https://photos.google.com/photo/AF1QipOkVqBm81TFd_ftbOhSSNsJ-lW1RUoIGuR8UEhu",
        "kamal patel","patelkamal115@gmail.com",8460298962,
        0.0,0.0,"PAN123NO","Chikhli",
        "BOB_CHIKHLI","ABC",0.0)
}

object bankDetails{
    val bankDetails = BankDetails("BOB12CHIKHLI6622","BOB",
                        "9876543210","IFSC1234","FIX")
}

object marketWatch{
    val marketWatch = MarketWatch("a","","","","",
        "","","","","","")
}

object holdingPosition{
    val holdingPosition = ProtFolioHP("","b","","")
}

object StaticData{



}
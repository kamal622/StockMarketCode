package com.kp.stockmarketcode.model

data class EquitReport(val date:String,val exch:String,val stock:String,
                       val price:String,val buySell:String,val qty:String,val status:String)
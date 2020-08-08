package com.kp.stockmarketcode.model

data class ProtFolioMW(val stock: String,
                       val price: String,
                       val buysell: String,
                       val PrevetClosePrice: String,
                       val open: String,
                       val lowPrice: String,
                       val highPrice: String,
                       val lastUpdate: String,
                       val change: String,
                       val persentage_change: String,
                       val action:String)
package com.adrianb.horoscapp.domain.model

import com.adrianb.horoscapp.R

sealed class HoroscopeInfo(val img:Int, val name:Int){
    object Aries:HoroscopeInfo(R.string.app_name)
}

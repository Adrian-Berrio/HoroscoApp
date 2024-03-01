package com.adrianb.horoscapp.data.providers

import com.adrianb.horoscapp.domain.model.HoroscopeInfo
import com.adrianb.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject


class HoroscopeProvider @Inject constructor(){
    fun getHoroscope(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Aquarius,
            Pisces
        )
    }
}
package com.adrianb.horoscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.adrianb.horoscapp.domain.model.HoroscopeInfo
import com.adrianb.horoscapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor() :ViewModel() {

    private var _Horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val Horoscope:StateFlow<List<HoroscopeInfo>> = _Horoscope

    init {
        _Horoscope.value = listOf(
            Aries, Taurus, Gemini
        )
    }

}
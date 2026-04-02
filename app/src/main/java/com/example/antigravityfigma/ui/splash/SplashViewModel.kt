package com.example.antigravityfigma.ui.splash

import androidx.lifecycle.viewModelScope
import com.example.antigravityfigma.core.ui.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : BaseViewModel() {

    private val _navigateToNext = MutableStateFlow(false)
    val navigateToNext = _navigateToNext.asStateFlow()

    init {
        viewModelScope.launch {
            delay(2500)
            _navigateToNext.value = true
        }
    }
}

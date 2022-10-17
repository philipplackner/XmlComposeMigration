package com.plcoding.xmlcomposemigration

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class FirstViewModel: ViewModel() {

    private val _state = MutableStateFlow(FirstState())
    val state = _state.asStateFlow()
}

class FirstState
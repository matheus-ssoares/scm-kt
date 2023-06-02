package com.br.scm.ui.RegisterScreen
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update



class RegisterScreenViewModel : ViewModel() {
    // Game UI state

    private val _uiState = MutableStateFlow(RegisterUiState())
    var uiState: StateFlow<RegisterUiState> = _uiState.asStateFlow()


    private fun loadingFunction(){

        _uiState.update { currentState -> currentState.copy(isLoading = true) }
    }

    fun registerUser(email: String, username: String, password: String): String {
        loadingFunction()

        return "uuid"
    }
}



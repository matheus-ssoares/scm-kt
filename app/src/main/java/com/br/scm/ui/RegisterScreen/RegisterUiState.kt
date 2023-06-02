package com.br.scm.ui.RegisterScreen

data class RegisterUiState(
    val email: String = "",
    val username: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val test: String = "Cadastrar"
)
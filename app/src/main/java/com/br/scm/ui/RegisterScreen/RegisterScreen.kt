package com.br.scm.ui.RegisterScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.br.scm.ui.Button.ButtonComponent
import com.br.scm.ui.LoginScreen.Input
import com.br.scm.ui.theme.cursiveTitleFontFamily

@Composable
fun RegisterScreen(
    registerScreenViewModel: RegisterScreenViewModel = viewModel(),
    onContinue: () -> Unit
) {

    val registerUiState by registerScreenViewModel.uiState.collectAsState()


    var email by remember { mutableStateOf("") }

    var username by remember { mutableStateOf("") }

    var password by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .padding(30.dp)
            .fillMaxSize()
    ) {

        Text(
            text = "Register",
            style = MaterialTheme.typography.h2,
            fontFamily = cursiveTitleFontFamily,
            color = MaterialTheme.colors.primary
        )


        Spacer(modifier = Modifier.height(30.dp))

        Column() {

            Input(label = "E-mail", text = email,isLoading = registerUiState.isLoading ,onTextChanged = { email = it })

            Spacer(modifier = Modifier.height(20.dp))

            Input(label = "Name", text = username,isLoading = registerUiState.isLoading , onTextChanged = { username = it })

            Spacer(modifier = Modifier.height(20.dp))

            Input(
                "Password",
                password,
                onTextChanged = { password = it },
                isLoading = registerUiState.isLoading,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation(),

            )
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {

            ButtonComponent(
                text = "Cadastrar",
                isLoading = registerUiState.isLoading,
                onClick = { registerScreenViewModel.registerUser(email, username, password) }
            )

        }
    }
}
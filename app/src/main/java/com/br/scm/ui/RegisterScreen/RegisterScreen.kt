package com.br.scm.ui.RegisterScreen

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.ui.unit.dp
import com.br.scm.ui.Button.ButtonComponent
import com.br.scm.ui.LoginScreen.Input
import com.br.scm.ui.theme.cursiveTitleFontFamily

@Composable
fun RegisterScreen(onContinue: () -> Unit, viewModel: TasksViewModel = hiltViewModel()) {

    var email by remember { mutableStateOf("") }

    var name by remember { mutableStateOf("") }

    var password by remember { mutableStateOf("") }


    Column(modifier = Modifier
        .padding(30.dp)
        .fillMaxSize()) {
        Text(
            text = "Register",
            style = MaterialTheme.typography.h2,
            fontFamily = cursiveTitleFontFamily,
            color = MaterialTheme.colors.primary
        )

        Spacer(modifier = Modifier.height(30.dp))

        Column() {
            Input(label = "E-mail", text = email, onTextChanged = {email = it})

            Spacer(modifier = Modifier.height(20.dp))

            Input(label = "Name", text = name, onTextChanged = {name = it})

            Spacer(modifier = Modifier.height(20.dp))

            Input(
                "Password",
                password,
                onTextChanged = { password = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )
        }
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            ButtonComponent(text = "Login", onClick = onContinue)
        }
    }
}
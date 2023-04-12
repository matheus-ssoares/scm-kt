package com.br.scm.ui.LoginScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.scm.ui.Button.ButtonComponent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import com.br.scm.ui.theme.cursiveTitleFontFamily


@Composable
fun LoginScreen(
    onNavigateToRegister: () -> Unit,
    onContinue: () -> Unit
) {

    var email by remember { mutableStateOf("") }

    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                bottom = 30.dp,
                start = 20.dp,
                top = 100.dp,
                end = 20.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Text(
            text = "Social Media",
            fontFamily = cursiveTitleFontFamily,
            fontSize = 60.sp,
            color = MaterialTheme.colors.primary
        )

        Column(modifier = Modifier.padding(bottom = 50.dp)) {

            Input("E-mail:",email, onTextChanged = {email = it})

            Spacer(modifier = Modifier.height(15.dp))

            Input(
                "Password",
                password,
                onTextChanged = {password = it},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()
            )
            TextButton(onClick = onNavigateToRegister) {
                Text(text = "I don't have an account")
            }
        }

        ButtonComponent(text = "Login", onClick = onContinue)

    }
}
package com.br.scm.ui.LoginScreen

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.br.scm.ui.Button.ButtonComponent
import com.br.scm.ui.theme.cursiveTitleFontFamily

@Preview("on")
@Composable
fun LoginScreen() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 30.dp, start = 20.dp, top = 100.dp, end = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Social Media",
            fontFamily = cursiveTitleFontFamily,
            fontSize = 60.sp,
            color = MaterialTheme.colors.primary
        )
        var email = "a"
        var password = ""

        Column(modifier = Modifier.padding(bottom = 50.dp)) {
            Input("E-mail:",email, onTextChanged = {newText -> email = newText})
            Spacer(modifier = Modifier.height(15.dp))
            Input("Password", password, onTextChanged = {newText -> password = newText})
        }
        ButtonComponent(text = "Continuar", onClick = {})

    }
}
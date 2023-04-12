package com.br.scm.ui.LoginScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun Input(
    label: String,
    text: String,
    onTextChanged: (String) -> Unit,
    keyboardOptions: KeyboardOptions? = null,
    visualTransformation: VisualTransformation? = null
) {
        OutlinedTextField(
            value = text,
            onValueChange = onTextChanged,
            label = { Text(text = label)},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = MaterialTheme.colors.primary,
            ),
            keyboardOptions = if (keyboardOptions != null) KeyboardOptions(keyboardType = KeyboardType.Password) else KeyboardOptions(),
            visualTransformation = visualTransformation ?: VisualTransformation.None
        )

}
package com.br.scm.ui.Button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.br.scm.ui.theme.poppinsRegular

@Composable
fun ButtonComponent(text: String, isLoading: Boolean = false, onClick: () -> Unit) {
    Button(
        onClick = {onClick()},
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(12.dp),
        enabled = isLoading.not()

    ) {
        if(isLoading){
            CircularProgressIndicator(
                modifier = Modifier.size(25.dp),
                color = Color.White,
            )
        } else {
            Text(text = text, fontFamily = poppinsRegular)
        }

    }
}
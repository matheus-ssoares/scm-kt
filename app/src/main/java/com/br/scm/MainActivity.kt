package com.br.scm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.br.scm.ui.AppNavHost
import com.br.scm.ui.theme.SocialMediaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SocialMediaTheme {

                val navController = rememberNavController()

                AppNavHost(navController = navController)
            }
        }
    }
}


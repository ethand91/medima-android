package com.example.formsample.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.formsample.component.CustomTopAppBar

@Composable
fun SignUp(navController: NavController) {
    Scaffold(
        topBar = { CustomTopAppBar(
            navController = navController,
            title = "SignUp",
            showBackIcon = true
        )},
        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 30.sp,
                    color = Color.Black
                )
            }
        }
    )
}
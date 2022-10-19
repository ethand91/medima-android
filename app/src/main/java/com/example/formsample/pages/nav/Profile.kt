package com.example.formsample.pages.nav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.formsample.component.CustomTopAppBar
import com.example.formsample.nav.BottomNavBar

@Composable
fun Profile(navController: NavController) {
    Scaffold(
        topBar = {
            CustomTopAppBar(
                navController = navController,
                title = "Profile",
                showBackIcon = false
            )
        },
        bottomBar = { BottomNavBar(navController = navController) }
    ) {
        Column (
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Profile")
        }
    }
}
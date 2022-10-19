package com.example.formsample.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.formsample.component.CustomTopAppBar
import com.example.formsample.nav.BottomNavBar

@Composable
fun Landing (navController: NavController) {
    Scaffold(
        topBar = { CustomTopAppBar(navController = navController, title = "Landing", showBackIcon = false) },
        bottomBar = { BottomNavBar(navController = navController) }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Medima")

            Box(
                modifier = Modifier
                    .padding(40.dp, 0.dp, 40.dp, 0.dp)
                    .background(Color.Red)) {
                Button(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "メールアドレスでログイン", color = Color.White)
                }
            }

            Box(
                modifier = Modifier
                    .padding(40.dp, 0.dp, 40.dp, 0.dp)
                    .background(Color.Magenta)) {
                Button(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "電話番号でログイン", color = Color.White)
                }
            }

            Text(text = "アカウントを持ちではない方")

            Box(
                modifier = Modifier
                    .padding(40.dp, 0.dp, 40.dp, 0.dp)
                    .background(Color.White)) {
                Button(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "電話番号でログイン", color = Color.Magenta)
                }
            }
        }
    }
}
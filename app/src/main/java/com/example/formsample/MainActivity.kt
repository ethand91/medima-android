package com.example.formsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.formsample.component.CustomTopAppBar
import com.example.formsample.nav.BottomNavBar
import com.example.formsample.nav.BottomNavItem
import com.example.formsample.pages.ForgotPassword
import com.example.formsample.pages.Landing
import com.example.formsample.pages.SignUp
import com.example.formsample.pages.nav.*
import com.example.formsample.ui.theme.FormSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ScreenMain()
                }
            }
        }
    }
}

@Composable
fun ScreenMain() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("landing") { Landing(navController = navController) }
        composable("login") { LoginPage(navController) }
        composable("signup") { SignUp(navController = navController)}
        composable("forgot-password") { ForgotPassword(navController = navController)}
        composable(BottomNavItem.Home.screenRoute) { Home(navController = navController) }
        composable(BottomNavItem.Search.screenRoute) { Search(navController = navController) }
        composable(BottomNavItem.Likes.screenRoute) { Likes(navController = navController) }
        composable(BottomNavItem.Chats.screenRoute) { Chats(navController = navController) }
        composable(BottomNavItem.Profile.screenRoute) { Profile(navController = navController) }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    FormSampleTheme {
       ScreenMain()
    }
}
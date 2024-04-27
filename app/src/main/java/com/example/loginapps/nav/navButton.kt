package com.example.loginapps.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginapps.*


sealed class navButton(
    val route : String
){
    object Main : navButton(route = "Main_act")
    object Phone : navButton(route = "Phone_act")
    object Verif : navButton(route = "Verif_act")
    object Information : navButton(route = "Information_act")
}





@Composable
fun RooteNav(
    navController : NavHostController
){
    NavHost(navController = navController, startDestination = navButton.Main.route){
        composable(
            route = navButton.Main.route
        ){
            AwalPage(navController)
        }
        composable(
            route = navButton.Phone.route
        ){
            AppWithPhone(navController)
        }
        composable(
            route = navButton.Verif.route
        ){
            AppVerifNumber(navController)
        }
        composable(
            route = navButton.Information.route
        ){
            AppInformation(navController)
        }
    }
}
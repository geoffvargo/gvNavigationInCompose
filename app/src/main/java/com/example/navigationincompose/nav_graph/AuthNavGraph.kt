package com.example.navigationincompose.nav_graph

import androidx.navigation.*
import androidx.navigation.compose.*
import com.example.navigationincompose.*
import com.example.navigationincompose.screen.*


fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
	navigation(startDestination = Screen.Login.route,
	           route = AUTHENTICATION_ROUTE) {
		composable(route = Screen.Login.route) {
			LoginScreen(navHostController = navController)
		}
		composable(route = Screen.SignUp.route) {
			SignUpScreen(navHostController = navController)
		}
	}
	
}

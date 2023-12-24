package com.example.navigationincompose.nav_graph

import androidx.compose.runtime.*
import androidx.navigation.*
import androidx.navigation.compose.*
import com.example.navigationincompose.*

@Composable
fun SetUpNavGraph(navController: NavHostController) {
	NavHost(navController = navController,
	        startDestination = HOME_ROUTE,
	        route = ROOT_ROUTE) {
		homeNavGraph(navController = navController)
		authNavGraph(navController = navController)
	}
}

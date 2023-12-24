package com.example.navigationincompose.nav_graph

import android.util.*
import androidx.navigation.*
import androidx.navigation.compose.*
import com.example.navigationincompose.*
import com.example.navigationincompose.screen.*

fun NavGraphBuilder.homeNavGraph(navController: NavHostController) {
	navigation(startDestination = Screen.Home.route,
	           route = HOME_ROUTE) {
		composable(route = Screen.Home.route) {
			HomeScreen(navController)
		}
		composable(route = Screen.Detail.route,
		           arguments = listOf(navArgument(name = DETAIL_ARGUMENT_KEY) { type = NavType.IntType },
		                              navArgument(name = DETAIL_ARGUMENT_KEY2) { type = NavType.StringType })) {
			val result = navController.previousBackStackEntry?.savedStateHandle?.get<Person>("person")
			
			Log.d("Args", "the argument is ${it.arguments?.getInt(DETAIL_ARGUMENT_KEY)}")
			Log.d("Args", "the argument is ${it.arguments?.getString(DETAIL_ARGUMENT_KEY2)}")
			Log.d("Args", "the result  is ${result?.firstName} ${result?.secondName}")
			
			
			DetailsScreen(navController)
		}
	}
}

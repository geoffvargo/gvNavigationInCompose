package com.example.navigationincompose

import android.os.*
import androidx.activity.*
import androidx.activity.compose.*
import androidx.compose.material3.*
import androidx.navigation.*
import androidx.navigation.compose.*
import com.example.navigationincompose.nav_graph.*
import com.example.navigationincompose.ui.theme.*

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
	
	private lateinit var navController: NavHostController
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			NavigationInComposeTheme {
				// A surface container using the 'background' color from the theme
				navController = rememberNavController()
				SetUpNavGraph(navController = navController)
			}
		}
	}
}

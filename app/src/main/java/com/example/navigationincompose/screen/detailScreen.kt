package com.example.navigationincompose.screen


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.tooling.preview.*
import androidx.navigation.*
import androidx.navigation.compose.*
import com.example.navigationincompose.*

@Composable
fun DetailsScreen(navHostController: NavHostController) {
	Box(modifier = Modifier.fillMaxSize(),
	    contentAlignment = Alignment.Center) {
		Text(modifier = Modifier.clickable {
			// navHostController.popBackStack() // this would remove the current screen from the application screen stack
			navHostController.navigate(Screen.Home.route) {
				popUpTo(Screen.Home.route) {
					inclusive = true
				}
			}
		},
		     text = "Details",
		     color = Color.Red,
		     fontSize = MaterialTheme.typography.h3.fontSize,
		     fontWeight = FontWeight.Bold)
	}
}

@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview() {
	DetailsScreen(navHostController = rememberNavController())
}

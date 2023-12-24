package com.example.navigationincompose.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.unit.*
import androidx.navigation.*
import androidx.navigation.compose.*
import com.example.navigationincompose.*

@Composable
fun LoginScreen(navHostController: NavHostController) {
	Column(modifier = Modifier.fillMaxSize(),
	       verticalArrangement = Arrangement.Center,
	       horizontalAlignment = Alignment.CenterHorizontally) {
		Text(modifier = Modifier.clickable { navHostController.navigate(route = Screen.SignUp.route) },
		     text = "Login",
		     fontSize = MaterialTheme.typography.h3.fontSize,
		     color = Color.Magenta,
		     fontWeight = FontWeight.ExtraBold)
		Text(modifier = Modifier
				.padding(150.dp)
				.clickable {
					//going back to other navigation graph
					navHostController.navigate(HOME_ROUTE) { popUpTo(HOME_ROUTE) }
				},
		     text = "Go back",
		     fontSize = MaterialTheme.typography.h5.fontSize,
		     fontWeight = FontWeight.Medium,
		     color = Color.Black)
	}
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
	LoginScreen(navHostController = rememberNavController())
}

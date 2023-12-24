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


@Composable
fun SignUpScreen(navHostController: NavHostController) {
	Column(modifier = Modifier.fillMaxSize(),
	       verticalArrangement = Arrangement.Center,
	       horizontalAlignment = Alignment.CenterHorizontally) {
		Text(modifier = Modifier.clickable { navHostController.popBackStack() },
		     text = "SignUp",
		     fontSize = MaterialTheme.typography.h3.fontSize,
		     color = Color.Cyan,
		     fontWeight = FontWeight.ExtraBold)
	}
}

@Preview(showBackground = true)
@Composable
fun SingUpScreenPreview() {
	LoginScreen(navHostController = rememberNavController())
}

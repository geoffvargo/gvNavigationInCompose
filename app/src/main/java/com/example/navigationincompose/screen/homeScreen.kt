package com.example.navigationincompose.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.unit.*
import androidx.navigation.*
import androidx.navigation.compose.*
import com.example.navigationincompose.*


@Composable
fun HomeScreen(navHostController: NavHostController) {
	Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
		Text(modifier = Modifier.clickable {
            val person = Person(firstName = "Hi!!!", secondName = "From other side")
            //navHostController.navigate(route = Screen.Detail.passId(5)) to call for single value
            navHostController.currentBackStackEntry?.savedStateHandle?.set(key = "person", value = person)
            navHostController.navigate(route = Screen.Detail.passNameAndId(10, "IamStupid"))
        },
             text = "Home",
             color = MaterialTheme.colors.primary,
             fontSize = MaterialTheme.typography.h3.fontSize,
             fontWeight = FontWeight.Bold)
		Text(modifier = Modifier
                .padding(top = 150.dp)
                .clickable {
                    //Navigate to other NavGraph
                    navHostController.navigate(AUTHENTICATION_ROUTE)
                },
             text = "Login/SignUp",
             fontSize = MaterialTheme.typography.h5.fontSize,
             fontWeight = FontWeight.Black)
	}
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
	HomeScreen(navHostController = rememberNavController())
}

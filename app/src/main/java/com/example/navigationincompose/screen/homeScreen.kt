package com.example.navigationincompose.screen

import android.annotation.*
import android.app.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.platform.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.tooling.preview.*
import androidx.compose.ui.unit.*
import androidx.navigation.*
import androidx.navigation.compose.*
import com.example.navigationincompose.*
import com.example.navigationincompose.Person


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun HomeScreen(navHostController: NavHostController) {
	val activity = LocalContext.current as? Activity
	Scaffold(topBar = {
		CenterAlignedTopAppBar(title = { Text("My App") },
		                       navigationIcon = {
			                       IconButton(onClick = { activity?.finish() }) {
				                       Icon(imageVector = Icons.Filled.ArrowBack,
				                            contentDescription = "Back")
			                       }
		                       },
		                       actions = {
			                       IconButton(onClick = { navHostController.navigate(AUTHENTICATION_ROUTE) }) {
				                       Icon(imageVector = Icons.Filled.Menu,
				                            contentDescription = "Settings")
			                       }
		                       },
		                       scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState()))}) {
			Text(modifier = Modifier.clickable {
				val person = Person(firstName = "Hi!!!", secondName = "From other side")
				//navHostController.navigate(route = Screen.Detail.passId(5)) to call for single value
				navHostController.currentBackStackEntry?.savedStateHandle?.set(key = "person", value = person)
				navHostController.navigate(route = Screen.Detail.passNameAndId(10, "IamStupid"))
			},
			     text = "Home",
//			     color = MaterialTheme().colors.primary,
//			     fontSize = MaterialTheme().typography.h3.fontSize,
			     fontWeight = FontWeight.Bold)
			Text(modifier = Modifier
					.padding(top = 150.dp)
					.clickable {
						//Navigate to other NavGraph
						navHostController.navigate(AUTHENTICATION_ROUTE)
					},
			     text = "Login/SignUp",
//			     fontSize = MaterialTheme.typography.h5.fontSize,
			     fontWeight = FontWeight.Black)
		}
	}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
	HomeScreen(navHostController = rememberNavController())
}

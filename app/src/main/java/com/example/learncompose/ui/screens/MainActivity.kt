package com.example.learncompose.ui.screens

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = MaterialTheme.colors.background) {
                val bottomItems = listOf("list", "search", "push")
                val navController = rememberNavController()

                Scaffold (
                    bottomBar = {
                        BottomNavigation {
                            bottomItems.forEach { screen ->
                                BottomNavigationItem(
                                    selected = false,
                                    onClick = {
                                        navController.navigate(screen)
                                    },
                                    label = { Text(screen) },
                                    icon = {

                                    })
                            }
                        }
                    }
                ) {  }
                    NavHost(navController = navController, startDestination = "list") {
                        composable("list") { Text(text = "list", modifier = Modifier.padding(24.dp)) }
                        composable("search") { Text(text = "search", modifier = Modifier.padding(24.dp)) }
                        composable("push") { Text(text = "push", modifier = Modifier.padding(24.dp)) }
                        it.toString()
                    }


            }
        }
    }
}
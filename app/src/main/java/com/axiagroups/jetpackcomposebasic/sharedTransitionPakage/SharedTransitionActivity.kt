package com.axiagroups.jetpackcomposebasic.sharedTransitionPakage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.axiagroups.jetpackcomposebasic.R
import com.axiagroups.jetpackcomposebasic.ui.theme.JetpackComposeBasicTheme

class SharedTransitionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeBasicTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "firstScreen"
                    ) {
                        composable("firstScreen") {
                            animationFirstScreen(
                                onItemClick = { resId: Int ->
                                navController.navigate("secondScreen/$resId")
                            })
                        }
                        composable(
                            route = "secondScreen/{resId}",
                            arguments = listOf(
                                navArgument("resID") {
                                    type = NavType.IntType
                                }
                            )
                        ) {
                            val resID = it.arguments?.getInt("resID") ?: 0
                            animationSecondScreen(resId = resID)
                        }
                    }
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            text = "SharedTransitionActivity Activity", fontSize = 30.sp
                        )
                        Image(
                            painter = painterResource(id = R.drawable.walton_hi_tech_industries_limited_logo),
                            contentDescription = null,
                        )
                    }
                }
            }
        }
    }
}

// https://youtu.be/mE5bLb42_Os?si=tGTaM6WTwaZrSfVQ&t=508
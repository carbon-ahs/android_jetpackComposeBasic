package com.axiagroups.jetpackcomposebasic

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.axiagroups.jetpackcomposebasic.sharedTransitionPakage.SharedTransitionActivity
import com.axiagroups.jetpackcomposebasic.ui.theme.JetpackComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeBasicTheme {
                var count by remember {
                    mutableIntStateOf(0)
                }
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = count.toString(), fontSize = 30.sp
                        )
                        Button(
                            onClick = {
                                count++
                            }
                        ) {
                            Text(text = "+")
                        }
                        Button(
                            onClick = {
                                Intent(applicationContext, SecondActivity::class.java).also {
                                    startActivity(it)
                                }
                            }
                        ) {
                            Text(text = "Click Me...")
                        }
                        Button(
                            onClick = {
                                Intent(applicationContext, LazyColumActivity::class.java).also {
                                    startActivity(it)
                                }
                            }
                        ) {
                            Text(text = "Lazy Colum")
                        }
                        Button(
                            onClick = {
                                Intent(applicationContext, SharedTransitionActivity::class.java).also {
                                    startActivity(it)
                                }
                            }
                        ) {
                            Text(text = "Shared Element Transition")
                        }
                        Button(
                            onClick = {
                                Intent(applicationContext, NavControllerActivity::class.java).also {
                                    startActivity(it)
                                }
                            }
                        ) {
                            Text(text = "Nav Controller")
                        }

                    }
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .background(Color.Blue)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello $name!!!!",
            modifier = modifier
                .background(Color.Gray),
            //            .padding(16.dp),
            color = Color.Red,
            fontSize = 30.sp,
        )
        Text(
            text = "Some Other Text",
            modifier = modifier,
            color = Color.Red,
            fontSize = 30.sp,
        )
    }
}

@Composable
fun ImageContent(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier.background(Color.Red)
        )
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = null,
            modifier = Modifier.align(Alignment.CenterEnd)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeBasicTheme {
    }
}
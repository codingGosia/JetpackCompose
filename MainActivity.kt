package com.gosia.myapplication

import android.os.Bundle
import android.provider.Telephony
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gosia.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(15.dp, Color.Green)
                    .padding(15.dp)
                    .border(30.dp, Color.Red)
                    .padding(30.dp)
                    .border(50.dp, Color.Yellow)
                    .padding(50.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                    ){
                Text(text = "Hello")
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Followers!", modifier = Modifier.clickable {
                    })
            }



          }

        }
    }


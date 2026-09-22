package edu.iau.cshj.csc402.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Task 6

@Composable
fun WelcomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ScreenBackground)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Navy)
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 14.dp,
                    bottom = 12.dp
                )
        ) {

            Text(
                text = "CSC 402 Lab 2",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Task 6 - My First Screen",
                color = Color.LightGray,
                fontSize = 11.sp
            )
        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Navy),
                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "MA",
                        color = AndroidGreen,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }

                Spacer(
                    modifier = Modifier.height(12.dp)
                )

                Text(
                    text = "Hello, Jubail!",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Navy
                )

                Spacer(
                    modifier = Modifier.height(4.dp)
                )

                Text(
                    text = "Manar Alanzi",
                    color = Color.Gray,
                    fontSize = 13.sp
                )

                Text(
                    text = "Welcome to Mobile Application Programming",
                    color = Color.Gray,
                    fontSize = 12.sp
                )

                Spacer(
                    modifier = Modifier.height(12.dp)
                )

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(18.dp))
                        .background(
                            AndroidGreen.copy(alpha = 0.20f)
                        )
                        .padding(
                            horizontal = 14.dp,
                            vertical = 6.dp
                        )
                ) {

                    Text(
                        text = "Built with Jetpack Compose",
                        color = Navy,
                        fontSize = 11.sp
                    )
                }
            }
        }

        Spacer(
            modifier = Modifier.height(14.dp)
        )

        Text(
            text = "Everything in this screen is drawn by one composable function.",
            modifier = Modifier.padding(horizontal = 16.dp),
            color = Color.Gray,
            fontSize = 11.sp
        )
    }
}
package edu.iau.cshj.csc402.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Task 8

@Composable
fun AttendanceCounter() {

    var count by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ScreenBackground),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Navy)
                .padding(16.dp)
        ) {
            Text(
                text = "Attendance Counter",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Task 8 - remember + state",
                color = Color.LightGray,
                fontSize = 12.sp
            )
        }

        Spacer(
            modifier = Modifier.height(28.dp)
        )

        Text(
            text = "STUDENTS PRESENT",
            color = Color.Gray,
            fontSize = 12.sp
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Card(
            modifier = Modifier
                .width(180.dp)
                .height(110.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = count.toString(),
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    color = Navy
                )
            }
        }

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Row {

            Button(
                onClick = {
                    if (count > 0) {
                        count--
                    }
                },
                enabled = count > 0
            ) {
                Text("-")
            }

            Spacer(
                modifier = Modifier.width(24.dp)
            )

            Button(
                onClick = {
                    count++
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = AndroidGreen,
                    contentColor = Navy
                )
            ) {
                Text("+")
            }
        }

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        Button(
            onClick = {
                count = 0
            },
            enabled = count > 0
        ) {
            Text("Reset")
        }

        Spacer(
            modifier = Modifier.height(18.dp)
        )

        Text(
            text = if (count == 0) {
                "Tap + to check a student in."
            } else {
                "$count of 30 students checked in."
            },
            color = Color.Gray
        )
    }
}
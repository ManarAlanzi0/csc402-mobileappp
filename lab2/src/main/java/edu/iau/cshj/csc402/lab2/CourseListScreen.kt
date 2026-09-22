package edu.iau.cshj.csc402.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Task 10

data class Course(
    val code: String,
    val title: String,
    val credits: Int,
    val days: String
)

@Composable
fun CourseRow(course: Course) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .width(5.dp)
                    .height(55.dp)
                    .background(AndroidGreen)
            )

            Spacer(
                modifier = Modifier.width(12.dp)
            )

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = course.code,
                    fontWeight = FontWeight.Bold,
                    color = Navy
                )

                Text(
                    text = course.title,
                    fontSize = 13.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = course.days,
                    color = Color.Gray,
                    fontSize = 11.sp
                )
            }

            Text(
                text = "${course.credits} cr",
                color = Navy,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun CourseListScreen() {

    val courses = listOf(
        Course("CSC 402", "Mobile Application Programming", 3, "Mon / Wed"),
        Course("CSC 311", "Database Systems", 4, "Sun / Tue"),
        Course("CSC 340", "Operating Systems", 3, "Mon / Wed"),
        Course("MATH 202", "Discrete Mathematics", 3, "Sun / Thu"),
        Course("ENG 214", "Technical Writing", 2, "Tue"),
        Course("PHYS 105", "General Physics II", 4, "Sun / Tue"),
        Course("ISLM 101", "Islamic Culture", 2, "Thu")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ScreenBackground)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Navy)
                .padding(16.dp)
        ) {

            Text(
                text = "My Courses",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Task 10 - LazyColumn (${courses.size} courses)",
                color = Color.LightGray,
                fontSize = 12.sp
            )
        }

        LazyColumn(
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            items(courses) { course ->
                CourseRow(course)
            }
        }
    }
}
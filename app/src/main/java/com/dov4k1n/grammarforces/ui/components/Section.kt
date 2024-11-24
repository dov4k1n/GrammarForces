package com.dov4k1n.grammarforces.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dov4k1n.grammarforces.ui.theme.GrammarForcesTheme

@Preview
@Composable
fun PreviewSection() {
    val lessons = listOf(
        Lesson("Present Simple", "Действие происходит в настоящем"),
        Lesson("Past Simple", "Действие произошло в прошлом"),
        Lesson("Future Simple", "Действие произойдёт в будущем")
    )

    val tenses = SectionData(
        title = "Времена глагола",
        lessons = lessons
    )

    GrammarForcesTheme(darkTheme = true) {
        Surface(
            Modifier.fillMaxSize()
        ) {
            Section(sectionData = tenses)
            Section(sectionData = tenses)
            Section(sectionData = tenses)
        }
    }
}

data class Lesson(
    val title: String,
    val subtitle: String
)

data class SectionData(
    val title: String = "",
    val lessons: List<Lesson> = listOf()
)

@Composable
fun Section(
    modifier: Modifier = Modifier,
    sectionData: SectionData
) {
    Column(
        modifier
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = sectionData.title,
            style = typography.headlineMedium,
            color = colorScheme.onSurface,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        sectionData.lessons.forEach { lesson ->
            val bottomPadding = if (lesson != sectionData.lessons.last()) 24.dp else 0.dp

            Row(
                modifier = Modifier
                    .padding(bottom = bottomPadding)
            ) {
                Icon(
                    imageVector = Icons.Outlined.PlayArrow,
                    contentDescription = null,
                    tint = colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(end = 16.dp)
                )
                Column {
                    Text(
                        text = lesson.title,
                        style = typography.bodyLarge,
                        color = colorScheme.onSurface
                    )
                    Text(
                        text = lesson.subtitle,
                        style = typography.bodyMedium,
                        color = colorScheme.onSurfaceVariant
                    )
                }
            }
        }

    }
}

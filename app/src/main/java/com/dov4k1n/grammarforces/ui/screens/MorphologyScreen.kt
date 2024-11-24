package com.dov4k1n.grammarforces.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dov4k1n.grammarforces.ui.BottomAppBar
import com.dov4k1n.grammarforces.ui.TopAppBar
import com.dov4k1n.grammarforces.ui.components.BottomAppBarRoutes
import com.dov4k1n.grammarforces.ui.components.Lesson
import com.dov4k1n.grammarforces.ui.components.Section
import com.dov4k1n.grammarforces.ui.components.SectionData
import com.dov4k1n.grammarforces.ui.theme.GrammarForcesTheme


@Preview
@Composable
fun PreviewMorphologyScreen() {
    GrammarForcesTheme(darkTheme = true) {
        MorphologyScreen(
            currentTabRoute = BottomAppBarRoutes.MorphologyRoute
        )
    }
}

private fun getMorphologySectionDataList(): List<SectionData> {
    val articleLessons = listOf(
        Lesson("Артикль", "Неопределённый \"a / an\", определённый \"the\"")
    )

    val article = SectionData(
        title = "Основы",
        lessons = articleLessons
    )

    val tensesLessons = listOf(
        Lesson("Present Simple", "Действие происходит в настоящем"),
        Lesson("Past Simple", "Действие произошло в прошлом"),
        Lesson("Future Simple", "Действие произойдёт в будущем")
    )

    val tenses = SectionData(
        title = "Времена глагола",
        lessons = tensesLessons
    )

    val irregularVerbsLessons = listOf(
        Lesson("Выучить через упражнения", "Не подчиняются обычным правилам"),
    )

    val irregularVerbs = SectionData(
        title = "Неправильные глаголы",
        lessons = irregularVerbsLessons
    )

    return listOf(
        article,
        tenses,
        irregularVerbs
    )
}

@Composable
fun MorphologyScreen(
    currentTabRoute: BottomAppBarRoutes,
    onNavigateToMorphology: () -> Unit = {},
    onNavigateToSyntax: () -> Unit = {},
    onNavigateToLexicon: () -> Unit = {},
) {
    val sectionDataList = getMorphologySectionDataList()

    Scaffold(
        topBar = {
            TopAppBar()
        },
        bottomBar = {
            BottomAppBar(
                currentTabRoute = currentTabRoute,
                onNavigateToMorphology = onNavigateToMorphology,
                onNavigateToSyntax = onNavigateToSyntax,
                onNavigateToLexicon = onNavigateToLexicon
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            sectionDataList.forEach { sectionData ->
                val bottomPadding = if (sectionData != sectionDataList.last()) 48.dp else 0.dp

                Section(
                    sectionData = sectionData,
                    modifier = Modifier
                        .padding(bottom = bottomPadding)
                )
            }
        }
    }
}
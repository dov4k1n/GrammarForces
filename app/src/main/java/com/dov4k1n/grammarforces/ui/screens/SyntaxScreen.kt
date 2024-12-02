package com.dov4k1n.grammarforces.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dov4k1n.grammarforces.ui.HomeBottomAppBar
import com.dov4k1n.grammarforces.ui.HomeTopAppBar
import com.dov4k1n.grammarforces.ui.components.BottomAppBarRoutes
import com.dov4k1n.grammarforces.ui.components.Lesson
import com.dov4k1n.grammarforces.ui.components.Section
import com.dov4k1n.grammarforces.ui.components.SectionData
import com.dov4k1n.grammarforces.ui.theme.GrammarForcesTheme


@Preview
@Composable
fun PreviewSyntaxScreen() {
    GrammarForcesTheme(darkTheme = true) {
        SyntaxScreen(
            currentTabRoute = BottomAppBarRoutes.SyntaxRoute
        )
    }
}

private fun getSyntaxSectionDataList(): List<SectionData> {
    val wordOrderLessons = listOf(
        Lesson("Представьтесь", "Научитесь говорить \"привет\"")
    )

    val wordOrder = SectionData(
        title = "Порядок слов",
        lessons = wordOrderLessons
    )

    return listOf(
        wordOrder
    )
}

@Composable
fun SyntaxScreen(
    currentTabRoute: BottomAppBarRoutes,
    onNavigateToMorphology: () -> Unit = {},
    onNavigateToSyntax: () -> Unit = {},
    onNavigateToLexicon: () -> Unit = {},
) {
    val sectionDataList = getSyntaxSectionDataList()

    Scaffold(
        topBar = {
            HomeTopAppBar()
        },
        bottomBar = {
            HomeBottomAppBar(
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
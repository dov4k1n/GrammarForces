package com.dov4k1n.grammarforces.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dov4k1n.grammarforces.ui.HomeBottomAppBar
import com.dov4k1n.grammarforces.ui.HomeTopAppBar
import com.dov4k1n.grammarforces.ui.components.BottomAppBarRoutes
import com.dov4k1n.grammarforces.ui.theme.GrammarForcesTheme


@Preview
@Composable
fun PreviewLexiconScreen() {
    GrammarForcesTheme(darkTheme = true) {
        LexiconScreen(
            currentTabRoute = BottomAppBarRoutes.LexiconRoute
        )
    }
}

@Composable
fun LexiconScreen(
    currentTabRoute: BottomAppBarRoutes,
    onNavigateToMorphology: () -> Unit = {},
    onNavigateToSyntax: () -> Unit = {},
    onNavigateToLexicon: () -> Unit = {},
) {
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

        }
    }
}
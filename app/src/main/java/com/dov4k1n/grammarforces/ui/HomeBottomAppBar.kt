package com.dov4k1n.grammarforces.ui

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.dov4k1n.grammarforces.ui.components.BottomAppBarRoutes
import com.dov4k1n.grammarforces.ui.components.bottomAppBarTabsList
import com.dov4k1n.grammarforces.ui.theme.GrammarForcesTheme

@Preview
@Composable
fun PreviewBottomAppBar() {
    GrammarForcesTheme(darkTheme = true) {
        Surface {
            HomeBottomAppBar(
                currentTabRoute = BottomAppBarRoutes.MorphologyRoute
            )
        }
    }
}

@Composable
fun HomeBottomAppBar(
    currentTabRoute: BottomAppBarRoutes,
    onNavigateToMorphology: () -> Unit = {},
    onNavigateToSyntax: () -> Unit = {},
    onNavigateToLexicon: () -> Unit = {},
) {
    NavigationBar {
        bottomAppBarTabsList.forEach { tab ->
            NavigationBarItem(
                selected = tab.route == currentTabRoute,
                onClick = when (tab.route) {
                    BottomAppBarRoutes.MorphologyRoute -> onNavigateToMorphology
                    BottomAppBarRoutes.SyntaxRoute -> onNavigateToSyntax
                    else -> onNavigateToLexicon
                },
                icon = {
                    Icon(
                        imageVector = if (tab.route == currentTabRoute) tab.selectedIcon else tab.unselectedIcon,
                        contentDescription = stringResource(tab.title)
                    )
                },
                label = {
                    Text(
                        text = stringResource(tab.title),
                        style = typography.labelMedium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                colors = NavigationBarItemColors(
                    selectedIconColor = colorScheme.onSecondaryContainer,
                    selectedTextColor = colorScheme.onSurface,
                    selectedIndicatorColor = colorScheme.surfaceBright,
                    unselectedIconColor = colorScheme.outline,
                    unselectedTextColor = colorScheme.outline,
                    disabledIconColor = colorScheme.outline,
                    disabledTextColor = colorScheme.outline
                )
            )
        }
    }
}
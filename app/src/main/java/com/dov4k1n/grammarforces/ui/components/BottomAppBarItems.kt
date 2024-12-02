package com.dov4k1n.grammarforces.ui.components

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.automirrored.outlined.Article
import androidx.compose.material.icons.filled.Construction
import androidx.compose.material.icons.filled.Subtitles
import androidx.compose.material.icons.outlined.Construction
import androidx.compose.material.icons.outlined.Subtitles
import androidx.compose.ui.graphics.vector.ImageVector
import com.dov4k1n.grammarforces.R
import kotlinx.serialization.Serializable

@Serializable
sealed class BottomAppBarRoutes {
    @Serializable data object MorphologyRoute : BottomAppBarRoutes()
    @Serializable data object SyntaxRoute : BottomAppBarRoutes()
    @Serializable data object LexiconRoute : BottomAppBarRoutes()
}


sealed class BottomAppBarItems(
    @Serializable val route: Any,
    @StringRes val title: Int,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
) {
    data object Morphology : BottomAppBarItems(
        route = BottomAppBarRoutes.MorphologyRoute,
        title = R.string.morphology,
        selectedIcon = Icons.Filled.Construction,
        unselectedIcon = Icons.Outlined.Construction
    )

    data object Syntax : BottomAppBarItems(
        route = BottomAppBarRoutes.SyntaxRoute,
        title = R.string.syntax,
        selectedIcon = Icons.Filled.Subtitles,
        unselectedIcon = Icons.Outlined.Subtitles
    )

    data object Lexicon : BottomAppBarItems(
        route = BottomAppBarRoutes.LexiconRoute,
        title = R.string.lexicon,
        selectedIcon = Icons.AutoMirrored.Filled.Article,
        unselectedIcon = Icons.AutoMirrored.Outlined.Article
    )
}

val bottomAppBarTabsList = listOf(
    BottomAppBarItems.Morphology,
    BottomAppBarItems.Syntax,
    BottomAppBarItems.Lexicon,
)
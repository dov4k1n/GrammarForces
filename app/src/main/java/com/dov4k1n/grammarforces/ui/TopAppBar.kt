package com.dov4k1n.grammarforces.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dov4k1n.grammarforces.R
import com.dov4k1n.grammarforces.ui.theme.GrammarForcesTheme

@Preview
@Composable
fun PreviewTopAppBar() {
    GrammarForcesTheme(darkTheme = true) {
        Surface() {
            TopAppBar()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    navController: NavController = rememberNavController()
) {
    CenterAlignedTopAppBar(
        title = {
            Row {
                Text(
                    text = stringResource(id = R.string.app_name),
                    style = typography.headlineLarge,
                    color = colorScheme.primary
                )
                Text(
                    text = stringResource(id = R.string.app_version),
                    style = typography.labelMedium,
                    color = colorScheme.onSurfaceVariant
                )
            }
        },
        colors = TopAppBarColors(
            containerColor = Color.Transparent,
            scrolledContainerColor = Color.Transparent,
            navigationIconContentColor = colorScheme.onSurface,
            titleContentColor = Color.Transparent,
            actionIconContentColor = colorScheme.onSurface
        ),
    )
}
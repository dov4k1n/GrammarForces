package com.dov4k1n.grammarforces

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dov4k1n.grammarforces.ui.components.BottomAppBarRoutes
import com.dov4k1n.grammarforces.ui.screens.LexiconScreen
import com.dov4k1n.grammarforces.ui.screens.MorphologyScreen
import com.dov4k1n.grammarforces.ui.screens.SyntaxScreen

@Composable
fun GrammarForces() {
    Scaffold { AppNavHost(modifier = Modifier.padding(it)) }
}

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = BottomAppBarRoutes.MorphologyRoute,
    ) {
        composable<BottomAppBarRoutes.MorphologyRoute> {
            MorphologyScreen(
                currentTabRoute = BottomAppBarRoutes.MorphologyRoute,
                onNavigateToMorphology = { },
                onNavigateToSyntax = { navController.navigate(route = BottomAppBarRoutes.SyntaxRoute) },
                onNavigateToLexicon = { navController.navigate(route = BottomAppBarRoutes.LexiconRoute) },
            )
        }
        composable<BottomAppBarRoutes.SyntaxRoute> {
            SyntaxScreen(
                currentTabRoute = BottomAppBarRoutes.SyntaxRoute,
                onNavigateToMorphology = { navController.navigate(route = BottomAppBarRoutes.MorphologyRoute) },
                onNavigateToSyntax = {  },
                onNavigateToLexicon = { navController.navigate(route = BottomAppBarRoutes.LexiconRoute) },)
        }
        composable<BottomAppBarRoutes.LexiconRoute> {
            LexiconScreen(
                currentTabRoute = BottomAppBarRoutes.LexiconRoute,
                onNavigateToMorphology = { navController.navigate(route = BottomAppBarRoutes.MorphologyRoute) },
                onNavigateToSyntax = { navController.navigate(route = BottomAppBarRoutes.SyntaxRoute) },
                onNavigateToLexicon = {  }
            )
        }
    }
}
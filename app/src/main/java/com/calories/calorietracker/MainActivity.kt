package com.calories.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.calories.calorietracker.navigation.navigate
import com.calories.calorietracker.ui.theme.CalorieTrackerTheme
import com.calories.core.navigation.Route
import com.calories.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalorieTrackerTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Route.WELCOME) {
                    composable(Route.WELCOME) {
                        WelcomeScreen(onNavigate = navController::navigate)
                    }

                    composable(Route.AGE) {

                    }

                    composable(Route.GENDER) {

                    }

                    composable(Route.HEIGHT) {

                    }

                    composable(Route.WEIGHT) {

                    }

                    composable(Route.NUTRIENT_GOAL) {

                    }

                    composable(Route.ACTIVITY) {

                    }

                    composable(Route.GOAL) {

                    }

                    composable(Route.TRACKER_OVERVIEW) {

                    }

                    composable(Route.SEARCH) {

                    }
                }
            }
        }
    }
}
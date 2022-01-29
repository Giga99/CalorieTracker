package com.calories.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.calories.calorietracker.navigation.navigate
import com.calories.calorietracker.ui.theme.CalorieTrackerTheme
import com.calories.core.navigation.Route
import com.calories.onboarding_presentation.age.AgeScreen
import com.calories.onboarding_presentation.gender.GenderScreen
import com.calories.onboarding_presentation.height.HeightScreen
import com.calories.onboarding_presentation.weight.WeightScreen
import com.calories.onboarding_presentation.welcome.WelcomeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalorieTrackerTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                Scaffold(modifier = Modifier.fillMaxSize(), scaffoldState = scaffoldState) {
                    NavHost(navController = navController, startDestination = Route.WELCOME) {
                        composable(Route.WELCOME) {
                            WelcomeScreen(onNavigate = navController::navigate)
                        }

                        composable(Route.AGE) {
                            AgeScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::navigate
                            )
                        }

                        composable(Route.GENDER) {
                            GenderScreen(onNavigate = navController::navigate)
                        }

                        composable(Route.HEIGHT) {
                            HeightScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::navigate
                            )
                        }

                        composable(Route.WEIGHT) {
                            WeightScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::navigate
                            )
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
}

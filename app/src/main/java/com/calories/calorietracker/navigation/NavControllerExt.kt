package com.calories.calorietracker.navigation

import androidx.navigation.NavController
import com.calories.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}
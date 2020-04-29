package com.putya.idn.sleeptrackerqualitycoroutines.sleep_tracker

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.putya.idn.sleeptrackerqualitycoroutines.database.SleepDatabaseDAO

class SleepTrackerViewModelFactory(
    private val dataSource: SleepDatabaseDAO,
    private val application: Application

) : ViewModelProvider.Factory {
    @Suppress("unchecked")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SleepTrackerViewModel::class.java)) {
            return SleepTrackerViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown viewModel Class")
    }
}
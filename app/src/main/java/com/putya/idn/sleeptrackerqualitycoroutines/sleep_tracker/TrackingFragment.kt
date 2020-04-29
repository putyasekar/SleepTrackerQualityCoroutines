package com.putya.idn.sleeptrackerqualitycoroutines.sleep_tracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.putya.idn.sleeptrackerqualitycoroutines.R
import com.putya.idn.sleeptrackerqualitycoroutines.database.SleepDatabase
import com.putya.idn.sleeptrackerqualitycoroutines.databinding.FragmentTrackingBinding

/**
 * A simple [Fragment] subclass.
 */
class TrackingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentTrackingBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_tracking, container, false)

        val application = requireNotNull(this.activity).application
        val dataSource = SleepDatabase.getInstance(application).sleepDatabaseDao
        val viewModelFactory = SleepTrackerViewModelFactory(dataSource, application)
        val sleepTrackerViewModel =
            ViewModelProviders.of(this, viewModelFactory).get(SleepTrackerViewModel::class.java)

        binding.lifecycleOwner = this
        binding.sleepTrackerViewModel = sleepTrackerViewModel

        return binding.root
    }
}

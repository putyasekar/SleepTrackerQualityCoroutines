package com.putya.idn.sleeptrackerqualitycoroutines.sleep_quality

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.putya.idn.sleeptrackerqualitycoroutines.R
import com.putya.idn.sleeptrackerqualitycoroutines.databinding.FragmentQualityBinding

/**
 * A simple [Fragment] subclass.
 */
class QualityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentQualityBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_quality, container, false
        )
        val application = requireNotNull(this.activity).application

        return binding.root
    }

}

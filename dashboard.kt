package com.example.navigasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigasi.databinding.FragmentDashboardBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [dashboard.newInstance] factory method to
 * create an instance of this fragment.
 */
class dashboard : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentDashboardBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container,false)

        binding.button.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboard_to_halamanProfil)
        }

        binding.button2.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboard_to_halamanDiklat)
        }

        binding.button1.setOnClickListener {
            it.findNavController().navigate(R.id.action_dashboard_to_halamanPortofolio)
        }
        return binding.root
    }

}
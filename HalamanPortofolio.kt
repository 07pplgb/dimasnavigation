package com.example.navigasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigasi.databinding.FragmentHalamanPortofolioBinding
import com.example.navigasi.databinding.FragmentHalamanProfilBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HalamanPortofolio.newInstance] factory method to
 * create an instance of this fragment.
 */
class HalamanPortofolio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentHalamanPortofolioBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_halaman_portofolio, container, false)

        binding.button4.setOnClickListener {
            it.findNavController().navigate(R.id.action_halamanPortofolio_to_dashboard)
        }
        return binding.root
    }
}
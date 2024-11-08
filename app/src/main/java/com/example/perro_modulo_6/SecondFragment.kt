package com.example.perro_modulo_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.perro_modulo_6.databinding.FragmentCareBinding

class FragmentCare : Fragment() {

    private var _binding: FragmentCareBinding? = null

    // Esta propiedad solo es válida entre onCreateView y onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentCareBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCare.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_care_to_fragment_races)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

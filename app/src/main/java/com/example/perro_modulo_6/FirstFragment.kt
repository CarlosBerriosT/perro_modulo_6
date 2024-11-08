package com.example.perro_modulo_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.perro_modulo_6.databinding.FragmentRacesBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentRacesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRacesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            // Cambia esta línea para que coincida con la acción definida en nav_graph.xml
            findNavController().navigate(R.id.action_fragment_races_to_fragment_care)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

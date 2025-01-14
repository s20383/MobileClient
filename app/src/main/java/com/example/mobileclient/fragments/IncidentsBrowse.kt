package com.example.mobileclient.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.mobileclient.R
import com.example.mobileclient.databinding.FragmentIncidentsBrowseBinding

class IncidentsBrowse : Fragment() {
    private var _binding: FragmentIncidentsBrowseBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        _binding = FragmentIncidentsBrowseBinding.inflate(inflater, container, false)
        val view = binding.root
//TODO: Add code to populate the list with incidents from database
        val names = arrayOf(
            "Zgloszenie1  10-10-2022",
            "Zgloszenie2  10-10-2022",
            "Zgloszenie3  10-10-2022",
            "Zgloszenie4  10-10-2022",
            "Zgloszenie5  10-10-2022",
            "Zgloszenie6  10-10-2022",
            "Zgloszenie7  10-10-2022",
            "Zgloszenie8  10-10-2022",
            "Zgloszenie9  10-10-2022",
            "Zgloszenie10  10-10-2022",
            "Zgloszenie11  10-10-2022",
            "Zgloszenie12  10-10-2022",
            "Zgloszenie13  10-10-2022",
            "Zgloszenie14  10-10-2022",
            "Zgloszenie15  10-10-2022",
            "Zgloszenie16  10-10-2022",
            "Zgloszenie17  10-10-2022",
            "Zgloszenie18  10-10-2022",
            "Zgloszenie19  10-10-2022",
            "Zgloszenie20  10-10-2022",
            "Zgloszenie21  10-10-2022"
        )

        val arrayAdapter =
            ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, names)
        binding.listView.adapter = arrayAdapter

        binding.listView.setOnItemClickListener { adapterView, view, i, l ->
            Navigation.findNavController(view)
                .navigate(R.id.action_incidentsBrowse_to_showIncident)

        }
        return view
    }
}
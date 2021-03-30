package com.example.esiea3ai_arnoux.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.esiea3ai_arnoux.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SncfListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    private val adapter = SncfAdapter(listOf())
    private val layoutManager = LinearLayoutManager(context)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sncf_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       recyclerView = view.findViewById(R.id.sncf_recycler_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        val StationList: ArrayList<SNCF> = arrayListOf<SNCF>().apply {
            add(SNCF("Photoshop"))
            add(SNCF("Illustrator"))
            add(SNCF("Premiere Pro"))
            add(SNCF("In Design"))
            add(SNCF("After Effects"))
            add(SNCF("Lightroom"))
        }
        adapter.updateList(StationList)
    }
}
package com.example.esiea3ai_arnoux.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.esiea3ai_arnoux.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class AdobeListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    private val adapter = AdobeSuiteAdapter(listOf())
    private val layoutManager = LinearLayoutManager(context)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_adobe_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       recyclerView = view.findViewById(R.id.adobe_recycler_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        val AdobeList: ArrayList<Adobe> = arrayListOf<Adobe>().apply {
            add(Adobe("Photoshop", "lorem", "lorem"))
            add(Adobe("Illustrator","lorem", "lorem"))
            add(Adobe("Premiere Pro","lorem", "lorem"))
            add(Adobe("In Design", "lorem", "lorem"))
            add(Adobe("After Effects", "lorem", "lorem"))
            add(Adobe("Lightroom", "lorem", "lorem"))
        }
        adapter.updateList(AdobeList)
    }
}
package aakashresearchlabs.org.aluminati.fragments.fragmentAlumni

import aakashresearchlabs.org.aluminati.R
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_alumni_list.*

class AlumniListFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_alumni_list, container, false)

        val alumni = DummyDataProvider.dummyAlumList()
        val adapter = AlumniAdapter(alumni)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        alumni_list.layoutManager = layoutManager
        alumni_list.adapter = adapter

        return rootView
    }

    companion object {
        fun newInstance(): AlumniListFragment {
            return AlumniListFragment()
        }
    }
}
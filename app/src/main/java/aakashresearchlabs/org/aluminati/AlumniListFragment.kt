package aakashresearchlabs.org.aluminati

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AlumniListFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_alumni_list, container, false)

        val alumni: ArrayList<Alum> = DummyDataProvider.dummyAlumList()
        val adapter = AlumniAdapter(alumni)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        val mRecyclerView = rootView.findViewById<RecyclerView?>(R.id.alumni_list) as RecyclerView
        mRecyclerView.layoutManager = layoutManager
        mRecyclerView.adapter = adapter

        return rootView
    }

    companion object {
        fun newInstance(): AlumniListFragment {
            return AlumniListFragment()
        }
    }
}
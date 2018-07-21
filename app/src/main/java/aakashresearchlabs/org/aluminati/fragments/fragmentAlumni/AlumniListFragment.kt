package aakashresearchlabs.org.aluminati.fragments.fragmentAlumni

import aakashresearchlabs.org.aluminati.R
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
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

private class AlumniAdapter(private val alumniList: ArrayList<Alum>) : RecyclerView.Adapter<AlumHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumHolder {
        val alumItem = LayoutInflater.from(parent.context).inflate(R.layout.alum_item, parent, false) as LinearLayout
        return AlumHolder(alumItem)
    }

    override fun getItemCount(): Int {
        return alumniList.size
    }

    override fun onBindViewHolder(holder: AlumHolder, position: Int) {
        holder.populateHolder(alumniList[position])
    }
}

private class AlumHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    // private val alumImage: ImageView = itemView.findViewById(R.id.alum_image)
    private val alumName: TextView = itemView.findViewById(R.id.alum_name)

    fun populateHolder(alum: Alum) {
        alumName.text = alum.name
    }
}
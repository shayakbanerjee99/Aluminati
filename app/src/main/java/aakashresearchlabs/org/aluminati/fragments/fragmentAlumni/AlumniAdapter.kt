package aakashresearchlabs.org.aluminati.fragments.fragmentAlumni

import aakashresearchlabs.org.aluminati.R
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout

class AlumniAdapter(private val alumniList: ArrayList<Alum>) : RecyclerView.Adapter<AlumHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumHolder {
        val alumItem = LayoutInflater.from(parent.context).inflate(R.layout.alum_item, parent, false) as LinearLayout
        return AlumHolder(alumItem)
    }

    override fun getItemCount(): Int {
        Log.d("aluminati", "getitemcount called")
        return alumniList.size
    }

    override fun onBindViewHolder(holder: AlumHolder, position: Int) {
        holder.populateHolder(alumniList[position])
    }
}
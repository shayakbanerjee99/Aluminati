
package aakashresearchlabs.org.aluminati

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class AlumniAdapter(private val alumniList: ArrayList<Alum>) : RecyclerView.Adapter<AlumHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumHolder {
        val alumItem = LayoutInflater.from(parent.context).inflate(R.layout.alum_item, parent, false)
        return AlumHolder(alumItem)
    }

    override fun getItemCount(): Int {
        return alumniList.size
    }

    override fun onBindViewHolder(holder: AlumHolder, position: Int) {
        holder.populateHolder(alumniList[position])
    }
}
package aakashresearchlabs.org.aluminati

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class AlumHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    // private val alumImage: ImageView = itemView.findViewById(R.id.alum_image)
    private val alumName: TextView = itemView.findViewById(R.id.alum_name)

    fun populateHolder(alum: Alum) {
        alumName.text = alum.name
    }
}
package aakashresearchlabs.org.aluminati.fragments

import aakashresearchlabs.org.aluminati.R
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AlumProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alum_profile, container, false)
    }

    companion object {
        fun newInstance(): AlumProfileFragment {
            return AlumProfileFragment()
        }
    }

}

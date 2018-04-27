package aakashresearchlabs.org.aluminati

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AlumniListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onAttach(context: Context) {
        Log.d(TAG, "alumni fragment attached")
        val position: Int = this.arguments.get("position") as Int
        Log.d(TAG, position.toString())
        super.onAttach(context)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_alumni_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = AlumniAdapter(DummyDataProvider.dummyAlumList())
        Log.d("aluminati", DummyDataProvider.dummyAlumList().toString())
        val layoutManager = LinearLayoutManager(view.context)
        recyclerView = view.findViewById(R.id.alumni_list)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        Log.d("aluminati", recyclerView.toString())
        Log.d(TAG, "alumni fragment view created")

    }

    companion object {
        fun newInstance(): AlumniListFragment{
            val fragment = AlumniListFragment()
            val args = Bundle()
            args.putInt("position", 0)
            fragment.arguments = args
            return fragment
        }

        private const val TAG: String = "aluminati"

    }
}
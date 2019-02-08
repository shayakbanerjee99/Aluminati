package aakashresearchlabs.org.aluminati.activities

import aakashresearchlabs.org.aluminati.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 * On Clicking profile, this activity loads the @see AlumProfileFragment(code for that in activity_profile.xml)
 *
 */
class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }
}

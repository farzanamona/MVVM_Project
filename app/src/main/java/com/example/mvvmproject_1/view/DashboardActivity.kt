package com.example.mvvmproject_1.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject_1.R
import com.example.mvvmproject_1.viewmodel.DashboardActivityViewModel
import kotlinx.android.synthetic.main.dashboard_activity.*


class DashboardActivity : AppCompatActivity() {
    private var context: Context? =null
    private var image_view: ImageView? =null
    private var tvFullName: TextView? =null
    private var tvEmail: TextView? =null
    private var tvPhone: TextView? =null
    private var tvAddress: TextView? =null
    private var toolbar: Toolbar? = null
    private var drawerLayout: DrawerLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_activity)
        val dashboardActivityViewModel: DashboardActivityViewModel = ViewModelProvider(this).get<DashboardActivityViewModel>(DashboardActivityViewModel::class.java)

        toolbar = findViewById(R.id.toolbar)as Toolbar
        drawerLayout = findViewById(R.id.drawerLayout)as DrawerLayout

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        var drawerToggle = object : ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.drawer_open,
            R.string.drawer_close
        ) {
            override fun onDrawerClosed(view: View) {
                super.onDrawerClosed(view)
                setTitle(R.string.dashboard)
            }

            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
                setTitle(R.string.dashboard)
            }
        }


        drawerToggle.isDrawerIndicatorEnabled = true
        drawerLayout!!.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

       // val view = navigationView.getHeaderView(0)
        //view!!.tvName.text = context?.let { PersistData.getLoginData(it).name }

        navigationView.setNavigationItemSelectedListener{
            when (it.itemId){
                R.id.nav_profile-> {
                    startActivity(Intent(context,MainActivity::class.java))
                    drawerLayout!!.closeDrawer(GravityCompat.START)
                }

                R.id.nav_update_profile -> {
                    //Toast.makeText(context,"toast",Toast.LENGTH_SHORT).show()
                    var intent= Intent(context,EditProfileActivity::class.java)
                    startActivity(intent)
                    drawerLayout!!.closeDrawer(GravityCompat.START)
                }

                R.id.nav_settings -> {
//                    startActivity(Intent(context,Activity::class.java))
//                    drawerLayout!!.closeDrawer(GravityCompat.START)
                }

                R.id.nav_logout -> {
                    onDestroy()
                    drawerLayout!!.closeDrawer(GravityCompat.START)
                }

            }
            // Close the drawer
            true
        }


//        btnScan = findViewById(R.id.btnScan)as Button
//        btnScan!!.setOnClickListener {
//
//            startActivity(Intent(context, ScanActivity::class.java))
//        }



    }


}
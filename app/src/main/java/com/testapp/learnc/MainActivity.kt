package com.testapp.learnc

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()


        frag_home = HomeScreen()
        val change=supportFragmentManager.beginTransaction()
        change.replace(R.id.screen_area,frag_home)
        change.commit()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    var frag_home:Fragment?=null
    var frag_basics:Fragment?=null
    var frag_oops:Fragment?=null
    var frag_aboutus:Fragment?=null

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
                frag_home = HomeScreen()
                val change=supportFragmentManager.beginTransaction()
                change.replace(R.id.screen_area,frag_home)
                change.commit()
            }
            R.id.nav_gallery -> {

                frag_basics = BasicScreen()
                val change=supportFragmentManager.beginTransaction()
                change.replace(R.id.screen_area,frag_basics)
                change.addToBackStack(frag_basics.toString())
                change.commit()
            }
            R.id.nav_slideshow -> {

                frag_oops = OopsFragment()
                val change=supportFragmentManager.beginTransaction()
                change.replace(R.id.screen_area,frag_oops)
                change.addToBackStack(frag_oops.toString())
                change.commit()
            }
            R.id.nav_manage -> {

                frag_aboutus = AboutUs()
                val change=supportFragmentManager.beginTransaction()
                change.replace(R.id.screen_area,frag_aboutus)
                change.addToBackStack(frag_aboutus.toString())
                change.commit()
            }

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}

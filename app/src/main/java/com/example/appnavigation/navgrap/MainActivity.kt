package com.example.appnavigation.navgrap

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.*
import com.example.appnavigation.R
import com.example.appnavigation.databinding.MainActvBinding
import com.example.appnavigation.startactivityforresult.AboutActivity
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: MainActvBinding
    private lateinit var controller: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActvBinding.inflate(layoutInflater)
        setContentView(binding.root)

        controller = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(controller.graph, binding.drawerLayout)
        setupActionBarWithNavController(controller, appBarConfiguration)

        binding.navView.setupWithNavController(controller)
        binding.navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        (findViewById<View>(R.id.drawer_layout) as DrawerLayout).closeDrawer(GravityCompat.START)
        return when (item.itemId) {
            R.id.activityAbout -> {
                controller.navigate(R.id.activityAbout)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return controller.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


}
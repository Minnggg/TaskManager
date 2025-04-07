package com.example.taskmanager;

import android.os.Bundle;

import com.example.taskmanager.screen.dashboard.DashboardFragment;
import com.example.taskmanager.screen.home.HomeFragment;
import com.example.taskmanager.screen.notifications.NotificationsFragment;
import com.example.taskmanager.screen.schedule.ScheduleFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.taskmanager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private static MainActivity instance;
    public static MainActivity getInstants() {
        return instance;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(binding.navView, navController);

        binding.navView.setOnNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.navigation_home) {
                showFragment(new HomeFragment());
            } else if (item.getItemId() == R.id.navigation_dashboard) {
                showFragment(new DashboardFragment());
            } else if (item.getItemId() == R.id.navigation_notifications) {
                showFragment(new NotificationsFragment());
            }
            return true;
        });
    }

    public void showFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment_activity_main, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
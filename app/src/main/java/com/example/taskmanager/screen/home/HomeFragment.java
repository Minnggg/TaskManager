package com.example.taskmanager.screen.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.taskmanager.MainActivity;
import com.example.taskmanager.R;
import com.example.taskmanager.databinding.FragmentHomeBinding;
import com.example.taskmanager.screen.grade.GradeFragment;
import com.example.taskmanager.screen.note.NoteFragment;
import com.example.taskmanager.screen.schedule.ScheduleFragment;
import com.example.taskmanager.screen.subject.SubjectFragment;
import com.example.taskmanager.screen.todo.ToDoFragment;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnShowScreenSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.getInstants().showFragment(new ScheduleFragment());
            }
        });

        binding.btnShowScreenSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.getInstants().showFragment(new SubjectFragment());
            }
        });

        binding.btnShowScreenNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.getInstants().showFragment(new NoteFragment());
            }
        });

        binding.btnShowScreenTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.getInstants().showFragment(new ToDoFragment());
            }
        });

        binding.btnShowScreenGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.getInstants().showFragment(new GradeFragment());
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
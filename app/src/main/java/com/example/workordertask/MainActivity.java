package com.example.workordertask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.workordertask.adapters.UserAdapter;
import com.example.workordertask.models.Task;
import com.example.workordertask.models.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView userRecylerview;
    UserAdapter userAdapter;
    List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        userRecylerview = findViewById(R.id.user_rv);
        userRecylerview.setLayoutManager(new LinearLayoutManager(this));
        userRecylerview.setItemAnimator(new DefaultItemAnimator());
        userAdapter = new UserAdapter(this, userList);
        userRecylerview.setAdapter(userAdapter);
    }

    private void setData() {
        Task task1 = new Task("1000", 0, 1, 3);
        Task task2 = new Task("1001", 0, 1, 5);
        Task task3 = new Task("1002", 0, 1, 4);
        List<Task> taskListUser1 = new ArrayList<>();
        taskListUser1.add(task1);
        taskListUser1.add(task2);
        taskListUser1.add(task3);

        Task task11 = new Task("1000", 0, 2, 3);
        Task task22 = new Task("1001", 0, 3, 3);
        Task task33 = new Task("1002", 0, 4, 7);
        Task task44 = new Task("1001", 0, 5, 5);
        List<Task> taskListUser2= new ArrayList<>();
        taskListUser2.add(task11);
        taskListUser2.add(task22);
        taskListUser2.add(task33);
        taskListUser2.add(task44);

        User user1 = new User("John", taskListUser1);
        User user2 = new User("Mike", taskListUser2);

        userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user1);
        userList.add(user2);
        userList.add(user1);
        userList.add(user2);
        userList.add(user1);
        userList.add(user2);
        userList.add(user1);
        userList.add(user2);
    }
}
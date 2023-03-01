package com.example.workordertask.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.workordertask.R;
import com.example.workordertask.models.User;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    Context context;
    private RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
    List<User> userList;


    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_item,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);

        LinearLayoutManager layoutManager = new LinearLayoutManager(holder.taskRecyclerview.getContext(), LinearLayoutManager.VERTICAL, false);
        layoutManager.setInitialPrefetchItemCount(user.getTaskList().size());

        TaskAdapter taskAdapter = new TaskAdapter(context, user.getTaskList());
        holder.taskRecyclerview.setLayoutManager(layoutManager);
        holder.taskRecyclerview.setAdapter(taskAdapter);
        holder.taskRecyclerview.setRecycledViewPool(viewPool);
    }


    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
//        TextView technician_tv;
//        View line_v;
        RecyclerView taskRecyclerview;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            taskRecyclerview = itemView.findViewById(R.id.task_rv);
        }
    }
}


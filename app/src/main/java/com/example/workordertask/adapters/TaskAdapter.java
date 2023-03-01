package com.example.workordertask.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.workordertask.R;
import com.example.workordertask.models.Task;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder>{

    List<Task> taskList;
    Context context;

    public TaskAdapter(Context context, List<Task> taskList) {
        this.context= context;
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case Task.TYPE11:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_1_1, parent, false);
                break;
            case Task.TYPE12:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_1_2, parent, false);
                break;
            case Task.TYPE13:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_1_3, parent, false);
                break;
            case Task.TYPE14:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_1_4, parent, false);
                break;
            case Task.TYPE15:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_1_5, parent, false);
                break;
            case Task.TYPE16:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_1_6, parent, false);
                break;
            case Task.TYPE17:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_1_7, parent, false);
                break;
            case Task.TYPE21:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_2_1, parent, false);
                break;
            case Task.TYPE22:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_2_2, parent, false);
                break;
            case Task.TYPE23:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_2_3, parent, false);
                break;
            case Task.TYPE24:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_2_4, parent, false);
                break;
            case Task.TYPE25:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_2_5, parent, false);
                break;
            case Task.TYPE26:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_2_6, parent, false);
                break;
            /*case Task.TYPE31:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_3_1, parent, false);
                break;
            case Task.TYPE32:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_3_2, parent, false);
                break;
            case Task.TYPE33:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_3_3, parent, false);
                break;
            case Task.TYPE34:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_3_4, parent, false);
                break;
            case Task.TYPE35:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_3_5, parent, false);
                break;*/
            case Task.TYPE41:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_4_1, parent, false);
                break;
            case Task.TYPE42:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_4_2, parent, false);
                break;
            case Task.TYPE43:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_4_3, parent, false);
                break;
            case Task.TYPE44:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_4_4, parent, false);
                break;
            case Task.TYPE51:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_5_1, parent, false);
                break;
            case Task.TYPE52:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_5_2, parent, false);
                break;
            case Task.TYPE53:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_5_3, parent, false);
                break;
            case Task.TYPE61:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_6_1, parent, false);
                break;
            case Task.TYPE62:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_6_2, parent, false);
                break;
            case Task.TYPE71:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_7_1, parent, false);
                break;

            default:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_1_1, parent, false);
        }
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = taskList.get(position);
        holder.workid.setText(task.getWorkOrderId());
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    @Override
    public int getItemViewType(int position) {
        Task task = taskList.get(position);
        Log.d("Debugging", task.getWorkOrderId() + " " + task.getStartDay() + " " + task.getEndDay() + " " + task.getTaskLength() + " " + task.getType());
        switch (task.getType()) {
            case 0:
                return Task.TYPE11;
            case 1:
                return Task.TYPE12;
            case 2:
                return Task.TYPE13;
            case 3:
                return Task.TYPE14;
            case 4:
                return Task.TYPE15;
            case 5:
                return Task.TYPE16;
            case 6:
                return Task.TYPE17;
            case 7:
                return Task.TYPE21;
            case 8:
                return Task.TYPE22;
            case 9:
                return Task.TYPE23;
            case 10:
                return Task.TYPE24;
            case 11:
                return Task.TYPE25;
            case 12:
                return Task.TYPE26;
            case 13:
                return Task.TYPE31;
            case 14:
                return Task.TYPE32;
            case 15:
                return Task.TYPE33;
            case 16:
                return Task.TYPE34;
            case 17:
                return Task.TYPE35;
            case 18:
                return Task.TYPE41;
            case 19:
                return Task.TYPE42;
            case 20:
                return Task.TYPE43;
            case 21:
                return Task.TYPE44;
            case 22:
                return Task.TYPE51;
            case 23:
                return Task.TYPE52;
            case 24:
                return Task.TYPE53;
            case 25:
                return Task.TYPE61;
            case 26:
                return Task.TYPE62;
            case 27:
                return Task.TYPE71;
        }
        return 0;
    }

    public class TaskViewHolder extends RecyclerView.ViewHolder {
        TextView workid;
        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            workid = itemView.findViewById(R.id.workorder_id_tv);
        }
    }
}


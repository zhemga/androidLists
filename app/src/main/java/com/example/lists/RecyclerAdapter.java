package com.example.lists;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerItemViewHolder> {
    private List<String> myList;

    public RecyclerAdapter(List<String> myList) {
        this.myList = myList;
    }

    @Override
    public RecyclerItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        RecyclerItemViewHolder holder = new RecyclerItemViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerItemViewHolder holder, int position) {
        holder.itemText.setText(myList.get(position));
    }

    @Override
    public int getItemCount() {
        return (null != myList ? myList.size() : 0);
    }

    public class RecyclerItemViewHolder extends RecyclerView.ViewHolder {
        private final TextView itemText;

        public RecyclerItemViewHolder(final View parent) {
            super(parent);
            itemText = parent.findViewById(R.id.text);
        }
    }
}
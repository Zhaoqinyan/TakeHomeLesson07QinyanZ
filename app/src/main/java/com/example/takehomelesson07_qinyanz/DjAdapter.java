package com.example.takehomelesson07_qinyanz;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class DjAdapter extends RecyclerView.Adapter<DjViewHolder> {
    private List<Dj> djs;
    private Context context;

    public DjAdapter(List<Dj>djs, Context context){
        this.djs=djs;
        this.context=context;

    }
    @Override
    public DjViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_dj,parent,false);
        return new DjViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(DjViewHolder holder, int position) {
        Dj dj=djs.get(position);
        holder.djName.setText(dj.name);
        holder.djPhoto.setImageResource(dj.photoId);

    }

    @Override
    public int getItemCount(){
        return djs.size();
    }

}
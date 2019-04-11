package com.example.takehomelesson07_qinyanz;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DjViewHolder extends RecyclerView.ViewHolder{

    public CardView cardView;
    public TextView djName;
    public ImageView djPhoto;

    public DjViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView=(CardView)itemView.findViewById(R.id.card_view);
        djName=(TextView)itemView.findViewById(R.id.text);
        djPhoto=(ImageView)itemView.findViewById(R.id.image);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,djName.getText(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
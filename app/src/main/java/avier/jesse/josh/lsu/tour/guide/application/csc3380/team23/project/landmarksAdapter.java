package avier.jesse.josh.lsu.tour.guide.application.csc3380.team23.project;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by javier on 4/18/16.
 */
public class landmarksAdapter extends ArrayAdapter<Landmarks> {
    Context context;
    int layutResourceId;
    Landmarks stops[] = null;

    public landmarksAdapter(Context context, int layoutResourceID, Landmarks[] stops){
        super(context,layoutResourceID,stops);
        this.context = context;
        this.layutResourceId = layoutResourceID;
        this.stops = stops;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        landmarkHolder holder;

        if (row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layutResourceId,parent,false);
            holder = new landmarkHolder();
            holder.image = (ImageView) row.findViewById(R.id.landmarkView);
            holder.textView = (TextView) row.findViewById(R.id.landmarkName);
            row.setTag(holder);
        }
        else{
            holder = (landmarkHolder) row.getTag();

        }

        Landmarks landmarks = stops[position];
        holder.textView.setText(landmarks.title);
        holder.image.setImageResource(landmarks.icon);

        return row;
    }

    static class landmarkHolder{
        ImageView image;
        TextView textView;
    }
}

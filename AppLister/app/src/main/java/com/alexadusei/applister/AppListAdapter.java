package com.alexadusei.applister;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alexadusei.applister.model.App;

import java.util.List;

public class AppListAdapter extends RecyclerView.Adapter<AppListAdapter.AppViewHolder>{
    private final List<App> apps;

    public static class AppViewHolder extends RecyclerView.ViewHolder{
        TextView appName;
        TextView appVersion;
        TextView appSize;
        ImageView appIcon;

        public AppViewHolder(View itemView){
            super(itemView);
            appName = (TextView) itemView.findViewById(R.id.app_name);
            appVersion = (TextView) itemView.findViewById(R.id.app_version);
            appSize = (TextView) itemView.findViewById(R.id.app_size);
            appIcon = (ImageView) itemView.findViewById(R.id.app_icon);
        }
    }

    AppListAdapter(List<App> apps){
        this.apps = apps;
    }

    @Override
    public AppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        final LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        final View v = layoutInflater.inflate(R.layout.app_card, viewGroup, false);

        return new AppViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AppViewHolder appViewHolder, int i) {
        appViewHolder.appName.setText(apps.get(i).getAppInfo()[0]);
        appViewHolder.appVersion.setText("Version: " + apps.get(i).getAppInfo()[1]);
        appViewHolder.appSize.setText("Size: " + apps.get(i).getAppInfo()[2] + apps.get(i).getAppInfo()[3]);
        appViewHolder.appIcon.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        appViewHolder.appIcon.setImageDrawable(apps.get(i).getAppIcon());
    }

    @Override
    public int getItemCount(){
        return apps.size();
    }

}

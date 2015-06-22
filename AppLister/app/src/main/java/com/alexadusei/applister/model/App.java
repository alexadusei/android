package com.alexadusei.applister.model;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.text.DecimalFormat;

public class App {
    private final String appName;
    private final String appVersion;
    private final double appSize;
    private final String sizePrefix;
    private final Drawable appIconId;
    DecimalFormat df = new DecimalFormat("###0.#");

    public App(String appName, String appVersion, double appSize, String sizePrefix, Drawable appIconId){
        this.appName = appName;
        this.appVersion = appVersion;
        this.appSize = appSize;
        this.sizePrefix = sizePrefix;
        this.appIconId = appIconId;
    }

    public String[] getAppInfo(){
        String appInfo[] = new String[4];
        appInfo[0] = appName;
        appInfo[1] = appVersion;
        appInfo[2] = df.format(appSize);
        appInfo[3] = sizePrefix;

        return appInfo;
    }

    public Drawable getAppIcon(){
        return appIconId;
    }
}

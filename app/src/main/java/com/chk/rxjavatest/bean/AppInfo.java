package com.chk.rxjavatest.bean;

import android.support.annotation.NonNull;

import java.util.Comparator;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by chk on 18-6-4.
 */
@Data
@Accessors(prefix = "m")
public class AppInfo implements Comparable<Object>{
    long updateTime;
    String mName;
    String mIcon;

    public AppInfo(long updateTime,String name,String icon) {
        this.updateTime = updateTime;
        mName = name;
        mIcon = icon;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getmIcon() {
        return mIcon;
    }

    public void setmIcon(String mIcon) {
        this.mIcon = mIcon;
    }

    @Override
    public int compareTo(@NonNull Object o) {
        AppInfo	f =	(AppInfo)o;
        return	getName().compareTo(f.getName());
    }
}

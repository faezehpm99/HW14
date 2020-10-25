package com.example.hw14.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "Tasks")
public class Task {

    @PrimaryKey(autoGenerate = true)
    public int mId;

    @ColumnInfo(name = "title")
    public String mTitle;

    @ColumnInfo(name = "detail")
    public String mDetail;

    @ColumnInfo(name = "date")
    public Date mDate;

    public int getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDetail() {
        return mDetail;
    }

    public void setDetail(String mDetail) {
        this.mDetail = mDetail;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }
}

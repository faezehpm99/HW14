package com.example.hw14.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "Users")
public class User {

    @PrimaryKey(autoGenerate = true)
    public int mId;

    @ColumnInfo(name = "name")
    public String mName;

    @ColumnInfo(name = "password")
    public String mPassword;

    @ColumnInfo(name = "date")
    public Date mDate;

    public User() {
       this.mDate=new Date();
    }

    public int getId() {
        return mId;
    }
        public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }
}

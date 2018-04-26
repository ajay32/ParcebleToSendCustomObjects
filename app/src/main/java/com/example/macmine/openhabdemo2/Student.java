package com.example.macmine.openhabdemo2;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by macmine on 26/04/18.
 */

public class Student implements Parcelable {


    public static final Creator<Student> CREATOR = new Creator<Student>() { //predefined method
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) { //predefined method
            return new Student[size];
        }
    };

    //============

    int id;
    String name;
    int rollno;


    // Constructor
    public Student(int id, String name, int rollno){
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    //=============


    // Parcelling part
    public Student(Parcel in){  //predefined method
        this.id = in.readInt();
        this.name = in.readString();
        this.rollno =  in.readInt();
    }


    //==========

    @Override
    public int describeContents() { //predefined method
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) { //predefined method

        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.rollno);
    }


    //==============

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }





}

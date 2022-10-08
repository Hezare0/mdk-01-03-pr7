package com.example.pr7;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String name;
    private String company;
    private String phone;
    private int age;

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel parcel) {
            String name = parcel.readString();
            String company = parcel.readString();
            String phone = parcel.readString();
            int age = parcel.readInt();
            return new User(name,company,phone,age);
        }

        @Override
        public User[] newArray(int i) {
            return new User[i];
        }
    };
    public User(String name, String company, String phone, int age) {
        this.name = name;
        this.company = company;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(company);
        parcel.writeString(phone);
        parcel.writeInt(age);
    }
}

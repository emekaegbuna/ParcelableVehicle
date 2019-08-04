package com.example.vehicledetails;

import android.os.Parcel;
import android.os.Parcelable;

public class Vehicle implements Parcelable {

    public String Make;
    public String Color;
    public int Doors;

    public Vehicle(String Make, String Color, int Doors) {
        this.Make = Make;
        this.Color = Color;
        this.Doors = Doors;

    }

    protected Vehicle(Parcel in) {
        Make = in.readString();
        Color = in.readString();
        Doors = in.readInt();
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getDoors() {
        return Doors;
    }

    public void setDoors(int doors) {
        Doors = doors;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Make);
        parcel.writeString(Color);
        parcel.writeInt(Doors);
    }
}

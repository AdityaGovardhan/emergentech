package com.example.relationaldataaccess;
import java.util.ArrayList;

public class Event {
    private long id;
    private String Name;
    private long groupId;
    private String startDateTime;
    private String location;
    private double noOfHours;

    public Event(long id, String name, long groupId, String startDateTime, String location, double noOfHours) {
        this.id = id;
        Name = name;
        this.groupId = groupId;
        this.startDateTime = startDateTime;
        this.location = location;
        this.noOfHours = noOfHours;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(double noOfHours) {
        this.noOfHours = noOfHours;
    }
}

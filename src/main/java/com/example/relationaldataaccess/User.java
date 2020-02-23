package com.example.relationaldataaccess;
import java.util.ArrayList;

public class User {
    private String emailId;
    private String Name;
    private int age;
    private ArrayList<Group> groupsEnrolled = new ArrayList<Group>();
    private ArrayList<UserEvent> eventsEnrolled = new ArrayList<UserEvent>();
    private ArrayList<Event> eventsUpcoming= new ArrayList<Event>();
    private ArrayList<User> following= new ArrayList<User>();
    private ArrayList<User> followers= new ArrayList<User>();

    public User(String emailId, String name, int age) {
        this.emailId = emailId;
        Name = name;
        this.age = age;
    }

    public User(String emailId, String name, int age, ArrayList<Group> groupsEnrolled, ArrayList<UserEvent> eventsEnrolled, ArrayList<Event> eventsUpcoming, ArrayList<User> following, ArrayList<User> followers) {
        this.emailId = emailId;
        Name = name;
        this.age = age;
        this.groupsEnrolled = groupsEnrolled;
        this.eventsEnrolled = eventsEnrolled;
        this.eventsUpcoming = eventsUpcoming;
        this.following = following;
        this.followers = followers;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Group> getGroupsEnrolled() {
        return groupsEnrolled;
    }

    public void setGroupsEnrolled(ArrayList<Group> groupsEnrolled) {
        this.groupsEnrolled = groupsEnrolled;
    }

    public ArrayList<UserEvent> getEventsEnrolled() {
        return eventsEnrolled;
    }

    public void setEventsEnrolled(ArrayList<UserEvent> eventsEnrolled) {
        this.eventsEnrolled = eventsEnrolled;
    }

    public ArrayList<Event> getEventsUpcoming() {
        return eventsUpcoming;
    }

    public void setEventsUpcoming(ArrayList<Event> eventsUpcoming) {
        this.eventsUpcoming = eventsUpcoming;
    }

    public ArrayList<User> getFollowing() {
        return following;
    }

    public void setFollowing(ArrayList<User> following) {
        this.following = following;
    }

    public ArrayList<User> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<User> followers) {
        this.followers = followers;
    }

    // getters & setters omitted for brevity
}

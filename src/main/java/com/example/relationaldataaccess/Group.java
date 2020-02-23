package com.example.relationaldataaccess;
import java.util.ArrayList;

public class Group {
    private long id;
    private String Name;
    private enum Tag{
        Environment, Coding, Innovative, Leadership, PublicSpeaking
    }

    private ArrayList<Tag> tag = new ArrayList<Tag>();

    public Group(long id, String name, ArrayList<String> tag) {
        this.id = id;
        Name = name;
        this.tag = tag;
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

    public ArrayList<String> getTag() {
        return tag;
    }

    public void setTag(ArrayList<String> tag) {
        this.tag = tag;
    }

    // getters & setters omitted for brevity
}

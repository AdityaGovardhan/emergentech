package com.example.relationaldataaccess;

public class UserEvent {

    private long id;
    private Boolean status; // ValidationStatus 0 = not verified, 1 = verified
    private String validationString;
    private int hours;

    public UserEvent(long id, Boolean status, String validationString, int hours) {
        this.id = id;
        this.status = status;
        this.validationString = validationString;
        this.hours = hours;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getValidationString() {
        return validationString;
    }

    public void setValidationString(String validationString) {
        this.validationString = validationString;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}

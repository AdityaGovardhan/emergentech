package com.example.relationaldataaccess;
import java.util.ArrayList;


public class UserEvent extends Event{
    enum ValidationStatus{
        Average,Outstanding,Attended
    }
    private ValidationStatus status;
    private String validationString;

    public UserEvent(long id, String name, long groupId, String startDateTime, String location, double noOfHours,com.example.relationaldataaccess.UserEvent.ValidationStatus status, String validationString) {
        super(id,name,groupId,startDateTime,location,noOfHours);
        this.status = status;
        this.validationString = validationString;
    }

    public com.example.relationaldataaccess.UserEvent.ValidationStatus getStatus() {
        return status;
    }

    public void setStatus(com.example.relationaldataaccess.UserEvent.ValidationStatus status) {
        this.status = status;
    }

    public String getValidationString() {
        return validationString;
    }

    public void setValidationString(String validationString) {
        this.validationString = validationString;
    }
}

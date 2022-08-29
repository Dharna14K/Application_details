package com.timesheet.application.model;

import java.time.LocalDate;
import java.util.Date;

public class WorkSheet {
    private Date date;
    private String workStatus;
    private boolean isDisabledEditMode;
    private Integer noOfHours;
    private Integer projectCode;
    private Boolean today;


    public Boolean isToday() {

        return (date.equals(LocalDate.now()));
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public boolean isDisabledEditMode() {
        return isDisabledEditMode;
    }

    public void setDisabledEditMode(boolean disabledEditMode) {
        isDisabledEditMode = disabledEditMode;
    }

    public Integer getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(Integer noOfHours) {
        this.noOfHours = noOfHours;
    }

    public Integer getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(Integer projectCode) {
        this.projectCode = projectCode;
    }
}

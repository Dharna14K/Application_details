package com.timesheet.application.model;

import java.util.Date;

public class AbsentDetails {
    //private UserDetailsModel absentee;
    private String absentType;//Sl Al
    private Integer days;
    private Date fromdate;
    private Date toDate;
    private Boolean approvalStatus;

    public String getAbsentType() {
        return absentType;
    }

    public void setAbsentType(String absentType) {
        this.absentType = absentType;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Boolean getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
}

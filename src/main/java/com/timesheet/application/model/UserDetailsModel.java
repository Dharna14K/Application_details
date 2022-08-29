package com.timesheet.application.model;

import java.util.Date;

public class UserDetailsModel {
    private String empName;
    private Integer empId;
    private String clientName;
    private String gender;
    private String maritalStatus;
    private Date dateOfJoining;
    private Integer yearInOrg;
    private String dept;
    private String performanceMgr;
    private String reportingMgr;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Integer getYearInOrg() {
        return yearInOrg;
    }

    public void setYearInOrg(Integer yearInOrg) {
        this.yearInOrg = yearInOrg;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPerformanceMgr() {
        return performanceMgr;
    }

    public void setPerformanceMgr(String performanceMgr) {
        this.performanceMgr = performanceMgr;
    }

    public String getReportingMgr() {
        return reportingMgr;
    }

    public void setReportingMgr(String reportingMgr) {
        this.reportingMgr = reportingMgr;
    }
}

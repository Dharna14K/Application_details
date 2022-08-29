package com.timesheet.application.model;

import java.util.Date;
import java.util.List;

public class AbsenteesDetailsModel {
    private List<AbsentDetails> absentDetailsList;
    private Integer empId;
    private Integer totalLeaves;
    private Integer annualLeaveBal;
    private Integer SickLeaveBal;
    private Integer flexiLeaveBal;

    public List<AbsentDetails> getAbsentDetailsList() {
        return absentDetailsList;
    }

    public void setAbsentDetailsList(List<AbsentDetails> absentDetailsList) {
        this.absentDetailsList = absentDetailsList;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getTotalLeaves() {
        return totalLeaves;
    }

    public void setTotalLeaves(Integer totalLeaves) {
        this.totalLeaves = totalLeaves;
    }

    public Integer getAnnualLeaveBal() {
        return annualLeaveBal;
    }

    public void setAnnualLeaveBal(Integer annualLeaveBal) {
        this.annualLeaveBal = annualLeaveBal;
    }

    public Integer getSickLeaveBal() {
        return SickLeaveBal;
    }

    public void setSickLeaveBal(Integer sickLeaveBal) {
        SickLeaveBal = sickLeaveBal;
    }

    public Integer getFlexiLeaveBal() {
        return flexiLeaveBal;
    }

    public void setFlexiLeaveBal(Integer flexiLeaveBal) {
        this.flexiLeaveBal = flexiLeaveBal;
    }
}

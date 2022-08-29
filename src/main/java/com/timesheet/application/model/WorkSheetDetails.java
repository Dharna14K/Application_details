package com.timesheet.application.model;

import java.util.List;

public class WorkSheetDetails {
    private String month;
    private Integer empId;
    private List<WorkSheet> workSheetList;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public List<WorkSheet> getWorkSheetList() {
        return workSheetList;
    }

    public void setWorkSheetList(List<WorkSheet> workSheetList) {
        this.workSheetList = workSheetList;
    }
}

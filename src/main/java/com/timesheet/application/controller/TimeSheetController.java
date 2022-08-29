package com.timesheet.application.controller;

import com.timesheet.application.model.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;


@RestController
public class TimeSheetController {

    WorkSheetDetails tsm=new WorkSheetDetails();

    @RequestMapping("/employee/{employeeId}")
    public TimeSheetDetailsModel userDetails(@PathVariable("employeeId") Integer employeeId) {
        TimeSheetDetailsModel timeSheetDetails = new TimeSheetDetailsModel();
        TimeSheetController t = new TimeSheetController();
        timeSheetDetails.setUserDetailsModel(t.getEmployeeDetails(employeeId));
        timeSheetDetails.setAdm(t.getAbsentDetails(employeeId));
        timeSheetDetails.setWsd(t.getWorkSheetDetails(employeeId));
        return timeSheetDetails;
    }

    private UserDetailsModel getEmployeeDetails(Integer empId) {
        UserDetailsModel userDetails = new UserDetailsModel();
        userDetails.setEmpName("Dharna Kaushik");
        userDetails.setEmpId(empId);
        userDetails.setClientName("GS");
        userDetails.setDept("Light House");
        userDetails.setGender("Female");
        userDetails.setMaritalStatus("Single");
        userDetails.setDateOfJoining(new Date());
        userDetails.setYearInOrg(1);
        userDetails.setPerformanceMgr("Jhandu");
        return userDetails;
    }

    private AbsenteesDetailsModel getAbsentDetails(Integer empId) {
        AbsenteesDetailsModel abm = new AbsenteesDetailsModel();
        AbsentDetails a1 = new AbsentDetails();
        a1.setAbsentType("AL");
        a1.setDays(3);
        a1.setApprovalStatus(true);
        a1.setFromdate(new Date(2022,8,1));
        a1.setToDate(new Date(2022, 8, 3));
        AbsentDetails a2 = new AbsentDetails();
        a2.setAbsentType("FL");
        a2.setDays(1);
        a2.setApprovalStatus(true);
        a2.setFromdate(new Date(2022,8,4));
        a2.setToDate(new Date(2022,8,4));
        abm.setEmpId(empId);
        ArrayList<AbsentDetails> al1=new ArrayList<>();
        al1.add(a1);
        al1.add(a2);
        abm.setAbsentDetailsList( al1);
        abm.setAnnualLeaveBal(12);
        abm.setTotalLeaves(21);
        abm.setFlexiLeaveBal(1);
        abm.setSickLeaveBal(5);
        return abm;
    }

    private WorkSheetDetails getWorkSheetDetails(Integer empId) {
        WorkSheet ws = new WorkSheet();
        WorkSheetDetails wsm = new WorkSheetDetails();
        ws.setDate(new Date(2022, 8, 15));
        //ws.isToday();
        //s.getDate();

        ws.setWorkStatus("working");
        ws.setDisabledEditMode(true);
        ws.setProjectCode(101);
        ws.setNoOfHours(10);
        WorkSheet ws2 = new WorkSheet();
        ws2.setDate(new Date(2022, 8, 16));
        //ws.isToday();
        //s.getDate();

        ws2.setWorkStatus("working");
        ws2.setDisabledEditMode(true);
        ws2.setProjectCode(102);
        ws2.setNoOfHours(10);
        WorkSheet ws3 = new WorkSheet();
        ws3.setDate(new Date(2022, 8, 17));
        //ws.isToday();
        //s.getDate();

        ws3.setWorkStatus("working");
        ws3.setDisabledEditMode(true);
        ws3.setProjectCode(103);
        ws3.setNoOfHours(10);
        ArrayList<WorkSheet> al2=new ArrayList<>();
        al2.add(ws);
        al2.add(ws2);
        al2.add(ws3);
        wsm.setWorkSheetList(al2);
        wsm.setEmpId(empId);
        wsm.setMonth("August");
        return wsm;
    }
}

package com.timesheet.application.model;

public class TimeSheetDetailsModel
{
    private UserDetailsModel userDetailsModel;
    private AbsenteesDetailsModel adm;
    private WorkSheetDetails wsd;

    public UserDetailsModel getUserDetailsModel() {
        return userDetailsModel;
    }

    public void setUserDetailsModel(UserDetailsModel userDetailsModel) {
        this.userDetailsModel = userDetailsModel;
    }

    public AbsenteesDetailsModel getAdm() {
        return adm;
    }

    public void setAdm(AbsenteesDetailsModel adm) {
        this.adm = adm;
    }

    public WorkSheetDetails getWsd() {
        return wsd;
    }

    public void setWsd(WorkSheetDetails wsd) {
        this.wsd = wsd;
    }
}

package edu.wpi.teamname;

public class Sales {

    protected String employeeName;
    protected SalesManager manager;
    protected long salesID;

    public Sales(String employeeName, long salesID) {
        this.employeeName = employeeName;
//        this.manager = manager;
        this.salesID = salesID;
    }

    protected String getEmployeeName() {
        return this.employeeName;
    }

//    protected SalesManager getManager() {
//        return this.manager;
//    }

    protected long getSalesID() {
        return this.salesID;
    }

    protected void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

//    protected void setManager(SalesManager manager) {
//        this.manager = manager;
//    }

    protected void setSalesID(long salesID) {
        this.salesID = salesID;
    }

}

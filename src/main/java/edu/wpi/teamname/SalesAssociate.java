package edu.wpi.teamname;

public class SalesAssociate extends Employee {

//    protected String employeeName;
    protected SalesManager manager;
//    protected long salesID;

    public SalesAssociate(String employeeName, SalesManager manager, long salesID) {
        super(employeeName, salesID);
        this.manager = manager;
    }

    double bonus() {
        return 1000*clients.size();
    }

    protected SalesManager getManager() {
        return this.manager;
    }

    public String toString() {
        return "Hello";
    }

}



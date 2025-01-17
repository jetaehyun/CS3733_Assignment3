package edu.wpi.teamname;

public class Client {

    private int clientID;
    private String clientName;
    Employee employee;

    public Client(int clientID, String clientName, Employee employee) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.employee = employee;
    }

    public double totalSales() {
        return 0;
    }

    public String toString() {
        return "Client: " + this.clientName + ". Sales Employee: " + employee.getEmployeeName() + " " + employee.getSalesID();
    }

    protected int getClientID() {
        return this.clientID;
    }

    protected String getClientName() {
        return this.clientName;
    }

    protected void setClientID(int clientID) {
        this.clientID = clientID;
    }

    protected void setClientName(String clientName) {
        this.clientName = clientName;
    }

}

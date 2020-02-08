package edu.wpi.teamname;

import java.util.ArrayList;

public class SalesManager extends Employee {

  //    protected String employeeName;
  //    protected ArrayList<Employee> employees = new ArrayList<Employee>();
  protected ArrayList<Employee> employees;

  //    protected SalesManager manager;
  //    protected long salesID;

  public SalesManager(String employeeName, long salesID, ArrayList<Employee> employees) {
    super(employeeName, salesID);
    this.employees = employees;
  }

  double bonus() {
    int countEmployee = this.employees.size();
    int countClients = getClients().size();

    return 5000 * countEmployee + 2000 * countClients;
  }

  public String toString() {
    //        getClients();
    StringBuffer list = new StringBuffer();
    ArrayList<Client> clients = getClients();
    for(int i = 0; i < clients.size(); i++) {
      if(i == clients.size() - 1) {
        list.append(clients.get(i).getClientName() + " " + Long.toString(clients.get(i).getClientID()));
        break;
      }
      list.append(clients.get(i).getClientName() + " " + Long.toString(clients.get(i).getClientID()) +  ", ");
    }
    String listOfClients = list.toString();

    String names = "";
    for(Employee e : employees) {
      names += e.getEmployeeName() + " "  + Long.toString(e.salesID);
    }
    return "Sales Manager: "
        + this.employeeName
        + " "
        + Long.toString(this.salesID)
        + ". Employees: "
        + names
        + ". Clients: "
        + listOfClients
        + ". Bonus: " + Integer.toString((int) bonus());
  }
}

package edu.wpi.teamname;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SalesManager extends Employee {

  protected ArrayList<Employee> employees;

  public SalesManager(String employeeName, long salesID, ArrayList<Employee> employees) {
    super(employeeName, salesID);
    this.employees = employees;
  }

  public SalesManager(){}


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
//        + " "
//        + Long.toString(this.salesID)
        + ". Employees: "
        + names
        + ". Clients: "
        + listOfClients
        + ". Bonus: " + Integer.toString((int) bonus());
  }
  protected ArrayList<Employee> getEmployees(){ return this.employees;}
  protected void setEmployees(ArrayList<Employee> employees){this.employees = employees;}
}

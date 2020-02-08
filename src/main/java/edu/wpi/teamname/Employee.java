package edu.wpi.teamname;

import java.util.ArrayList;


public abstract class Employee{
  protected String employeeName;
  protected SalesManager manager;
  protected long salesID;

  ArrayList<Client> clients = new ArrayList<Client>();

  public Employee(String employeeName, long salesID, SalesManager mgr) {
    this.employeeName = employeeName;
    this.salesID = salesID;
    this.manager = mgr;
  }

  public Employee(String employeeName, long salesID){
    this.employeeName = employeeName;
    this.salesID = salesID;
    this.manager = new SalesManager();
  }

  public Employee(){}

  protected String getEmployeeName() {
    return this.employeeName;
  }

  protected long getSalesID() {
    return this.salesID;
  }

  protected SalesManager getSalesManager(){return this.manager;}

  protected void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  protected void setSalesID(long salesID) {
    this.salesID = salesID;
  }

  protected void setSalesManager(SalesManager manager){this.manager = manager;}


  public Boolean addClient(Client client) {
    int idToAdd = client.getClientID();
    int previousId;
    int thisId;

    for (int index = 0; index < this.clients.size(); index++) {
      thisId = clients.get(index).getClientID();
      // if the element we're at is bigger, insert before
      if (thisId > idToAdd) {
        this.clients.add(index, client);
        return true;
      }
    }

    // check the list
    // only get here if we've reached the end of the list
    this.clients.add(client);
    return true;
  }

  public ArrayList<Client> getClients() {
    return this.clients;
  }
}

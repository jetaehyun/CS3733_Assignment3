package edu.wpi.teamname;

import java.util.ArrayList;

public abstract class Employee extends Sales {

  ArrayList<Client> clients = new ArrayList<Client>();

  public Employee(String employeeName, long salesID) {
    super(employeeName, salesID);
  }

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

package edu.wpi.teamname;

import java.util.ArrayList;

public class SalesAssociate extends Employee {

    public SalesAssociate(String employeeName, SalesManager manager, long salesID) {
        super(employeeName, salesID, manager);
    }

    double bonus() {
        return 1000*clients.size();
    }

    protected SalesManager getManager() {
        return this.manager;
    }

    public String toString() {
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

        String names = this.getManager().employeeName + " " + Long.toString(this.getManager().salesID);
        return "Sales Associate: "
                + this.employeeName
//                + " "
//                + Long.toString(this.salesID)
                + ". Sales Manager: "
                + names
                + ". Clients: "
                + listOfClients
                + ". Bonus: " + Integer.toString((int) bonus());
    }

}



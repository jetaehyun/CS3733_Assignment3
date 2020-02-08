package edu.wpi.teamname;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    ArrayList<Employee> employeesT = new ArrayList<Employee>();
    ArrayList<Employee> employeesN = new ArrayList<Employee>();
    SalesManager tom = new SalesManager("Tom", 1, employeesT);
    SalesManager Jane = new SalesManager("Jane", 2, employeesN);

    SalesAssociate Harry = new SalesAssociate("Harry", Jane, 28);
    SalesAssociate Nancy = new SalesAssociate("Nancy", tom, 15);

    employeesT.add(Nancy);
    employeesN.add(Harry);

    Client Ann = new Client(51, "Ann", Harry);
    Client John = new Client(734, "John", Jane);
    Client Susan = new Client(515, "Susan", Nancy);
    Client David = new Client(921, "David", tom);
    Client Sarah = new Client(478, "Sarah", Jane);
    Client Daniel = new Client(269, "Daniel", Nancy);

    tom.addClient(David);
    Jane.addClient(Sarah);
    Jane.addClient(John);
    Harry.addClient(Ann);
    Nancy.addClient(Daniel);
    Nancy.addClient(Susan);

    System.out.println(Jane.toString());
    System.out.println(tom.toString());

    System.out.println(Harry.toString());
    System.out.println(Nancy.toString());

//    System.out.println();
//    System.out.println();

    System.out.println(Ann.toString());
    System.out.println(John.toString());
    System.out.println(Susan.toString());
    System.out.println(David.toString());
    System.out.println(Sarah.toString());
    System.out.println(Daniel.toString());

  }
}

package edu.wpi.teamname;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test
    public void janeTest(){
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

        assertEquals("Sales Manager: Jane. Employees: Harry 28. Clients: Sarah 478, John 734. Bonus: 9000", Jane.toString());
    }

    @Test
    public void tomTest(){
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

        assertEquals("Sales Manager: Tom. Employees: Nancy 15. Clients: David 921. Bonus: 7000", tom.toString());
    }
    @Test
    public void harryTest(){
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

        assertEquals("Sales Associate: Harry. Sales Manager: Jane 2. Clients: Ann 51. Bonus: 1000", Harry.toString());
    }

    @Test
    public void nancyTest(){
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

        assertEquals("Sales Associate: Nancy. Sales Manager: Tom 1. Clients: Daniel 269, Susan 515. Bonus: 2000", Nancy.toString());
    }

    @Test
    public void annTest(){
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

        assertEquals("Client: Ann. Sales Employee: Harry 28", Ann.toString());
    }

    @Test
    public void jonTest(){
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

        assertEquals("Client: John. Sales Employee: Jane 2", John.toString());
    }

    @Test
    public void susanTest(){
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

        assertEquals("Client: Susan. Sales Employee: Nancy 15", Susan.toString());
    }

    @Test
    public void davidTest(){
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

        assertEquals("Client: David. Sales Employee: Tom 1", David.toString());
    }

    @Test
    public void sarahTest(){
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

        assertEquals("Client: Sarah. Sales Employee: Jane 2", Sarah.toString());
    }

    @Test
    public void danielTest(){
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

        assertEquals("Client: Daniel. Sales Employee: Nancy 15", Daniel.toString());
    }
}

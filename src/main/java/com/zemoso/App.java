package com.zemoso;


import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;


public class App {

    public static void main(String[] args) {

        Session session = HibernateSession.getSessionFactory().openSession();

        session.beginTransaction();

        Department hrDepartment = new Department("HR");
        session.save(hrDepartment);

        Department accountDepartment = new Department("Account");
        session.save(accountDepartment);

        Employee employee1 = new Employee("Shubham","kumar",hrDepartment);
        session.save(employee1);

        Employee employee2 = new Employee("Saransh","Agarwal",accountDepartment);
        session.save(employee2);


        session.getTransaction().commit();

        Query q = session.createQuery("From Employee ");

        List<Employee> resultList = q.list();
        System.out.println();
        System.out.println();
        System.out.println("num of employess:" + resultList.size());
        for (Employee next : resultList) {
            System.out.println("next employee: " + next);
        }

    }

}

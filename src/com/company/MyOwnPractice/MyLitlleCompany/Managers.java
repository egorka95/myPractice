package com.company.MyOwnPractice.MyLitlleCompany;

/**
 * Created by nikitarozhkov on 28.06.16.
 */
public class Managers extends Employee implements EmployeeWork {


    public Managers(String name, String position, String lastName, int salary) {
        super(name, position, lastName, salary);
    }

    @Override
    public String doYouWork() {
        return "Следи за этими ленятями за компами!!!";
    }
}

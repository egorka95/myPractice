package com.company.MyOwnPractice.MyLitlleCompany;

/**
 * Created by nikitarozhkov on 28.06.16.
 */
public class OfficeEmployee  extends Employee implements EmployeeWork {




    public OfficeEmployee(String name, String position, String lastName, int salary) {
        super(name, position, lastName, salary);
    }

    @Override
    public String doYouWork() {
        return "Сиди за компом и работай хорошо!!!";
    }
}

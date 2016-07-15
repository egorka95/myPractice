package com.company.MyOwnPractice.MyLitlleCompany;

import java.util.Comparator;

/**
 * Created by nikitarozhkov on 28.06.16.
 */
public class OfficeWorkerSallaryComporator implements Comparator<OfficeEmployee> {


    @Override
    public int compare(OfficeEmployee officeWorker1, OfficeEmployee officeWorker2) {
        Integer salary1 = new Integer((int) officeWorker1.getSalary());//преобразовываем в Интеджер
        Integer salary2 = new Integer((int) officeWorker2.getSalary());
        return salary1.compareTo(salary2);
    }
}

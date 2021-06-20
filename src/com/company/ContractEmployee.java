package com.company;

public class ContractEmployee extends Employee implements Payment {
    private int workingDays;

    public ContractEmployee(int id, String name, int workingDays) {
        super(id, name);
        this.workingDays = workingDays;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "workingDays=" + workingDays +
                '}'+" "+super.toString();
    }

    public int calculatePay(){
       return workingDays* 20;
    }


}

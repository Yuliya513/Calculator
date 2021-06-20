package com.company;

public class SalaryEmployee extends Employee implements Payment {
    private int workingHours;

    public SalaryEmployee(int id, String name, int workingHours) {
        super(id, name);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "workingHours=" + workingHours +
                '}'+" " +super.toString();
    }

    public int calculatePay(){
        return workingHours* 7;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 * A class to model Employee Objects.
 * Employees have an hourlyWage and a number of hours worked
 * @author dancye, 2020
 */
public class Employee 
{
    private double hours;
    private double wage;

    public Employee()
    {
        //no-arg constructor
    }
    /**
     * @return the hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * @return the wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(double wage) {
        this.wage = wage;
    }
   
    /**
     * A method to calculate the employee's pay
     * @return the pay as a double
     */
    public double calculatePay()
    {
        return wage*hours;
    }
}

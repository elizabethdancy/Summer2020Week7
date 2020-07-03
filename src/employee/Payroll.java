/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 * A class to illustrate inheritance between Employee and Manager
 * by creating an instance of each and calling calculatePay on them.
 * @author dancye, 2020
 */
public class Payroll 
{
    public static void main(String[]args)
    {
        Employee e1 = new Employee();
        e1.setHours(10);
        e1.setWage(15);
        Manager e2 = new Manager();
        e2.setHours(10);
        e2.setWage(15);
        e2.setBonus(100);
        
        System.out.println("Employee e1 is owed: " + e1.calculatePay());
        System.out.println("Manager e2 is owed: " + e2.calculatePay());
    }
}

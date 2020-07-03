/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 * A Manager class that extend Employee
 * @author dancye, 2020
 */
public class Manager extends Employee
{
    private double bonus;

    public Manager()
    {
        super();
    }
    /**
     * @return the bonus
     */
    public double getBonus() 
    {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) 
    {
        this.bonus = bonus;
    }
    
    @Override
    public double calculatePay()
    {
        return super.calculatePay() + bonus;
    }
}

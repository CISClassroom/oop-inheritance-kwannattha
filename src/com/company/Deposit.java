package com.company;

public class Deposit
{
    Balance balance = new Balance();
    public void fixed_dp(double money)
    {
        if (money <= 5000)
        {
            System.out.println("เงินฝากขั้นต่ำ 5000 บาท");
        }
        else if(money >= 5000)
        {
            balance.money_fixed+=money;
            balance.fixed_bl();
        }
    }
    public void  saving_dp(double money)
    {
        balance.money_saving += money;
        balance.saving_bl();
    }
}

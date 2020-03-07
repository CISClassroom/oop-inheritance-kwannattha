package com.company;

public class Withdraw {
    static Balance balance = new Balance();

    public void fixed_wd(double money)
    {
        balance.money_fixed -= money;
        balance.fixed_bl();
    }
    public static void saving_wd(double money)
    {
        balance.money_fixed -= money;
        balance.saving_bl();
    }
}

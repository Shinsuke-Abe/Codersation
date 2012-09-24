package com.codersation.abe.vendingmachine.money;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mao
 */
public class AmountableMoneyFactory {
    public static AmountableMoney createNewMoney(Integer value) {
        switch(value) {
            case 10: return new JPY10();
            case 100: return new JPY100();
            default: return null;
        }
    }
}
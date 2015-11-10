/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lupin33;

/**
 *
 * @author user
 */
public class CashApp {
    public static void main(String[] args){
    CashCard[] cards = {
        new CashCard("00001", 1000, 1),
        new CashCard("00002", 2000, 2),
        new CashCard("00003", 1000, 1)
        };
    
    for(CashCard card : cards){
    System.out.printf("%s %d %d \n",card.number, card.balance, card.bonus);
    }
    
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    private String CzarinaSotelo; // Student no.: 991624256
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clubs", 9);
        nineClubs.setSuit("Diamonds");
        
        Card fourSpades = new Card("Spades", 4);
        fourSpades.setSuit("Hearts");
        
        System.out.println(fourSpades.setSuit("Hearts"));
    }
}

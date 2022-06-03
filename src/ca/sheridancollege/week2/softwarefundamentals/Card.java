/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * A class to model Card Objects.
 * Created in Week 2 for the cloning repository demo
 * @author dancye, 2019
 */

/* Step 1: Clone the project from github.com from above mentioned URL 
and  add  comments  and then first commit/push the changes to YOUR GIT HUB REPOSITORY.
Comments for ICE 1*/

public class Card 
{
    private String suit;// hearts, diamonds, spades and clubs
    private int value;//1-13
    
    /**
     * A constructor that creates a Card Object with a given
     * suit and a given value.
     * @param givenSuit
     * @param givenValue 
     */
    public Card(String givenSuit, int givenValue)
    {
        suit = givenSuit;
        value = givenValue;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        if(suit.equals("Hearts") || suit.equals("Diamonds")|| suit.equals("Clubs")|| suit.equals("Spades"))
        {
            this.suit = suit;
        }
        else
        {
            System.out.println("The suit you have tried to assign is not valid");
            System.out.println("Please choose from: Hearts, Diamonds, Clubs, Spades");
        }
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) 
    {
        if((value<1)||(value>13))
        {
              System.out.println("The value of the card must be between 1-13");      
        }
        else
        {
            this.value = value;
        }
    }
    
    
}

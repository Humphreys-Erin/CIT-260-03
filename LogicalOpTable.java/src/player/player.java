/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erin
 */
package player;

/**
 *
 * @author Erin
 */
public class player {
    
String name;
    String playerType;
    long wins = 0;
    long losses = 0;
    String marker;
    
    
    public static void main(String[] args) {
        
        testTotalPoints();
        
    }
    
    
    public void displayName(){
        System.out.println("I have " + wins + "wins and " + losses + "losses.\r\n");
    }
    public String totalPoints(long wins, long losses, long ties){
        
        char oneHundred = 100;
        
        if (wins < 0){
            System.out.println("The number of wins must be "
                    + "greater than or equal to zero.\r\n");
            return "-1";
        }
        
        if (losses < 0){
            System.out.println("The number of losses must be "
                    + "greater than or equal to zero.\r\n");
            return "-1";
        }
 
        if (ties < 0){
            System.out.println("The number of ties must be "
                    + "greater than or equal to zero.\r\n");
            return "-1";
        } 
        
        double sumOfPoints = (wins * 10) + (losses * 0) + (ties * 5);
        
        if (sumOfPoints==0){
            return "0";
            
        
        }
        String playerStatistics = "You have" + wins + "wins, "+ losses+" losses"
                    + " and " + ties + "ties. Your total points are " + sumOfPoints + "r\n";
        
        return playerStatistics;
        }
    
    
    public static void testTotalPoints() {
        
        // test 1
        System.out.println("totalPoints - Test 1");
        long wins = 5;
        long losses = 2;
        long ties = 3;
        double expResult = 65;
        Player instance = new Player();
        String result = instance.totalPoints(wins, losses, ties);
        //assertEquals(expResult, result, 0.0);
        
        // test 2
        System.out.println("totalPoints - Test 2");
        wins = -1;
        losses = 2;
        ties = 3;
        expResult = -999;
        result = instance.totalPoints(wins, losses, ties);
        //assertEquals(expResult, result, 0.0);
        
        // test 3
        System.out.println("totalPoints - Test 3");
        wins = 5;
        losses = -1;
        ties = 2;
        expResult = -999;
        result = instance.totalPoints(wins, losses, ties);
        //assertEquals(expResult, result, 0.0);
        
        // test 4
        System.out.println("totalPoints - Test 4");
        wins = 2;
        losses = 6;
        ties = -1;
        expResult = -999;
        result = instance.totalPoints(wins, losses, ties);
        //assertEquals(expResult, result, 0.0);
        
        // test 5
        System.out.println("totalPoints - Test 5");
        wins = 0;
        losses = 0;
        ties = 0;
        expResult = 0;
        result = instance.totalPoints(wins, losses, ties);
        //assertEquals(expResult, result, 0.0);
        
    }
    
    
    
    }


    
    


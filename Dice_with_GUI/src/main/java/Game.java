
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rishi
 */

interface foo{
    public void setGameType(char type);
    public void quit();
    public boolean getWannaPlay();

    public void playGame();
    public boolean roundEnd();
    public void setTrue();
    public int retrieveOne();
    public int retrieveTwo();
    public int retrieveThree();
}

public class Game implements foo{
    public boolean wannaPlay;
    public char gameType;
    Scanner in = new Scanner(System.in);
    public int rollOne;
    public int rollTwo;
    public int rollThree;
    
    public int retrieveThree(){
        return rollThree;
    }
    
    public int retrieveOne(){
        return rollOne;
    }
    
    public int retrieveTwo(){
        return rollTwo;
    }
    
    public void setTrue(){
        wannaPlay = true;
    }
    
    public void setGameType(char type){
        gameType = type;
    }
    
    public void quit(){
        System.out.print("Thank you for playing!\n");
        wannaPlay = false;
    }
    
    public boolean getWannaPlay(){
        return wannaPlay;
    }
    
    
    public void playGame(){
        
        boolean check = true; 
        if (gameType == '1'){
            char begin = gameType;
                Dice Die1 = new Dice("Die 1");
                Dice Die2 = new Dice("Die 2");
                Player player1 = new Player(true, "Player 1");
                int one, two;
                one = Die1.roll1();
                rollOne = one;
                two = Die2.roll1();
                rollTwo = two;
                if(player1.victory1(one, two)){
                    player1.setVictory();
                    
                }
        }
        else if (gameType == '2'){

            Dice Die1 = new Dice("Die 1");
            Dice Die2 = new Dice("Die 2");
            Dice Die3 = new Dice("Die 3");
            Player player1 = new Player(true, "Player 1");             
                    int one, two, three;
                    one = Die1.roll2();
                    rollOne = one;
                    two = Die2.roll2();
                    three = Die3.roll2();
                    rollTwo = two;
                    rollThree = three;
                    if(player1.victory2(one, two, three)){
                        player1.setVictory();
                    }     
            
            
        }
        else if(gameType == '3'){
                Dice Die1 = new Dice("Die 1");
                Dice Die2 = new Dice("Die 2");
                Player player1 = new Player(true, "Player 1");
                int one, two;
                one = Die1.roll1();
                rollOne = one;
                two = Die2.roll2();
                rollTwo = two;
                if(player1.victory3(one, two)){
                    player1.setVictory();  
                }
            }
        
    }

    @Override
    public boolean roundEnd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
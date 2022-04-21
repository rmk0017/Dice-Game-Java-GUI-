

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rishi
 */
public class Player {
    public boolean winner;
    public String name;
    public int score;
    
    public Player(boolean winner, String name){
        this.winner = false;
        this.name = name;
    }
    public boolean victory1(int first, int second){
        score = first + second; 
        return score == 2*first && score == 2*second;
    }
    public boolean victory2(int first, int second, int third){
        winner = second >= first && third >= second;
        return winner;
    }
    
    public boolean victory3(int oneTwelve, int twoSix){
        return oneTwelve % twoSix == 0;
    }
    
    public void setVictory(){
        winner = true;
        System.out.print("Congratulations! You won!\n");
    }
    
}

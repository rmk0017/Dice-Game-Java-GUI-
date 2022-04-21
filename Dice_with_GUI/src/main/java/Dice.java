

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.awt.*;
/**
 *
 * @author rishi
 */
public class Dice {
    public String name;
    
    public Dice(String name){
        this.name = name;
    } 
    public int roll1(){
        Random randint = new Random();
        int first = randint.nextInt(6) + 1;
        String str1 = String.format("You just rolled a %d\n", first);
        System.out.print(str1);
        return first;
    }
    public int roll2(){
        Random randint = new Random();
        int second = randint.nextInt(12) + 1;
        String str2 = String.format("You just rolled a %d\n", second);
        System.out.print(str2);
        return second;
    }
    
    
}

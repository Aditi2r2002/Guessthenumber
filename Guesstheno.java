package com.company;
import java.util.Random;
import java.util.Scanner;

class Game
{
    Scanner input= new Scanner(System.in);
    Random random=new Random();
    int guessno;
    int number=0;
    public int points=1;
    public Game()
    {
        this.number=random.nextInt(101);
        guessno=0;
    }

    void userInput()
    {
      System.out.println("Guess the number :");
      this.guessno=input.nextInt();
    }

    void Correctno()
    {
        if(guessno==number)
        {
            System.out.println("Ye ye you guessed it right!! and you guessed it in "+ points +" no. of times");
        }
        else if(guessno<number)
        {
            System.out.println("Entered no is smaller than the computer value enter greater no. ");
            enteragain();
        }
        else if(guessno>number)
        {
            System.out.println("Entered no is greater than the computer value enter smaller value ");
            enteragain();
        }
    }

    void enteragain()
    {
        points++;
        System.out.println("Enter again : ");
        guessno=input.nextInt();
        Correctno();
    }
}

public class Guesstheno {
    public static void main(String[] args)
    {
      Game guess=new Game();
      guess.userInput();
      guess.Correctno();

    }
}

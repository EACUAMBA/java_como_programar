package com.eacuamba.dev.chapter_6._6_10_study_of_case_a_unlucky_game_showing_enum_types;

import java.security.SecureRandom;

public class Craps{
	
	private static final SecureRandom secureRandom = new SecureRandom();
	
	public static enum Status{CONTINUE, WON, LOST};
	
	public static final int SNAKE_EYES = 2;
	public static final int TREY = 3;
	public static final int SEVEN = 7;
	public static final int YO_ELEVEN = 11;
	public static final int BOX_CARDS = 12;
	
	public static void main(String args[]){
		
		int myPoint = 0;
		Status gameStatus;
		int sumOfDice = rollDice();
		
		switch(sumOfDice){
			
			case SEVEN:
			case YO_ELEVEN:
			gameStatus = Status.WON;
			break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARDS:
			gameStatus=Status.LOST;
			break;
			default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}
		
		while(gameStatus == Status.CONTINUE){
			
			sumOfDice = rollDice();
			
			if(sumOfDice == myPoint)
			gameStatus = Status.WON;
			else
			if(sumOfDice == SEVEN)
			gameStatus = Status.LOST;
			
		}
		
		if(gameStatus == Status.WON)
			System.out.printf("Player wins.");
		else
			System.out.printf("Player Lost");
			
		
	}
	
	public static int rollDice(){
			
			int dice1 = 1 + secureRandom.nextInt(6);
			int dice2 = 1 + secureRandom.nextInt(6);
			
			int sum = dice1 + dice2;
			
			System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);
			
			return sum;
			
		}
	
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.main;

/**
 *
 * @author KENT
 */
public class Main {
    public static void main(String[] args) {
        Game myGame = new Game(7); // create a new game with 7 attempts
        myGame.play(); // start the game
        
        String[] words = {"apel", "pisang", "mangga"};
        WordGuessingGame wordGame = new WordGuessingGame(5, words);
        wordGame.play();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.main;

/**
 *
 * @author KENT
 */
class NumberGuessingGame extends Game {
    public NumberGuessingGame(int guessLimit) {
        super(guessLimit);
    }
    @Override
    public void play() {
        super.play();   
        System.out.println("Terima kasih sudah bermain!");
    }
}
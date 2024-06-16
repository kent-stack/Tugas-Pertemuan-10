/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.main;

import java.util.Random;

/**
 *
 * @author KENT
 */
class WordGuessingGame extends Game{
    private final String[] words;

    public WordGuessingGame(int guessLimit, String[] words) {
        super(guessLimit);
        this.words = words;
    }
    @Override
    public void generateNumber() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        secretNumber = index;
    }
    @Override
    public String checkGuess(int guess) {
        if (guess == secretNumber) {
            return "Benar! Anda menebak kata \"" + words[secretNumber] + "\"";
        } else if (guess > secretNumber) {
            return "Kata yang dicari ada di urutan alfabet yang lebih awal";
        } else {
            return "Kata yang dicari ada di urutan alfabet yang lebih akhir";
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.main;
/**
 *
 * @author KENT
 */
import java.util.Random;
import java.util.Scanner;

class Game {
    int secretNumber;
    private final int guessLimit;

    public Game(int guessLimit) {
        this.guessLimit = guessLimit;
    }

    public void generateNumber() {
        Random rand = new Random();
        secretNumber = rand.nextInt(100) + 1; // generate random number between 1 and 100
    }

    public int getGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tebakan Anda: ");
        return scanner.nextInt();
    }

    public String checkGuess(int guess) {
        if (guess == secretNumber) {
            return "Benar!";
        } else if (guess > secretNumber) {
            return "Terlalu tinggi, coba lagi!";
        } else {
            return "Terlalu rendah, coba lagi!";
        }
    }

    public void play() {
        generateNumber();
        int attempts = 0;
        while (attempts < guessLimit) {
            int guess = getGuess();
            String result = checkGuess(guess);
            System.out.println(result);
            if (result.equals("Benar")) {
                System.out.println("Selamat, Anda menang!");
                break;
            }
            attempts++;
        }
        if (attempts == guessLimit) {
            System.out.println("Sayang, Anda kalah. Angka yang benar adalah " + secretNumber);
        }
    }
}


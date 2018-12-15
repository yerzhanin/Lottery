package com.epam.java;

public class startLotoProgram {
    public static void main(String[] args) {
        Loto loto = new Loto(90, 15, new Roll());
        Player[] players = new Player[10];
        for (int i=0; i<players.length; i++ ){
            players[i] = new Player();
            loto.addPlayer(players[i]);

        }
        loto.startGame();
        int i = 0;
    }
}

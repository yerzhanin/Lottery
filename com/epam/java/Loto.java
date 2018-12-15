package com.epam.java;

import java.util.ArrayList;
import java.util.List;

public class Loto {
    private Integer allPlayingNumbersCount; //Count of all playing numbers
    private Integer winNumbersCount; //Count of win numbers
    private List <Player> players = new ArrayList<>();
    private List <Player> winners = new ArrayList<>();
    private Roll roll;

    public Loto(Integer allNumbersCount, Integer winNumbersCount, Roll roll) {
        this.allPlayingNumbersCount = allNumbersCount;
        this.winNumbersCount = winNumbersCount;
        this.roll = roll;
    }

    public void startGame(){
        for (int i=1; i<=allPlayingNumbersCount; i++){
            int curNumber = roll.getRandomNumber();
            for (Player player: players) {
                player.checkTickets(curNumber);
            }
        }
    }

    public void addPlayer(Player player){
        if (!players.contains(player)) {
            players.add(player);
        }
        player.addTicket(new Ticket(allPlayingNumbersCount));
    }

    public void removePlayer(Player player){
        if (players.contains(player)) {
            players.remove(player);
        }
    }
    public void addWinner(Player player){

    }
}

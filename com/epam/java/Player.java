package com.epam.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    List<Ticket> tickets = new ArrayList<>();

    public void checkTickets(int currentNumber) {
        for (Ticket ticket : tickets) {
            checkTicket(currentNumber, ticket);
        }
    }

    private void checkTicket(int currentNumber, Ticket ticket) {
        for (RandomNumber randomNumber : ticket.numbers) {
            if (currentNumber == randomNumber.getNumber()) {
                randomNumber.setSign(true);
            }
            break;
        }
    }

    public void addTicket(Ticket ticket) {
        completeTicket(ticket);
        tickets.add(ticket);
    }

    private void completeTicket(Ticket ticket){
        for (RandomNumber randomNumber: ticket.numbers) {
             randomNumber.setNumber((int) (Math.random()*90));
        }
    }
}

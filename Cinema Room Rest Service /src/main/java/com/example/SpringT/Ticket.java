package com.example.SpringT;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Ticket {
    UUID token;
    Seat ticket;

    public static List<Seat> booked_seat = new ArrayList<>();
    public static List<UUID> booked_token = new ArrayList<>();

    public static void BookedToken() {
        for (int j = 0; j < 81; j++) {
            booked_token.add(j, null);
        }
    }

    public static void BookedSeat() {
        for (int i = 0; i < 81; i++) {
            booked_seat.add(i, new Seat(0,0,0));
        }
    }

    public Ticket(UUID token) {
        this.token = token;
    }

    public Ticket(UUID token, Seat ticket) {
        this.token = token;
        this.ticket = ticket;
    }

    public UUID getToken() {
        return token;
    }

    public void setToken(UUID token) {
        this.token = token;
    }

    public Seat getTicket() {
        return ticket;
    }

    public void setTicket(Seat ticket) {
        this.ticket = ticket;
    }
}

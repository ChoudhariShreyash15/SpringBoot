package org.example.StreamAPI;

public class Player {
    private int id;
    private String playerName;
    private int runs;

    // constructor, getters, setters
    public Player(int id, String playerName, int runs) {
        this.id = id;
        this.playerName = playerName;
        this.runs = runs;
    }

    public int getId() {
        return id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", playerName='" + playerName + '\'' +
                ", runs=" + runs +
                '}';
    }
}

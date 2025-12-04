package org.example.StreamAPI;

import java.util.*;

public class MaxRuns {
    public static void main(String[] args) {
        List<Player> players = Arrays.asList(
                new Player(1, "Virat Kohli", 100),
                new Player(2, "Rohit Sharma", 97),
                new Player(3, "Surya Kumar", 61),
                new Player(4, "Hardik Pandya", 42)
        );

        // Find player with maximum runs
        Player topPlayer = players.stream()
                .max(Comparator.comparingInt(Player::getRuns))
                .orElse(null);

        System.out.println("Player with maximum runs: " + topPlayer);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package league.managment;
import league.people.*;
import java.util.ArrayList;

/**
 *
 * @author USER
 */public class Team {
    private String name;
    private String department;
    private String captain;
    private Coach coach;
    private ArrayList<Player> players;
    private int maxPlayers;

    public Team(String name, String department, String captain, Coach coach, int maxPlayers) {
        this.name = name;
        this.department = department;
        this.captain = captain;
        this.coach = coach;
        this.players = new ArrayList<>();
        this.maxPlayers = maxPlayers;
    }

    public boolean addPlayer(Player player) {
        if (players.size() < maxPlayers) {
            players.add(player);
            return true;
        } else {
            System.out.println("Player limit reached for team: " + name);
            return false;
        }
    }

    public void displayTeam() {
        System.out.println("Team: " + name + " (Department: " + department + ")");
        System.out.println("Captain: " + captain);
        coach.display();
        System.out.println("Players:");
        for (Player p : players) {
            p.display();
        }
    }
}
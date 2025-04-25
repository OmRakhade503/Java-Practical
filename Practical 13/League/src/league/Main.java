package league;

import java.util.Scanner;
import league.people.*;
import league.managment.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FootballLeague league = null;

        while (true) {
            System.out.println("\n1. Create League");
            System.out.println("2. Register Team");
            System.out.println("3. Show League Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter League Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Start Date: ");
                    String startDate = scanner.nextLine();
                    System.out.print("Enter Hosting Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Faculty Coordinator: ");
                    String faculty = scanner.nextLine();
                    System.out.print("Enter Student Coordinator: ");
                    String student = scanner.nextLine();
                    System.out.print("Enter Maximum Teams: ");
                    int maxTeams = scanner.nextInt();
                    System.out.print("Enter Players per Team: ");
                    int maxPlayers = scanner.nextInt();
                    league = new FootballLeague(name, startDate, department, faculty, student, maxTeams, maxPlayers);
                    break;

                case 2:
                    if (league == null) {
                        System.out.println("Create a league first!");
                        break;
                    }
                    System.out.print("Enter Team Name: ");
                    String teamName = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String teamDept = scanner.nextLine();
                    System.out.print("Enter Captain Name: ");
                    String captain = scanner.nextLine();
                    System.out.print("Enter Coach Name: ");
                    String coachName = scanner.nextLine();
                    System.out.print("Enter Coach Age: ");
                    int coachAge = scanner.nextInt();
                    System.out.print("Enter Coach Experience: ");
                    int coachExp = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Coach coach = new Coach(coachName, coachAge, coachExp);
                    Team team = new Team(teamName, teamDept, captain, coach, league.getMaxPlayersPerTeam());
                    league.addTeam(team);

                    // Adding players to the team
                    System.out.println("Enter number of players for the team:");
                    int numPlayers = scanner.nextInt();
                    scanner.nextLine(); // to consume newline after integer input

                    for (int i = 0; i < numPlayers; i++) {
                        System.out.println("Enter details for Player " + (i + 1));
                        
                        System.out.print("Player Name: ");
                        String playerName = scanner.nextLine();
                        
                        System.out.print("Player Age: ");
                        int playerAge = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        
                        System.out.print("Player Position: ");
                        String playerPosition = scanner.nextLine();
                        
                        System.out.print("Player Goals: ");
                        int playerGoals = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        
                        Player player = new Player(playerName, playerAge, playerPosition, playerGoals);
                        if (!team.addPlayer(player)) {
                            System.out.println("Player could not be added. Max players reached.");
                            break; // stop adding players once the limit is reached
                        }
                    }
                    break;

                case 3:
                    if (league != null) {
                        league.displayTeams();
                    } else {
                        System.out.println("No league created yet.");
                    }
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}

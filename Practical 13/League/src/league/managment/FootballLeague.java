
package league.managment;
import league.managment.*;
import java.util.ArrayList;
/**
 *
 * @author USER
 */

interface League {
    void addTeam(Team team);
    void displayTeams();
}

public class FootballLeague implements League {
    private String leagueName;
    private String startDate;
    private String hostingDepartment;
    private String facultyCoordinator;
    private String studentCoordinator;
    private int maxTeams;
    private int maxPlayersPerTeam;
    private ArrayList<Team> teams;

    public FootballLeague(String leagueName, String startDate, String hostingDepartment, String facultyCoordinator, String studentCoordinator, int maxTeams, int maxPlayersPerTeam) {
        this.leagueName = leagueName;
        this.startDate = startDate;
        this.hostingDepartment = hostingDepartment;
        this.facultyCoordinator = facultyCoordinator;
        this.studentCoordinator = studentCoordinator;
        this.maxTeams = maxTeams;
        this.maxPlayersPerTeam = maxPlayersPerTeam;
        this.teams = new ArrayList<>();
    }

   @Override
    public void addTeam(Team team) {
        if (teams.size() < maxTeams) {
            teams.add(team);
            System.out.println("Team registered successfully!");
        } else {
            System.out.println("Team limit reached! Cannot add more teams.");
        }
    }


    public void displayTeams() {
        System.out.println("League: " + leagueName + " (Start Date: " + startDate + ")");
        System.out.println("Hosting Department: " + hostingDepartment);
        System.out.println("Faculty Coordinator: " + facultyCoordinator);
        System.out.println("Student Coordinator: " + studentCoordinator);
        System.out.println("Teams:");
        for (Team t : teams) {
            t.displayTeam();
        }
    }
    
     public int getMaxPlayersPerTeam() {
        return maxPlayersPerTeam;
    }
}

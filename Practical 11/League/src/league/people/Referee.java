/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package league.people;
import league.people.Person;
/**
 *
 * @author USER
 */
public class Referee extends Person {
    private int matchesOfficiated;

    public Referee(String name, int age, int matchesOfficiated) {
        super(name, age);
        this.matchesOfficiated = matchesOfficiated;
    }

    public void display() {
        super.display();
        System.out.println("Matches Officiated: " + matchesOfficiated);
    }

}

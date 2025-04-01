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
public class Player extends Person {
     private String position;
    private int goals;

    public Player(String name, int age, String position, int goals) {
        super(name, age);
        this.position = position;
        this.goals = goals;
    }
    
    public void display() {
        super.display();
        System.out.println("Position: " + position + ", Goals: " + goals);
    }
}

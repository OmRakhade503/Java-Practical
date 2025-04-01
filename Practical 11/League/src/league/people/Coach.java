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
public class Coach extends Person {
        private int experience;

    public Coach(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public void display() {
        super.display();
        System.out.println("Experience: " + experience + " years");
    }
}

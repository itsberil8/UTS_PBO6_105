package src;
import java.util.*;

class Character {
    String nama;
    int heal;
    String weapon;
    int attackP;
    int mana;

    // membuat constructor
    Character(String nama, int heal, String weapon, int attackP, int mana) { 
        this.nama = nama;
        this.heal = heal; 
        this.weapon = weapon;
        this.attackP = attackP;
        this.mana = mana;
        print();
    }

    void attack() {
        this.mana -= 5;
        System.out.println(this.nama + " menyerang si sotong");
        System.out.println("sotong terkena demage sebanyak " + this.attackP);
    }

    void demage(int attackP) {
        System.out.println(this.nama + " terkena demage sebanyak " + attackP);
        this.heal -= attackP;
    }

    void print() {
        System.out.println("nama: " + nama);  
        System.out.println("heal: " + heal);
        System.out.println("weapon: " + weapon);
        System.out.println("attack power: " + attackP);
        System.out.println("mana: " + mana);
    }
}

public class Main {
    public static void main(String[] args) {
        Character character1 = new Character("ucup", 100, "pedang excalibur", 5, 100);
        character1.attack();
        character1.demage(10);
        character1.print();
    }
}

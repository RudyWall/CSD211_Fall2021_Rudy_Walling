/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.q1;

import java.util.Objects;

/**
 *
 * @author rudyw
 */
public class Person {

    private String name;
    private String role;
    private int age;
    private double height;
    private double weight;
    private char gender;

    public Person() {
        name = "name to be input";
        role = "role to be input";
        age = 0;
        height = 0.0;
        weight = 0.0;
        gender = 'M';
    }

    Person(String n, String r, int i, char g) {
        name = n;
        role = r;
        age = i;
        height = 0.0;
        weight = 0.0;
        gender = g;
    }

    Person(String n, String r, int i, double h, double w, char g) {
        name = n;
        role = r;
        age = i;
        height = h;
        weight = w;
        gender = g;
    }

    Person(String n, String l) {
        name = n;
        role = l;
    }

    @Override
    public String toString() {
        return "\nName : " + name + " " + role + "\nAge : " + age + "\nHeight : " + height + "cm" + "\nWeight : " + weight + "kg" + "\nGender : " + gender;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person) obj;
        if (p.getWeight() == this.getWeight()
                && p.getHeight() == this.getHeight()
                && p.getAge() == this.getAge()
                && p.name.equals(this.name)
                && p.role.equals(this.role)
                && p.getGender() == this.getGender()) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.role);
        hash = 79 * hash + this.age;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 79 * hash + this.gender;
        return hash;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}

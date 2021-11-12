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
public class Car {
    private String make;
    private String model;
    private int year;
    private Person person;
    private int VIN;
    public Car(){
            make="to be input";
            model="to be input";
            person=new Person("no","name");
            year=0000;
            VIN=000;
}
    Car(String m, String mo, int y, Person p, int V){
        make=m;
        model=mo;
        year=y;
        person=p;
        VIN=V;
    }

    Car(String m, String mo, int y) {
        make=m;
        model=mo;
        year=y;
    }

    Car(String m, String mo, int y, Person n) {
        make=m;
        model=mo;
        year=y;
        person=n;
    }Car(String m, String mo, int y, int V) {
        make=m;
        model=mo;
        year=y;
        VIN=V;
    }
    @Override
    public String toString(){
        return "Make : "+make+"\nmodel : "+model+"\nyear : "+year+"\nowner : "+person+"\nVIN : "+VIN;
    }
    @Override
    public boolean equals(Object obj){
        if (! (obj instanceof Car))
            return false;
        Car c=(Car)obj;
        if(
                c.getmake().equals(this.getmake()) &&
                c.getVIN() == this.getVIN() &&
                c.getmodel().equals(this.getmodel()) &&
                c.getyear() == this.getyear())
                return true;
                
                return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.make);
        hash = 71 * hash + Objects.hashCode(this.model);
        hash = 71 * hash + this.year;
        hash = 71 * hash + Objects.hashCode(this.person);
        hash = 71 * hash + this.VIN;
        return hash;
    }
    public String getmake(){
        return make;
    }
    public void setmake(String make){
        this.make = make;
    }
    public String getmodel(){
        return model;
    }
    public void setmodel(String model){
        this.model = model;
    }
    public int getyear(){
        return year;
    }
    public void setyear(int year){
        this.year = year;
    }
    public Person getperson(){
        return person;
    }
    public void setperson(Person person){
        this.person=person;
    }
    public int getVIN(){
        return VIN;
    }
    public void setVIN(int VIN){
        this.VIN=VIN;
    }
}
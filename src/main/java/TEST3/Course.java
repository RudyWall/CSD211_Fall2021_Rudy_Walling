/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST3;

/**
 *
 * @author rudyw
 */
public class Course {

    //the next lines before public Coutse() are all instance variables
    String name;
    String code;
    String startDate;
    int numberOfStudents;
    int count;

    public Course() {
        //these are local variables
        name = "tobeinput";
        code = "ABC123";
        startDate = "0";
        numberOfStudents = 0;
        count = 0;
    }

    public Course(String n, String c, String d, int num, int i) {
        //these are method parameters
        name = n;
        code = c;
        startDate = d;
        numberOfStudents = num;
        count = i;
    }
    @Override
    public String toString(){
        return "[ "+ code +", " +name+" ]\nstarts: "+startDate+"\nnumber of students : "+numberOfStudents+"\ncount: "+count;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode() {
        this.code = code;
    }

    public String getDate() {
        return startDate;
    }

    public void setDate() {
        this.startDate = startDate;
    }

    public int getNumber() {
        return numberOfStudents;
    }

    public void setNumber() {
        this.numberOfStudents = numberOfStudents;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count = count;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rudyw
 */
public class App {

    String menu = "-----------------------------\n1.Add course\n2.Edit a course\n3.List Courses\n99.quit\n-----------------------------";
    private List<Course> courses = new ArrayList<Course>();
    private Scanner input = new Scanner(System.in);

    public void run() {

        boolean done = false;
        while (!done) {
            System.out.println(menu);
            System.out.println("\nEnter option: ");
            String myinput = input.nextLine();
            switch (myinput) {
                case "1":
                    addCourse();
                    break;
                case "2":
                    editCourse();
                    break;
                case "3":
                    listCourse();
                    break;
                case "99":
                    done = true;
                    break;

                default:
                    System.out.println("Thats not an option. \nPress ENTER to Continue.");
                    input.nextLine();
            }
        }
    }

    public void addCourse() {
        System.out.println("Creating new course...\nEnter course name: ");
        String n = input.nextLine();
        System.out.println("Enter course code: ");
        String c = input.nextLine();
        System.out.println("Enter course start date: ");
        String d = input.nextLine();
        System.out.println("Enter course number of students: ");
        int num = Integer.parseInt(input.nextLine());
        System.out.println("Enter course count: ");
        int i = Integer.parseInt(input.nextLine());
        Course course = new Course(n, c, d, num, i);
        courses.add(course);
    }

    public void editCourse() {
        System.out.println("Enter course number to edit or input '99' to return to menu: ");
        int coursenumber = Integer.parseInt(input.nextLine());
        if (coursenumber == 99) {
            return;
        } else {
            System.out.println("Enter course name: ");
        }
        String n = input.nextLine();
        System.out.println("Enter course code: ");
        String c = input.nextLine();
        System.out.println("Enter course start date: ");
        String d = input.nextLine();
        System.out.println("Enter course number of students: ");
        int num = Integer.parseInt(input.nextLine());
        System.out.println("Enter course count: ");
        int i = Integer.parseInt(input.nextLine());

        Course coursetemp = new Course(n, c, d, num, i);
        courses.set(coursenumber, coursetemp);
    }

    public void listCourse() {
        System.out.println("List of all courses:\n");
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i) != null) {
                System.out.println("Course " + i + ":\n" + courses.get(i) + "\n");
            } else {
                break;
            }
        }
        System.out.println("Press ENTER to return to menu.");
        input.nextLine();
    }

}

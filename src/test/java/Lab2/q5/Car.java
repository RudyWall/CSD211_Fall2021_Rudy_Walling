/**
 * Author: Rudy Walling
 * Date: October 5, 2021
 * Description: Shows variable scopes that are
 * instance variables, class variables, local
 * variables and parameters.
 */
package Lab2.q5;

/**
 *
 * @author rudyw
 */
public class Car {
    //instance variable
    private int instancev;
    //static variable
    static int Staticv;
    //class variable
    int classv;
    public static void main(String[] args){
        //local variable and parameter
        String localv = "this is a parameter";
        System.out.println(localv);
    }
}


package lab1;

import lab1.LucasNumber;

import java.util.Scanner;

/**
 * Class where we use our methods
 * @author  Chernysh Yaryna
 * @version 1.0
 */
public class Main {
    /**
     * Method where we use methods from other classes
     * @param args This used to read from command prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter which Lucas number you want to get:");
        Scanner scan = new Scanner(System.in);
        int nl = (scan.nextInt())-1;
        LucasNumber num = new LucasNumber(nl);
        //System.out.println();
        System.out.println(num.getNumber(nl)+" is number "+num.getOrder());
        System.out.println("The statements n*L(n+1)>(n+1)*L(n)) is " + num.check());
        System.out.println(num.getOrder()+"*"+ num.getNumber(nl+1)+">"+ (num.getOrder()+1)+"*"+num.getNumber(nl));
    }
}

package lab1;
/**
 * Class with Lucas number
 * Used to store infromation of number
 * @author Chernysh Yaryna
 * @version 1.0
 */
public class LucasNumber {
    /**
     * Stores order by index
     */
    private int n;
    /**
     * Stores data number
     */
    int number;
    /**
     * Value of golden ratio
     */
    public static final double G = ((1+Math.sqrt(5))/2);
    /**
     * Sets the order of number
     */
    public LucasNumber( int n){
        this.n=n;
    }

    /**
     * This method is used to get Lucas num by its order
     * @param num This is the order of this num
     * @return int This returns number by formula
     */
    public  int getNumber(int num){
        number = (int)(Math.pow(G,num)+(Math.pow(-G,-num)));
        return number;
    }

    /**
     * This method used to check statements in our task
     * @return This returns either true or false
     */
    public boolean check(){
        return (n*getNumber(n+1)>(n+1)*getNumber(n));
    }

    /**
     * This method used to get private num in class
     * @return The order that user entered
     */
    public int getOrder(){
        return (n+1);
    }
}

package lab1;

public class LucasNumber {
    int n;
    public static final double G = ((1+Math.sqrt(5))/2);
    public LucasNumber( int n){
        this.n=n;
    }
    public  double getNumber(){
        double finalnum;
        n=n+1;
        finalnum = Math.pow(G,n)+(Math.pow(-G,-n));
        return finalnum;
    }
}

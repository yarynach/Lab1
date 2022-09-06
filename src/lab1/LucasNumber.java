package lab1;

public class LucasNumber {
    private int n;
    int number;
    public static final double G = ((1+Math.sqrt(5))/2);
    public LucasNumber( int n){
        this.n=n;
    }
    public  int getNumber(int num){
        number = (int)(Math.pow(G,num)+(Math.pow(-G,-num)));
        return number;
    }
    public boolean check(){
        return (n*getNumber(n+1)>(n+1)*getNumber(n));
    }
    public int getOrder(){
        return (n+1);
    }
}

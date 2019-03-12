import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        int x,rem,rev=0;
        Scanner myinput=new Scanner(System.in);
        System.out.println("enter a number");
        x=myinput.nextInt();
        while(x>0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        System.out.println(rev);

        
    }
}
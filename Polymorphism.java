class Bank{
    int getInterest()
    {
        return 0;

    }
}
class SBI extends Bank{
     int getInterest()
     {
         return 4;
     }

 }
 class ICIC extends Bank{
    int getInterest()
    {
        return 5;
    }
 }

public class Polymorphism{
    public static void main(String[] args) {
        Bank ob;
        ob=new SBI();
        System.out.println("SBI interest rate");
        System.out.println(ob.getInterest());
        ob=new ICIC();
        System.out.println("ICIC interest rate");
        System.out.println(ob.getInterest());
        
    }
}
        
    

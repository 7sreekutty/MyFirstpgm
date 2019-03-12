class A{
    public void Car(){
    System.out.println("audicar");
}
}
class B {
    public void Bike()
    {
        System.out.println("Duke Bike");

    }}
class C extends A{
    public void Cycle()
    {
        System.out.println("LadyBird Cycle");
    }}
    public class Inheritance{
        public static void main(String[] args) {
            C ob=new C();
            ob.Car();
            
        }
    }


 class Car1 {
     private Engine engine;
     Car1()
     {
         engine = new Engine ();
     }
     void startCar(){
         engine.start();
         System.out.println("car starts");
     }
 }
 
 class Engine{
     void start()
     {
         System.out.println("Engine starts");
     }
 }
     class Main8{
         public static void main(String[] args){
             Car1 c1 = new Car1();
             c1.startCar();
         }
}


class Animal{
    void sound (){
        System.out.println("the Animal makes the sound !!");
    }
}
class dog extends Animal {
    dog(){
        System.out.println("His this dog constructor");
    }
    void eat(){
        System.out.println("the dog cn eat also !!");
    }
}
class Main6{
    public static void main(String[] args){
        Animal a1 = new dog();
        a1.sound();
        dog d1 = (dog ) a1;
        d1.eat();
        ((dog)a1).eat();
    }
}
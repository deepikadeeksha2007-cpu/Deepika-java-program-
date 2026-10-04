interface Samsung{
    int add(int a, int b);
    default void display(){
        System.out.println("This is a add method");
    }
}
class Main10{
    public static void main(String[] args) {
        Samsung s1 = (a,b) -> a + b;
        s1.add(10,20);
        System.out.println(s1.add(10,20));
        s1.display();
    }
}
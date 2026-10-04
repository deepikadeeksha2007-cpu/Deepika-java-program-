public class Main5
{
    String name;
    double salary;
    void ShowDetails()
    {
        System.out.println(name + "earns Rs." +salary);
    }
    public static void main(String[] args)
    {
        Manager m = new Manager();
        m.name = "deepika";
        m.salary = 90000;
        m.ShowDetails();
        m.conductMeating();
        
        Developer d = new Developer();
        d.name = "deeksha";
        d.salary = 70000;
        d.ShowDetails(); d.writeCode();
    }
}
class Manager extends Main5
{
    void conductMeating()
    {
        System.out.println(name + "is conducting a meating");
    }
}
class Developer extends Main5
{
    void writeCode()
    {
     System.out.println(name + "is Writing a code");
    }
}
class Tester extends Main5
{
    void testApp()
    {
        System.out.println(name + "is Testing the app");
    }
}
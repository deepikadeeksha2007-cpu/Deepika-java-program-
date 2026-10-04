class Teacher1
{
    String name;
    Teacher1(String name)
    {
        this.name = name;
    }
}
class Department
{
    Teacher1 teacher1;
    Department(Teacher1 teacher1)
    {
        this.teacher1 = teacher1;
    }
    void display()
    {
        System.out.println(teacher1.name);
    }
}
class Main7
{
    public static void main(String[] args)
    {
        Teacher1 t1 = new Teacher1("Kavyashree");
        Department d1 = new Department(t1);
        d1.display();
    }
}
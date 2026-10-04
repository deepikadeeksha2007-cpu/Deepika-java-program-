class pizza {
    String size; String crust;int Cheese;
    pizza()
    {
        this("Medium");
    }
    pizza(String size)
    {
        this(size,"Thin");
    }
    pizza (String size,String crust )
    {
        this(size, crust, 1);
    }
    pizza (String size, String crust , int Cheese)
    {
        this.size = size;
        this.crust = crust;
        this.Cheese = Cheese;
    }
}
public class Main9 {
    public static void main(String[] args) {
        pizza p = new pizza();
        System.out.println("Size: " + p.size);
        System.out.println("Crust: " + p.crust);
        System.out.println("Cheese: " + p.Cheese);
    }
}
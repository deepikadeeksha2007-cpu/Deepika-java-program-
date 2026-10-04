
class Main12
{
    public static void main(String[] args)
    {
        String s = "Learn java programing";
        System.out.println(s.length());
        System.out.println(s.charAt(6));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf("java"));
        System.out.println(s.substring(6, 10));
        System.out.println(s.substring(11));
        System.out.println(s.contains("gram") + " " +
        s.startsWith("Learn")+ " " +s.endsWith("ing"));
    }
}
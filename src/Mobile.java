public class Mobile {
    public void displayName(){
        System.out.println("Smart Mobile");
    }
}
class Samsung extends Mobile{
    public void displayName(){
        System.out.println("Samsung Galaxy Note 22 ULTRA");
        super.displayName();
    }
}
class Apple extends Samsung{
    public void displyName(){
        System.out.println("IPhone 14 Pro Max");
        super.displayName();
    }
}
class Run{
    public static void main(String[] args) {
        Samsung s = new Samsung();
        Apple a = new Apple();
        s.displayName();
        a.displyName();
    }
}
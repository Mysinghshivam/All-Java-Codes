abstract class animal{
    animal(){
        System.out.println("constructor of animal: ");
    }
    abstract public void walks();
    public void eat(){
            System.out.println("method of animal: ");
    }
}
class horse extends animal{
    horse(){
        System.out.println("constructor of horse: ");
    }
    public void walks(){
        System.out.println("Horses has for legs:");
    }
}
class chicken extends animal{
    public void walks(){
        System.out.println("chicken has two legs:");
    }
}
public class abstraction {
    public static void main(String[] args) {
        //horse h1 = new horse();
        chicken h2 = new chicken();
        h2.walks();
        //h1.walks();
    }
}

class opps{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class student{
 public static void main(String [] args){
     opps obj =new opps();
     obj.name= "Shivam";
     obj.age=21;

     opps obj1 =new opps();
     obj1.name= "ram";
     obj1.age=23;

     obj.printInfo();
     obj1.printInfo();
 }
}


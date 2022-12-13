//method overloading and constructor overloading (static polymorphism)
//method overriding(Dynamic polymorphism (it concepts use in inheritance))
/*class exp3{
    public void area(){
        System.out.println("Area of triangle and Square:");
    }
    public void area(int base,int height){
        //triangle
      double area=0.5*base*height;
      System.out.println("Area of triangle:"+area);
    }
    public void area(int a){
        //square
        int area=a*a;
        System.out.println("Area of Square:"+area);
    }
   }
public class polymorphism {
    public static void main(String [] args){
     exp3 s1=new exp3();
     s1.area();
     s1.area(25,12);
     s1.area(3);
    }
}*/


//method overriding
class exp3{
    int a,b;
    public void show(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
}
class exp_3 extends exp3{
    int c;
    public void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
       // super.show();
    }
}
public class polymorphism{
    public static void main(String [] args){
        exp_3 s1=new exp_3();
        s1.a=10;
        s1.b=20;
        s1.c=30;
        s1.show();
    }
}
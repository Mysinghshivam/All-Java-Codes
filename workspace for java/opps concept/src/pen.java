//start
/*
class Pen{
    String color;
    String type;

     public void print(){
         System.out.println(color);
         System.out.println(type);
     }
}
class Main{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.type = "Ballpen";
        p1.print();

    }
}*/

//constructor

/*class pen {
    String color;
    String type;
     pen(String color , String type){
         this.color = color;
         this.type = type;
     }

     public void print(){
         System.out.println(color);
         System.out.println(type);
     }
}

class main {
    public static void main(String[] args) {
        pen p1 = new pen("red", "gelpen");
        p1.print();
    }
}*/

//Copy constructor
class pen {
    String color;
    String type;

    pen(pen p1) {
        this.color = p1.color;
        this.type = p1.type;
    }
    pen(){
    }

    public void print(){
        System.out.println(color);
        System.out.println(type);
    }
}
class main{
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color = "red";
        p1.type = "gelpen";

         pen p2 = new pen(p1);

         p2.print();

    }
}

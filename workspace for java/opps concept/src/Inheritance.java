//there are four types of inheritance
//1.Single level inheritance...
//2.Multilevel inheritance..
//3.hierarchical inheritance..
//4.multiple inheritance..
//5.hybrid inheritance..
class shape {
    String Triangle_shape = "circular";
}

class triangle extends shape {
    public void look() {
        System.out.println("Triangle shape is: " + Triangle_shape);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        triangle t = new triangle();
        t.look();
    }
}

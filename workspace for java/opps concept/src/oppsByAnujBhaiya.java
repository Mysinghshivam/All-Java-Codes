public class oppsByAnujBhaiya {
    public static void main(String[] args) {
        person p1 = new person();

        p1.name = "Shivam";
        p1.age = 22;
        System.out.println(p1.name + " " + p1.age);

        person p2 = new person("shivam", 24);
        System.out.println(p2.name + " " + p2.age);

        p1.eat();
        p2.walk();
        p2.walk(2); //it work like constructor
    }
}

class person {
    String name;
    int age;

    static int count = 0;

    public person() {
        //constructor
        count++; //count how many constructor will be called.
        System.out.println(count + " ");
        //we can also initialize the va
        // vriable using constructor
    }

    public person(String name, int age) {
        this(); //to call the constructor in the same class
        this.name = name;   //Yaha par this ka use usi class ke variable ko initialize
        // karne ke liye ho raha hai
        this.age = age;
    }

    void eat() {
        System.out.println(name + " is eating:");
    }

    void walk() {
        System.out.println(name + " is walking:");
    }

    void walk(int steps) {
        System.out.println(name + " is walking:");
    }
}

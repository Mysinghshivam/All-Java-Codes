class exp2{
    String colour;
    int EXP_date;
   /* exp2(String colour,int EXP_date){
        this.colour=colour;
        this.EXP_date=EXP_date;
    }*/
    public void info(){
        System.out.println(this.colour);
        System.out.println(this.EXP_date);
    }
}
public class pen {
    public static void main(String [] args){
     exp2 s1=new exp2();
     s1.colour="BLack";
     s1.EXP_date=25;

     exp2 s2=new exp2();
     s2.colour="red";
     s2.EXP_date=20;

     exp2 s3=new exp2();
     s3.colour="blue";
     s3.EXP_date=15;
     s1.info();
     s2.info();
     s3.info();
    }
}

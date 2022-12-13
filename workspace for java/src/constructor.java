import java.util.*;
class nitesh
{
    float length,breath;
    nitesh(float l,float b)
    {
        length=l;
        breath=b;
    }
    void area()
    {
        float ar=(length*breath);
        System.out.print("area is: "+ar);
    }
}
public class constructor {
    public static void main(String args [])
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        float p=a.nextFloat();
        System.out.print("Enter the breath of rectangle");
        float q=a.nextFloat();
      nitesh x=new nitesh(p,q);
      x.area();
    }
}

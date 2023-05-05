package tp3_ex2;
import java.lang.*;
public class Eq2Degre {
    private double r1;
    private double r2;
    private double delta;
    private double a;
    private double b;
    private double c;

public Eq2Degre(double x1,double x2,double x3)
{
    this.a=x1;
    this.b=x2;
    this.c=x3;
    delta=b*b-4.0*a*c;
}



public void afficheDiscriminant()
{
    System.out.println("delta = "+ delta);
}
public void resoudre()
{
    if (delta>0)
    {
        r1=((-b-(Math.sqrt(delta)))/2*a);
        r2=((-b+(Math.sqrt(delta)))/2*a);
    }
    else if (delta==0)
    {
        r1=(-b/(2*a));
    }
    }



public void afficheSolution()
{
    if (delta>0)
    {
       System.out.println(r1);
       System.out.println(r2);
    }
    else if (delta<0) {
        System.out.println(" la solution n'admet pas des solution reel");
    }
    else if(delta==0)
    {
        System.out.println(r1);
    }
}
public static void main(String[]args)
{
  Eq2Degre eq =new Eq2Degre(-2.0,1.0,3.0) ;
  eq.afficheDiscriminant();
    eq.resoudre();
    eq.afficheSolution();

}
}

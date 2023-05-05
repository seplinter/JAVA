package tp3;
import java.lang.*;

public  class Point{
    private Double x;
    private Double y;


    public void setX(Double x)
    {
        this.x=x;
    }
    public void setY(Double y)
    {
        this.y=y;
    }
public Point(Double x,Double y){
    this.x=x;
    this.y=y;
    }
public Point()
{

}

public Double getX()
{
    return x;
}
public Double getY()
{
    return y;
}
public Double distance()
{
return Math.sqrt(x*x + y*y);
}

public String toString()
{
return ("["+ x +":" + y+"]");
}


}
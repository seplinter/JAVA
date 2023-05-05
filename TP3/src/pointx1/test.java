package pointx1;

public class test {

    public static void main(String[]args)
    {
        double x=3;
        double y=5;
        tp3.Point Point=new tp3.Point(x,y);


        Point.setX(x);

        Point.setY(y);

        Double distance = Point.distance();
        String cords = Point.toString();

        System.out.print("La distance entre ["+x+":"+y+"] et " + cords + " = " + distance);


    }


}

class Point{
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

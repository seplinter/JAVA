package tp3;
import java.lang.*;

import static tp3.Point.*;

public class TestPoint {





        public static void main(String[]args)
        {
            double x=3;
            double y=5;
            Point Point=new Point(x,y);


            Point.setX(x);

            Point.setY(y);

            Double distance = Point.distance();
            String cords = Point.toString();

            System.out.print("La distance entre ["+x+":"+y+"] et " + cords + " = " + distance);


        }


}
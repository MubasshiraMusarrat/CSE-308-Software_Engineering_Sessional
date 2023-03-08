import SHAPE.Circle;
import SHAPE.Rectangle;
import SHAPE.Shape;
import SHAPE.Square;

public class ShapeFactory {
   public Shape getShape(String st, double a, double b){
      if(st.equalsIgnoreCase("Circle"))
         return new Circle(a);
      else if (st.equalsIgnoreCase("Square"))
         return new Square(a);
      else if(st.equalsIgnoreCase("Rectangle"))
         return new Rectangle(a,b);
      else
         System.out.println("Invalid shape name");

      return null;
   }
}

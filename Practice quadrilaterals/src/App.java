import java.util.Scanner;
import java.util.Random;

interface parallelogram {
   static void properties_of_a_parallelogram(){
System.out.println("Opposite sides are equal");
System.out.println("Diagonals bisect each other");
System.out.println("Opposite angles are equal");
System.out.println("Adjacent angles are supplementary");
   }
}

interface rhombus extends parallelogram {
    static void properties_of_a_rhombus(){
        System.out.println("Diagonals are perpendicular to each other");
        System.out.println("Diagonals bisect the vertex angles");
        System.out.println("All sides are equal");
    }
}

interface rectangle extends parallelogram {
    static void properties_of_a_rectangle() {
        System.out.println("All angles are 90 degrees");
        System.out.println("Diagonals are equal");
    }
}

interface square extends parallelogram,rhombus,rectangle{

}

interface trapezium{
    static void properties_of_a_trapezium(){
        System.out.println("One pair of opposite sides are parallel");
        System.out.println("Adjacent angles are supplementary");
    }
}

interface isoscelles_trapezium extends trapezium{
    static void properties_of_an_isoscelles_trapezium(){
        System.out.println("Angles on the same base are equal");
        System.out.println("Angles on sides are supplementary");
    }
}
interface kite{
     static void properties_of_a_kite(){
        System.out.println("Diagonals intersect at 90 degrees");
        System.out.println("The longer diagonal always bisects the shorter diagonal");
        System.out.println("The longer diagonal bisects it's vertex angles");
        System.out.println("Adjacent sides are equal");
    }
}

class all_properties implements kite, trapezium, square, rectangle, rhombus, parallelogram, isoscelles_trapezium{

}

class general {
    public void gen() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        all_properties properties = new all_properties();
        System.out.println();
        System.out.println("Enter the quadrilateral you want to practice");
        String str1 = sc.next();
        if (str1.equalsIgnoreCase("parallelogram")) {
            System.out.println("Enter the properties of a parallelogram");
            String parallelogram1 = sc.next();
            System.out.println();
            System.out.println("Here are the properties of a parallelogram");
            parallelogram.properties_of_a_parallelogram();
        } else if (str1.equalsIgnoreCase("rhombus")) {
            System.out.println("Enter the properties of a rhombus");
            String parallelogram1 = sc.next();
            System.out.println();
            System.out.println("Here are the properties of a rhombus");
            parallelogram.properties_of_a_parallelogram();
            rhombus.properties_of_a_rhombus();
        } else if (str1.equalsIgnoreCase("rectangle")) {
            System.out.println("Enter the properties of a rectangle");
            String parallelogram1 = sc.next();
            System.out.println();
            System.out.println("Here are the properties of a rectangle");
            parallelogram.properties_of_a_parallelogram();
            rectangle.properties_of_a_rectangle();
        } else if (str1.equalsIgnoreCase("square")) {
            System.out.println("Enter the properties of a square");
            String parallelogram1 = sc.next();
            System.out.println();
            System.out.println("Here are the properties of a square");
            parallelogram.properties_of_a_parallelogram();
            rectangle.properties_of_a_rectangle();
            rhombus.properties_of_a_rhombus();
        } else if (str1.equalsIgnoreCase("trapezium")) {
            System.out.println("Enter the properties of a trapezium");
            String parallelogram1 = sc.next();
            System.out.println();
            System.out.println("Here are the properties of a trapezium");
            trapezium.properties_of_a_trapezium();
        } else if (str1.equalsIgnoreCase("kite")) {
            System.out.println("Enter the properties of a kite");
            String parallelogram1 = sc.next();
            System.out.println();
            System.out.println("Here are the properties of a kite");
            kite.properties_of_a_kite();
        }else if(str1.equalsIgnoreCase("itrap")){
            System.out.println("Enter the properties of an isoscelles trapezium");
            String parallelogram1 = sc.next();
            System.out.println();
            System.out.println("Here are the properties of an isoscelles trapezium");
            trapezium.properties_of_a_trapezium();
            isoscelles_trapezium.properties_of_an_isoscelles_trapezium();
        }else if (str1.equalsIgnoreCase("random")) {
            int random = 1 + r.nextInt(7);
            switch (random) {
                case 1 -> {
                    System.out.println("Enter the properties of a parallelogram");
                    String parallelogram2 = sc.next();
                    System.out.println();
                    System.out.println("Here are the properties of a parallelogram");
                    parallelogram.properties_of_a_parallelogram();
                }
                case 2 -> {
                    System.out.println("Enter the properties of a rhombus");
                    String parallelogram3 = sc.next();
                    System.out.println();
                    System.out.println("Here are the properties of a rhombus");
                    parallelogram.properties_of_a_parallelogram();
                    rhombus.properties_of_a_rhombus();
                }
                case 3 -> {
                    System.out.println("Enter the properties of a rectangle");
                    String parallelogram4 = sc.next();
                    System.out.println();
                    System.out.println("Here are th eproperties of a rectangle");
                    parallelogram.properties_of_a_parallelogram();
                    rectangle.properties_of_a_rectangle();
                }
                case 4 -> {
                    System.out.println("Enter the properties of a square");
                    String parallelogram5 = sc.next();
                    System.out.println();
                    System.out.println("Here are the properties of a square");
                    parallelogram.properties_of_a_parallelogram();
                    rectangle.properties_of_a_rectangle();
                    rhombus.properties_of_a_rhombus();
                }
                case 5 -> {
                    System.out.println("Enter the properties of a trapezium");
                    String parallelogram6 = sc.next();
                    System.out.println();
                    System.out.println("Here are the properties of a trapezium");
                    trapezium.properties_of_a_trapezium();
                }
                case 6 -> {
                    System.out.println("Enter the properties of a kite");
                    String parallelogram7 = sc.next();
                    System.out.println();
                    System.out.println("Here are the properties of a kite");
                    kite.properties_of_a_kite();
                }
                case 7 ->{
                    System.out.println("Enter the properties of an isoscelles trapezium");
                    String parallelogram8 = sc.next();
                    System.out.println();
                    System.out.println("Here are the properties of an isoscelles trapezium");
                    trapezium.properties_of_a_trapezium();
                    isoscelles_trapezium.properties_of_an_isoscelles_trapezium();
                }
            }
        }
        else if (str1.equalsIgnoreCase("quit")) {
            int n = 2;
            for (int i = 0; n > i;i--) {
                break;
            }
        }
        gen();
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Note: for isosceles trapezium use 'itrap'");
        general g = new general();
        g.gen();
    }
}

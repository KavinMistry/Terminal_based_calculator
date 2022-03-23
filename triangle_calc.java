import java.util.Scanner;
public class triangle_calc
{
    public static void main(String[] args)
    {
        int s1 = 0, s2 = 0, s3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" What would you like to calculate? ");
        System.out.println(" | Press '1' for Pythagoras Theorem calculator | Press '2' for Triangle type calculator | ");
        System.out.println(" | Press '3' if you would like to know the Pythagoras Theorem | ");
        System.out.println(" | Press '4' for a normal calculator | ");
        int ch1 = sc.nextInt();
        if(ch1 == 1)
        {
        System.out.println(" What information is given to you ? ");
        System.out.println("| Press 7 if base and height are given | Press 8 if base and hypotenuse are given | press 9 if height and hypotenuse are given | "); 
        int b = 0,h = 0,hp = 0;
        int chp = 0;
        chp = sc.nextInt();
        switch(chp)
        {
            case 7 :System.out.println(" Enter the length of base ");
                    b = sc.nextInt();
                    System.out.println(" Enter the length of height ");
                    h = sc.nextInt();
                    hp = b * b + h * h;
                    double rhp = Math.sqrt(hp);
                    System.out.println(" Hypotenuse is = " + rhp );
                    break;

            case 8 :System.out.println(" Enter the length of base ");
                    b = sc.nextInt();
                    System.out.println(" Enter the length of hypotenuse ");
                    hp = sc.nextInt();
                    h = hp * hp - b * b;
                    double rh = 0;
                    rh = Math.sqrt(h);
                    System.out.println(" height is = " + rh );
                    break;

            case 9 :System.out.println(" Enter the length of height ");
                    h = sc.nextInt();
                    System.out.println(" Enter the length of hypotenuse ");
                    hp = sc.nextInt();
                    b = hp * hp - h * h;
                    double rb = 0;
                    rb = Math.sqrt(b);
                    System.out.println(" base is = " + rb);
                    break;
            default :System.out.println(" Invalid ");
            } 
        }
        else if(ch1 == 2)
        {
            System.out.println(" Enter value of the first side ");
            s1 = sc.nextInt();
            System.out.println(" Enter value of the second side ");
            s2 = sc.nextInt();
            System.out.println(" Enter value of the third side ");
            s3 = sc.nextInt();
            if(s1 == s2 && s2 == s3)
            {
                System.out.println("It is an equilateral triangle");
            }
            else if(s1 == s2 && s2 != s3)
            {
                System.out.println("It is an isosceles triangle");
            }
            else if(s1 == s3 && s3 != s2)
            {
                System.out.println("It is an isosceles triangle");
            }
            else if(s2 == s3 && s3 != s1)
            {
                System.out.println("It is an isosceles triangle");
            }
            else if(s1 != s2 && s2 != s3 && s1 != s3)
            {
                System.out.println("It is an scalene triangle");
            }
            else
            {
                System.out.println("Unkown triangle type");
            }
        }
        else if(ch1==3)
        {
            System.out.println(" Here is the Pythagoras Theorem : ");
            System.out.println(" Pythagoras' theorem states that for all right-angled triangles, ");
            System.out.println(" The square on the hypotenuse is equal to the sum of the squares on the other two sides ");
        }
        else if(ch1==4)
        {
            System.out.println(" Enter the number of values ");
        }
    }
}

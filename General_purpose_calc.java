import java.util.Scanner;
import java.io.*;
public class General_purpose_calc
{
    public static void main(String[] args)
    {
        try
        {
        int ch1; //Declaring variables for selection system
        Scanner sc = new Scanner(System.in);
        System.out.println(" > What would you like to calculate? < ");//You could also use \n at the end of an option instead of System.out.println again and again
        System.out.println(" - Press '1' for a Pythagoras Theorem calculator ");
        System.out.println(" - Press '2' for a Normal calculator ");
        System.out.println(" - Press '3' for a Square Root calculator ");
        System.out.println(" - Press '4' for a Profit calculator ");
        System.out.println(" - Press '5' for an Area calculator ");
        System.out.println(" - Press '6' for a Perimeter calculator ");
        System.out.println(" - Press '7' for version information ");
        ch1 = sc.nextInt(); //Any integer entered at this point will be taken as the value for variable "ch1" and used to determine what the user wants to do
        if(ch1 == 1) //This part gets executed if user enters "1"
        {
        System.out.println(" What information is given to you ? ");
        System.out.println(" - Press 1 if base and height are given ");
        System.out.println(" - Press 2 if base and hypotenuse are given ");
        System.out.println(" - press 3 if height and hypotenuse are given ");
        double b, h, hp; //Declaring variables to be used in the following switch case
        int chp;
        chp = sc.nextInt();
        switch(chp)
        {
            case 1 :System.out.println(" > Enter the length of base ");
                    b = sc.nextDouble();
                    System.out.println(" > Enter the length of height ");
                    h = sc.nextDouble();
                    hp = b * b + h * h;
                    double rhp = Math.sqrt(hp);
                    System.out.println(" Hypotenuse is --> " + rhp + " <-- " );
                    break;
            case 2 :System.out.println(" > Enter the length of base ");
                    b = sc.nextDouble();
                    System.out.println(" > Enter the length of hypotenuse ");
                    hp = sc.nextDouble();
                    h = hp * hp - b * b;
                    double rh;
                    rh = Math.sqrt(h);
                    System.out.println(" Height is --> " + rh + " <-- " );
                    break;
            case 3 :System.out.println(" > Enter the length of height ");
                    h = sc.nextDouble();
                    System.out.println(" > Enter the length of hypotenuse ");
                    hp = sc.nextDouble();
                    b = hp * hp - h * h;
                    double rb;
                    rb = Math.sqrt(b);
                    System.out.println(" Base is --> " + rb + " <-- ");
                    break;
            default :System.out.println(" ERROR --> Invalid ");
            }
        }
        else if(ch1 == 2) //This part gets executed if user enters "2"
        {
            int vnum;
            System.out.println(" > Enter the number of terms ");
            vnum = sc.nextInt();
            switch(vnum)
            {
            case 1 :System.out.println(" ERROR --> Number of terms can not be 1 <-- ");
            break;
            case 2 :double t1, t2, a1; //Always use double type for making any kind of calculator as int does not allow use of decimals, and gives a type miss match error when a decimal term is entered
                    System.out.println(" > Enter the value of the first term ");
                    t1 = sc.nextDouble();
                    System.out.println(" > Enter the value of the second term ");
                    t2 = sc.nextDouble();
                    System.out.println(" > What would you like to do with these terms ? < ");
                    int tas;
                    System.out.println(" - Press 1 to Add the terms ");
                    System.out.println(" - Press 2 to Subtract the terms ");
                    System.out.println(" - Press 3 to Multiply the terms ");
                    System.out.println(" - Press 4 to Divide the terms ");
                    tas = sc.nextInt();
                    if(tas == 1)
                    {
                        a1 = t1 + t2;
                        System.out.println(" Your answer is --> " + a1 + " <-- ");
                    }
                    else if(tas == 2)
                    {
                        a1 = t1 - t2;
                        System.out.println(" Your answer is --> " + a1 + " <-- ");
                    }
                    else if(tas == 3)
                    {
                        a1 = t1 * t2;
                        System.out.println(" Your answer is --> " + a1 + " <-- ");
                    }
                    else if(tas == 4)
                    {
                        a1 = t1/t2;
                        System.out.println(" Your answer is --> " + a1 + " <-- ");
                    }
                break;
                case 3:double t13, t23, t33;
                System.out.println(" > Enter the value of the first term ");
                t13 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the second term ");
                t23 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the third term ");
                t33 = sc.nextDouble();
                System.out.println(" > What would you like to do with these terms ? < ");
                int tas3;
                System.out.println(" - Press 1 to Add the terms ");
                System.out.println(" - Press 2 to Subtract the terms ");
                System.out.println(" - Press 3 to Multiply the terms ");
                System.out.println(" - Press 4 to Divide the terms ");
                tas3 = sc.nextInt();
                if(tas3 == 1)
                {
                    a1 = t13 + t23 + t33;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                else if(tas3 == 2)
                {
                    a1 = t13 - t23 - t33;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                else if(tas3 == 3)
                {
                    a1 = t13 * t23 * t33;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                else if(tas3 == 4)
                {
                    a1 = (t13/t23)/t33;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                else
                {
                    System.out.println(" ERROR --> Unkown choice <-- ");
                }
                break;
                case 4:double t134, t234, t334, t434;
                System.out.println(" > Enter the value of first term ");
                t134 = sc.nextDouble();
                System.out.println(" > Enter the value of second term ");
                t234 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the third term ");
                t334 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the fourth term ");
                t434 = sc.nextDouble();
                System.out.println(" > What would you like to do with these terms ? < ");
                int tas34 = 0;
                System.out.println(" - Press 1 to Add the terms ");
                System.out.println(" - Press 2 to Subtract the terms ");
                System.out.println(" - Press 3 to Multiply the terms ");
                System.out.println(" - Press 4 to Divide the terms ");
                tas34 = sc.nextInt();
                if(tas34 == 1)
                {
                    a1 = t134 + t234 + t334 + t434;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                else if(tas34 == 2)
                {
                    a1 = t134 - t234 - t334 - t434;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                else if(tas34 == 3)
                {
                    a1 = t134 * t234 * t334 * t434;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                else if(tas34 == 4)
                {
                    a1 = (t134/t234)/t334/(t434);
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                break;
                case 5:double t1345, t2345, t3345, t4345, t5345;
                System.out.println(" > Enter the value of first term (Decending order recommended) ");
                t1345 = sc.nextDouble();
                System.out.println(" > Enter the value of second term ");
                t2345 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the third term ");
                t3345 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the fourth term ");
                t4345 = sc.nextDouble();
                System.out.println(" > Enter the value of the fifth term ");
                t5345 = sc.nextDouble();
                System.out.println(" > What would you like to do with these terms ? < ");
                int tas345;
                System.out.println(" - Press 1 to Add the terms ");
                System.out.println(" - Press 2 to Subtract the terms ");
                System.out.println(" - Press 3 to Multiply the terms ");
                System.out.println(" - Press 4 to Divide the terms ");
                tas345 = sc.nextInt();
                if(tas345 == 1)
                {
                    a1 = t1345 + t2345 + t3345 + t4345 + t5345;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                else if(tas345 == 2)
                {
                    a1 = t1345 - t2345 - t3345 - t4345 - t5345;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                else if(tas345 == 3)
                {
                    a1 = t1345 * t2345 * t3345 * t4345 * t5345;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                else if(tas345 == 4)
                {
                    a1 = t1345 / t2345 / t3345 / t4345 / t5345;
                    System.out.println(" Your answer is --> " + a1 + " <-- ");
                }
                break;
                default : System.out.println(" ERROR --> 6 or more terms are not supported ");       
            }
        }
        else if(ch1 == 3) //This part gets executed if user enters "3"
        {
            double srnum; //Using double instead of int as int in the case of Math.sqrt int gives inaccurate values
            System.out.println(" > Enter the value of the term ");
            srnum = sc.nextDouble();
            double srnumR = Math.sqrt(srnum); //If you want to use int in place of double Use this 'int (Your int) = (int) Math.sqrt(Your int)<-- bracets madatory here
            System.out.println(" Your answer is --> " + srnumR ); //using int in math operation is not recommended 
        }
        else if(ch1 == 4) //This part is executed if user enters "4"
        {
            double cp, sp;
            System.out.println(" > Enter cost price ");
            cp = sc.nextDouble();
            System.out.println(" > Enter selling price ");
            sp = sc.nextDouble();
            if(sp > cp)
            {
                double pf = (sp - cp);
                System.out.println(" Profit --> " + pf + " <-- ");
                double pfp = (pf * 100)/cp;
                System.out.println(" Profit percentage --> " + pfp + " %  <-- ");
            }
            else if(sp < cp)
            {
                double sf = (cp - sp);
                System.out.println(" Loss --> " + sf);
                double sfs  = (sf * 100)/cp;
                System.out.println(" Loss percentage --> " + sfs + " %  <-- ");
            }
            else
            {
                System.out.println(" --> No loss or profit incurred <-- ");
            }
        }
        else if(ch1 == 5) //This part gets executed when user enters "5"
        {
            int chA;
            System.out.println(" - Press '1' to calculate the Area of a square ");
            System.out.println(" - Press '2' to calculate the Area of a rectangle ");
            System.out.println(" - Press '3' to calculate the Area of a circle ");
            chA = sc.nextInt();
            switch(chA)
            {
                case 1 :double ss;
                        System.out.println(" > Enter the value of side ");
                        ss = sc.nextDouble();
                        double ssA = ss * ss;
                        System.out.println(" Your answer is --> " + ssA + " <-- ");
                break;
                case 2 :double rl, rb;
                        System.out.println(" > Enter the value of breadth (width) ");
                        rb = sc.nextDouble();
                        System.out.println(" > Enter the value of length ");
                        rl = sc.nextDouble();
                        double rA = rb * rl;
                        System.out.println(" Your answer is --> " + rA + " <-- ");
                break;
                case 3 :double cr; //Once again using double for more accurate values
                        System.out.println(" Enter the value of radius ");
                        cr = sc.nextDouble();
                        double crX = 3.14159 * (cr * cr);  //Defining PI uptill 5 decimals for even more accurate values
                        System.out.println(" Your answer is --> " + crX ); //value accurate upto 3 decimals only
                break;
                default : System.out.println(" ERROR --> Unkown choice ");
            }
        }
        else if(ch1 == 6)
        {
            int chP;
            System.out.println(" - Press '1' to calculate the Perimeter of a square ");
            System.out.println(" - Press '2' to calculate the Perimeter of a rectangle ");
            System.out.println(" - Press '3' to calculate the Perimeter of a circle ");
            chP = sc.nextInt();
            switch(chP)
            {
                case 1 :double sP;
                        System.out.println(" > Enter value of side ");
                        sP = sc.nextDouble();
                        double sPA = (4 * sP);
                        System.out.println(" Your answer is --> " + sPA + " <-- ");
                break;
                case 2 :double rPL, rPB;
                        System.out.println(" > Enter value of breadth (width) ");
                        rPB = sc.nextDouble();
                        System.out.println(" > Enter value of length ");
                        rPL = sc.nextDouble();
                        double rPA = 2 * (rPL + rPB);
                        System.out.println(" Your answer is --> " + rPA + " <-- ");
                break;
                case 3 :double crP;
                        System.out.println(" > Enter value of radius ");
                        crP = sc.nextDouble();
                        double crPA = 2 * 3.14159 * crP;
                        System.out.println(" Your answer is --> " + crPA + " <-- " ); //value accurate upto 3 decimals only
                break;
                default :System.out.println(" ERROR --> 4 or more terms are not supported ");
            }
        }
        else if(ch1 == 7)
        {
        System.out.println(" ____________________  _                         ");
        System.out.println("|    Running v1.7    | \\`*-.                     ");
        System.out.println("|     Built By :     |  )  _`-.                  ");
        System.out.println("|    Kavin Mistry    | :  : `. .                 ");
        System.out.println("|____________________| : _   '  \\                ");
        System.out.println("                       ; *` _.   `*-._           ");
        System.out.println("                       `-.-'          `-.        ");
        System.out.println("                         ;       `       `.      ");
        System.out.println("                         :.       .        \\     ");
        System.out.println("                         . \\  .   :   .-'   .    ");
        System.out.println("                         '  `+.;  ;  '      :    ");
        System.out.println("                         :  '  |    ;       ;-.  ");
        System.out.println("                         ; '   : :`-:     _.`* ; ");
        System.out.println("                      .*' /  .*' ; .*`- +'  `*'  ");
        System.out.println("                      `*-*   `*-*  `*-*'         ");
        sc.close(); //Closing resource leak
        }
        }
        catch(Exception A)
        {   
            System.out.println(" ERROR --> " + A + " \n > You might have entered a character in place of a number \n > Or might have entered a un defined number option \n --> Report errors in github please ! \n # Github username > KavinMistry < ");
        }
    }
}
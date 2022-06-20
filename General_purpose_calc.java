import java.util.Scanner;
public class General_purpose_calc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for(char k = 1; k <= 2; k++)
        {
        try
        {
        char ch1;
        System.out.println(" \n \n> What would you like to calculate? < ");// You could also use \n at the end of an option instead of System.out.println again and again
        System.out.println(" \n< Calculators > ");
        System.out.println(" - Press '1' for a Pythagoras Theorem calculator ");
        System.out.println(" - Press '2' for a Normal calculator ");
        System.out.println(" - Press '3' for a Square Root calculator ");
        System.out.println(" - Press '4' for a interest calculator (For recurring account) ");
        System.out.println(" - Press '5' for an Area calculator ");
        System.out.println(" - Press '6' for a Perimeter calculator ");
        System.out.println(" - Press '7' for a Volume calculator ");
        System.out.println(" - Press '8' for a Percentage calculator ");
        System.out.println(" \n< Miscellaneous > ");
        System.out.println(" - Press 'A' for a ASCII code finder ");
        System.out.println(" - Press 'V' for version information ");
        ch1 = sc.next().charAt(0); // Any input entered at this point will be taken as the value for variable "ch1" and used to determine what the user wants to do
        if(ch1 == '1') // This part gets executed if user enters "1"
        {
        System.out.println(" > What information are you provided with ? ");
        System.out.println(" - Press 1 if base and height are given ");
        System.out.println(" - Press 2 if base and hypotenuse are given ");
        System.out.println(" - press 3 if height and hypotenuse are given ");
        double b, h, hp; // Declaring variables to be used in the following switch case
        char chp;
        chp = sc.next().charAt(0);
        switch(chp)
        {
            case '1' :System.out.println(" > Enter the length of base ");
                    b = sc.nextDouble();
                    System.out.println(" > Enter the length of height ");
                    h = sc.nextDouble();
                    hp = b * b + h * h;
                    System.out.println(" Under root Hypotenuse is --> √" + hp  );
                    double rhp = Math.sqrt(hp);
                    System.out.println(" Solved Hypotenuse is --> " + rhp  );
                    break;
            case '2' :System.out.println(" > Enter the length of base ");
                    b = sc.nextDouble();
                    System.out.println(" > Enter the length of hypotenuse ");
                    hp = sc.nextDouble();
                    h = hp * hp - b * b;
                    double rh;
                    System.out.println(" Under root Height is --> √" + h );
                    rh = Math.sqrt(h);
                    System.out.println(" Solved Height is --> " + rh  );
                    break;
            case '3' :System.out.println(" > Enter the length of height ");
                    h = sc.nextDouble();
                    System.out.println(" > Enter the length of hypotenuse ");
                    hp = sc.nextDouble();
                    b = hp * hp - h * h;
                    double rb;
                    System.out.println(" Under root Base is --> √" + b  );
                    rb = Math.sqrt(b);
                    System.out.println(" Solved Base is --> " + rb );
                    break;
            default :System.out.println(" ERROR --> Invalid ");
            }
        }
        else if(ch1 == '2') // This part gets executed if user enters "2"
        {
            double a1;
            char vnum;
            System.out.println(" > Enter the number of terms ");
            vnum = sc.next().charAt(0);
            if(vnum == '1')
            {
                System.out.println(" ERROR --> Number of terms can not be 1 <-- ");
            }
            else if(vnum == '2')
            {
                double t1, t2; // Always use double type for making any kind of calculator as int does not allow use of decimals, and gives a type miss match error when a decimal term is entered
                System.out.println(" > Enter the value of the first term ");
                t1 = sc.nextDouble();
                System.out.println(" > Enter the value of the second term ");
                t2 = sc.nextDouble();
                System.out.println(" > What would you like to do with these terms ? ");
                int tas;
                System.out.println(" - Press 1 to Add the terms ");
                System.out.println(" - Press 2 to Subtract the terms ");
                System.out.println(" - Press 3 to Multiply the terms ");
                System.out.println(" - Press 4 to Divide the terms ");
                tas = sc.nextInt();
                if(tas == 1)
                {
                    a1 = t1 + t2;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas == 2)
                {
                    a1 = t1 - t2;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas == 3)
                {
                    a1 = t1 * t2;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas == 4)
                {
                    a1 = t1/t2;
                    System.out.println(" Your answer is --> " + a1 );
                }
            }
            else if(vnum == '3')
            {
                double t13, t23, t33;
                System.out.println(" > Enter the value of the first term ");
                t13 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the second term ");
                t23 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the third term ");
                t33 = sc.nextDouble();
                System.out.println(" > What would you like to do with these terms ? ");
                int tas3;
                System.out.println(" - Press 1 to Add the terms ");
                System.out.println(" - Press 2 to Subtract the terms ");
                System.out.println(" - Press 3 to Multiply the terms ");
                System.out.println(" - Press 4 to Divide the terms ");
                tas3 = sc.nextInt();
                if(tas3 == 1)
                {
                    a1 = t13 + t23 + t33;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas3 == 2)
                {
                    a1 = t13 - t23 - t33;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas3 == 3)
                {
                    a1 = t13 * t23 * t33;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas3 == 4)
                {
                    a1 = (t13/t23)/t33;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else
                {
                    System.out.println(" ERROR --> Unkown choice <-- ");
                }
            }
            else if(vnum == '4')
            {
                double t134, t234, t334, t434;
                System.out.println(" > Enter the value of first term ");
                t134 = sc.nextDouble();
                System.out.println(" > Enter the value of second term ");
                t234 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the third term ");
                t334 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the fourth term ");
                t434 = sc.nextDouble();
                System.out.println(" > What would you like to do with these terms ? ");
                int tas34 = 0;
                System.out.println(" - Press 1 to Add the terms ");
                System.out.println(" - Press 2 to Subtract the terms ");
                System.out.println(" - Press 3 to Multiply the terms ");
                System.out.println(" - Press 4 to Divide the terms ");
                tas34 = sc.nextInt();
                if(tas34 == 1)
                {
                    a1 = t134 + t234 + t334 + t434;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas34 == 2)
                {
                    a1 = t134 - t234 - t334 - t434;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas34 == 3)
                {
                    a1 = t134 * t234 * t334 * t434;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas34 == 4)
                {
                    a1 = (t134/t234)/t334/(t434);
                    System.out.println(" Your answer is --> " + a1 );
                }
            }
            else if(vnum == '5')
            {
                double t1345, t2345, t3345, t4345, t5345;
                System.out.println(" > Enter the value of first term ");
                t1345 = sc.nextDouble();
                System.out.println(" > Enter the value of second term ");
                t2345 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the third term ");
                t3345 = sc.nextDouble(); 
                System.out.println(" > Enter the value of the fourth term ");
                t4345 = sc.nextDouble();
                System.out.println(" > Enter the value of the fifth term ");
                t5345 = sc.nextDouble();
                System.out.println(" > What would you like to do with these terms ? ");
                int tas345;
                System.out.println(" - Press 1 to Add the terms ");
                System.out.println(" - Press 2 to Subtract the terms ");
                System.out.println(" - Press 3 to Multiply the terms ");
                System.out.println(" - Press 4 to Divide the terms ");
                tas345 = sc.nextInt();
                if(tas345 == 1)
                {
                    a1 = t1345 + t2345 + t3345 + t4345 + t5345;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas345 == 2)
                {
                    a1 = t1345 - t2345 - t3345 - t4345 - t5345;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas345 == 3)
                {
                    a1 = t1345 * t2345 * t3345 * t4345 * t5345;
                    System.out.println(" Your answer is --> " + a1 );
                }
                else if(tas345 == 4)
                {
                    a1 = t1345 / t2345 / t3345 / t4345 / t5345;
                    System.out.println(" Your answer is --> " + a1 );
                }
            }
            else
            {
                System.out.println(" ERROR --> \n> You might have entered a character instead of a number \n> Or you might have entered a number greater than 5 \n> Please note 6 or more terms are not supported yet !");
            }
        }
        else if(ch1 == '3') // This part gets executed if user enters "3"
        {
            double srnum; // Using double instead of int as in the case of Math.sqrt int gives inaccurate values
            System.out.println(" > Enter the number ");
            srnum = sc.nextDouble();
            double srnumR = Math.sqrt(srnum); // If you want to use int in place of double Use this 'int (Your int) = (int) Math.sqrt(Your int)<-- bracets madatory here
            System.out.println(" Your answer is --> " + srnumR ); // using int in math operation is not recommended 
        }
        else if(ch1 == '4') // This part is executed if user enters "4"
        {
            double p, r, tp, I, mv;
            System.out.println(" > Enter principle ");
            p = sc.nextDouble();
            System.out.println(" > Enter the rate of interest ");
            r = sc.nextDouble();
            System.out.println(" > Enter Time period in months ");
            tp = sc.nextDouble();
            I = p * tp * (tp+1) * r / (2 * 12 * 100);
            mv = p * tp + I;
            System.out.println(" Intrest is --> " + I);
            System.out.println(" Maturity value is --> " + mv);

        }
        else if(ch1 == '5') // This part gets executed when user enters "5"
        {
            char chA;
            System.out.println(" > Choose the shape of the figure ");
            System.out.println(" - Press '1' to calculate the Area of a square ");
            System.out.println(" - Press '2' to calculate the Area of a rectangle ");
            System.out.println(" - Press '3' to calculate the Area of a circle ");
            chA = sc.next().charAt(0);
            switch(chA)
            {
                case '1' :double ss;
                        System.out.println(" > Enter the value of side ");
                        ss = sc.nextDouble();
                        double ssA = ss * ss;
                        System.out.println(" Your answer is --> " + ssA );
                break;
                case '2' :double rl, rb;
                        System.out.println(" > Enter the value of breadth (width) ");
                        rb = sc.nextDouble();
                        System.out.println(" > Enter the value of length ");
                        rl = sc.nextDouble();
                        double rA = rb * rl;
                        System.out.println(" Your answer is --> " + rA );
                break;
                case '3' :double cr; // Once again using double for more accurate values
                        System.out.println(" Enter the value of radius ");
                        cr = sc.nextDouble();
                        double crX = 3.14159 * (cr * cr);  // Defining PI to 5 decimals for even more accurate values
                        System.out.println(" Your answer is --> " + crX ); // value accurate upto 3 decimals only
                break;
                default : System.out.println(" ERROR --> Unkown choice ");
            }
        }
        else if(ch1 == '6')
        {
            char chP;
            System.out.println(" > Choose the shape of the figure ");
            System.out.println(" - Press '1' to calculate the Perimeter of a square ");
            System.out.println(" - Press '2' to calculate the Perimeter of a rectangle ");
            System.out.println(" - Press '3' to calculate the Perimeter of a circle ");
            chP = sc.next().charAt(0);
            switch(chP)
            {
                case '1' :double sP;
                        System.out.println(" > Enter value of side ");
                        sP = sc.nextDouble();
                        double sPA = (4 * sP);
                        System.out.println(" Your answer is --> " + sPA );
                break;
                case '2' :double rPL, rPB;
                        System.out.println(" > Enter value of breadth (width) ");
                        rPB = sc.nextDouble();
                        System.out.println(" > Enter value of length ");
                        rPL = sc.nextDouble();
                        double rPA = 2 * (rPL + rPB);
                        System.out.println(" Your answer is --> " + rPA );
                break;
                case '3' :double crP;
                        System.out.println(" > Enter value of radius ");
                        crP = sc.nextDouble();
                        double crPA = 2 * 3.14159 * crP;
                        System.out.println(" Your answer is --> " + crPA  ); // value accurate upto 3 decimals only
                break;
                default :System.out.println(" ERROR --> Unknown choice ");
            }
        }
        else if(ch1 == '7')
        {
            char chv;
            System.out.println(" > Choose the shape of the figure ");
            System.out.println(" - Press '1' to calculate the Volume of a Cube ");
            System.out.println(" - Press '2' to calculate the Volume of a Cubiod ");
            System.out.println(" - Press '3' to calculate the Volume of a Sphere ");
            System.out.println(" - Press '4' to calculate the Volume of a Cone ");
            chv = sc.next().charAt(0);
            if(chv == '1')
            {
                double cv;
                System.out.println(" > Enter the lenght of the side ");
                cv = sc.nextDouble();
                double vac = cv * cv * cv;
                System.out.println(" Your answer is --> " + vac );
            }
            else if(chv == '2')
            {
                double lc, lb, lh;
                System.out.println(" > Enter the Length of the Cubiod ");
                lc = sc.nextDouble();
                System.out.println(" > Enter the Breadth(Width) of the Cubiod ");
                lb = sc.nextDouble();
                System.out.println(" > Enter the Height of the Cubiod ");
                lh = sc.nextDouble();
                double acc = lc * lb * lh;
                System.out.println(" Your answer is --> " + acc );
            }
            else if(chv == '3')
            {
                double vao, ro;
                System.out.println(" > Enter the value of Radius ");
                ro = sc.nextDouble();
                vao = 1.33333333333*3.1415*(ro*ro*ro);
                System.out.println(" Your answer is --> " + vao );
            }
            else if(chv == '4')
            {
                double vac2, rc, hc;
                System.out.println(" > Enter the height of the cone ");
                hc = sc.nextDouble();
                System.out.println(" > Enter the radius of the cone ");
                rc = sc.nextDouble();
                vac2 = 3.1415*(rc*rc)*(hc/3);
                System.out.println(" Your answer is --> " + vac2 );
            }
        }
        else if(ch1 == '8')
        {
            double p, pt, ans;
            System.out.println(" > Enter the percentage you want to find (% value) ");
            p = sc.nextDouble();
            System.out.println(" > Enter the number of which you want to find " + p + "%");
            pt = sc.nextDouble();
            ans = (p/100) * pt;
            System.out.println(" > " + p + "% of " + pt + " is --> " + ans);
        }
        else if(ch1 == 'v' || ch1 == 'V')
        {
        System.out.println(" ____________________  _                         ");
        System.out.println("|    Running v2.0    | \\`*\\                    ");
        System.out.println("|     Built By :     |  )  _`-.                  ");
        System.out.println("|    Kavin Mistry    |  / : `. .                 ");
        System.out.println("|      Github :      | : _   '  \\                ");
        System.out.println("|    KavinMistry     | ; *` _.   `*-._           ");
        System.out.println("|____________________| `-.-'          `-.        ");
        System.out.println("                         ;       `       `.      ");
        System.out.println("                         :.       .        \\     ");
        System.out.println("                         . \\  .   :   .-'   .    ");
        System.out.println("                         '  `+.;  ;  '      :    ");
        System.out.println("                         :  '  |    ;       ;-.  ");
        System.out.println("                         ; '   : :`-:     _.`* ; ");
        System.out.println("                      .*' /  .*' ; .*`- +'  `*'  ");
        System.out.println("                      `*-*   `*-*  `*-*'         ");
        }
        else if(ch1 == 'A' || ch1 == 'a')
        {
            char as;
            System.out.println(" > Enter any number/letter/symbol to find the ASCII value of it ");
            as = sc.next().charAt(0);
            int as1; // declare a int variable
            as1 = as; // then asign the char value of the char variable to the int variable basically a type cast which returns the ASCII value instead of the char value
            System.out.println(" ASCII value of '" + as + "' is --> " + as1 );
        }
        else
        {
            System.out.println(" ERROR \n> You might have entered a undefined letter option or a symbol instead try entering '1' or 'V' \n> If you continue to recive such errors please report them to my GitHub \n> Github username -- KavinMistry");
        }
        }
        catch(Exception A)
        {
            System.out.println("ERROR --> " + A + " \n> You might have entered a special character \n> Or might have entered a undefined number option \n--> Report errors in github please ! \n # Github username -- KavinMistry < ");
        }
        System.out.println("\n> Would you like to run the program again ? ");
        System.out.println("- Press 'y' to run again and any other key to exit ");
        char z = sc.next().charAt(0);
        if(z == 'y')
        {
            k = 1;
        }
        else if(z == 's')
        {
            System.out.println("\nYou found a secret ! ");
            k = 3;
        }
        else
        {
            k = 3;
        }
        }
        sc.close();
    }
}
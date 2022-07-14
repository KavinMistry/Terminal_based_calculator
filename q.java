import java.util.Scanner;
public class q
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        double a1 = 0;
        char vnum;
        System.out.println(" > What would you like to do with these terms ? < ");
        System.out.println(" - Press '1' for Addition  ");
        System.out.println(" - Press '2' for Subtraction ");
        System.out.println(" - Press '3' for Multiplication ");
        System.out.println(" - Press '4' for Division ");
        vnum = sc.next().charAt(0);
        switch(vnum)
            {
            case '1' :  char chn;
                        System.out.println(" > Enter the number of terms (2 - 5) ");
                        chn = sc.next().charAt(0);
                        switch(chn)
                        {
                            case '1' :  System.out.println(" > Number of terms can not be 1 ");
                            break;
                            case '2' :  double t1, t2;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        a1 = t1 + t2;
                            break;
                            case '3' :  double t3;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        a1 = t1 + t2 + t3;
                            break;
                            case '4' :  double t4;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fourth term ");
                                        t4 = sc.nextDouble();
                                        a1 = t1 + t2 + t3 + t4;
                            break;
                            case '5' :  double t5;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fourth term ");
                                        t4 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fifth term ");
                                        t5 = sc.nextDouble();
                                        a1 = t1 + t2 + t3 + t4 + t5;
                            break;
                            default : System.out.println(" ERROR --> \n> You might have entered a character instead of a number \n> Or you might have entered a number greater than 5 \n> Please note 6 or more terms are not supported yet !");
            }
            break;
            case '2' :  System.out.println(" > Enter the number of terms (2 - 5) ");
                        chn = sc.next().charAt(0);
                        switch(chn)
                        {
                            case '1' :  System.out.println(" > Number of terms can not be 1 ");
                            break;
                            case '2' :  double t1, t2;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        a1 = t1 - t2;
                            break;
                            case '3' :  double t3;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        a1 = t1 - t2 - t3;
                            break;
                            case '4' :  double t4;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fourth term ");
                                        t4 = sc.nextDouble();
                                        a1 = t1 - t2 - t3 - t4;
                            break;
                            case '5' :  double t5;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fourth term ");
                                        t4 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fifth term ");
                                        t5 = sc.nextDouble();
                                        a1 = t1 - t2 - t3 - t4 - t5;
                            break;
                            default : System.out.println(" ERROR --> \n> You might have entered a character instead of a number \n> Or you might have entered a number greater than 5 \n> Please note 6 or more terms are not supported yet !");
                        }
            break;
            case '3' :  System.out.println(" > Enter the number of terms (2 - 5) ");
                        chn = sc.next().charAt(0);
                        switch(chn)
                        {
                            case '1' :  System.out.println(" > Number of terms can not be 1 ");
                            break;
                            case '2' :  double t1, t2;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        a1 = t1 * t2;
                            break;
                            case '3' :  double t3;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        a1 = t1 * t2 * t3;
                            break;
                            case '4' :  double t4;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fourth term ");
                                        t4 = sc.nextDouble();
                                        a1 = t1 * t2 * t3 * t4;
                            break;
                            case '5' :  double t5;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fourth term ");
                                        t4 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fifth term ");
                                        t5 = sc.nextDouble();
                                        a1 = t1 * t2 * t3 * t4 * t5;
                            break;
                            default : System.out.println(" ERROR --> \n> You might have entered a character instead of a number \n> Or you might have entered a number greater than 5 \n> Please note 6 or more terms are not supported yet !");
        
                        }
            break;
            case '4' :  System.out.println(" > Enter the number of terms (2 - 5) ");
                        chn = sc.next().charAt(0);
                        switch(chn)
                        {
                            case '1' :  System.out.println(" > Number of terms can not be 1 ");
                            break;
                            case '2' :  double t1, t2;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        a1 = t1 / t2;
                            break;
                            case '3' :  double t3;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        a1 = (t1 / t2) / t3;
                            break;
                            case '4' :  double t4;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fourth term ");
                                        t4 = sc.nextDouble();
                                        a1 = ((t1 / t2) / t3) / t4;
                            break;
                            case '5' :  double t5;
                                        System.out.println(" > Enter the value of the first term ");
                                        t1 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the second term ");
                                        t2 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the third term ");
                                        t3 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fourth term ");
                                        t4 = sc.nextDouble();
                                        System.out.println(" > Enter the value of the fifth term ");
                                        t5 = sc.nextDouble();
                                        a1 = (((t1 / t2) / t3) / t4) / t5;
                            break;
                            default : System.out.println(" ERROR --> \n> You might have entered a character instead of a number \n> Or you might have entered a number greater than 5 \n> Please note 6 or more terms are not supported yet !");
                        }
            break;                
            default :   System.out.println(" > Invalid choice ");
        }
        System.out.println(" Answer is --> " + a1);
    }
}

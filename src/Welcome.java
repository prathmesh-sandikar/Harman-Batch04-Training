
//smallest among 2 numbers
//public class Welcome {
//    public static void main(String[] args) {
//        int x = 300, y = 200;
//        if ( x< y)
//
//            System. out. println ( "smallest Number is:" +x);
//
//        else
//
//            System. out. println ("smallest number is:"+ y);
//
//    }
//}



//Largest among 3 numbers
//public class Welcome {
//    public static void main(String[] args) {
//        int a=40, b=78, c=19;
//
//        if(a>=b && a>=c)
//            System.out.println(a+" is the largest Number");
//
//        else if (b>=a && b>=c)
//            System.out.println(b+" is the largest Number");
//        else
//
//            System.out.println(c+" is the largest number");
//
//    }
//}


// to check number is even or odd
//public class Welcome {
//    public static void main(String[] args) {
//        int number = 29;
//
//
//        //checking whether the number is even or odd
//        if (number % 2 == 0)
//            System.out.println(number + " is Even");
//        else
//            System.out.println(number + " is odd");
//
//    }
//}


// to check no. is divisible by 8
//public class Welcome {
//    public static void main(String[] args) {
//        int number = 40;
//
//
//        if(number % 8 == 0)
//        {
//            System.out.println(number+" is divisible by 8");
//        }
//        else
//        {
//            System.out.println(number+" is not divisible by 8");
//        }
//
//
//
//    }
//}


// reverse of a number
//public class Welcome {
//    public static void main(String[] args) {
//        int num = 1234, reverse = 0, rem;
//
//
//
//        while (num != 0)
//        {
//            rem = num % 10;
//            reverse = reverse * 10 + rem;
//            num /= 10;
//        };
//
//
//        System.out.println ("Reversed Number: " + reverse);
//
//
//
//    }
//}

//leap year or not
public class Welcome {
    public static void main(String[] args) {
        int year = 1996;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");


    }
}





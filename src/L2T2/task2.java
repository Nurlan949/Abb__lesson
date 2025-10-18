package L2T2;

public class task2 {
        /// Task 1:
        /// Ask the user to enter a number. Determine if the number is positive, negative, or zero, and print the result.
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("a ededini daxil edin :");
//        int a = scanner.nextInt();
//        if (a > 0) {
//            System.out.println("a ededi musbetdir" + " " + a);
//        } else if (a < 0) {
//            System.out.println("a ededi menfidir" + " " + a);
//        } else if (a == 0) {
//            System.out.println("a ededi 0-a beraberdir" + " " + a);
//        }
//        scanner.close();
//    }

        /// Use and .Task 2:
        /// Ask the user to enter a number between 1 and 7. Print the corresponding day of the week for that number.
        ///
        /// For example:
        ///
        /// 1 – Monday
        ///
        /// 2 – Tuesday

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1-7 araliginda eded daxil edin :");
//        int number = scanner.nextInt();
//        switch (number) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Duzgun eded daxil edilmeyib" + ":" + number); // exceptionda atila biler.
//                break;
//        }
//        scanner.close();
//    }
        /// Use .Task 3:
        /// Ask the user to enter a number. Using a loop, print all the odd numbers up to that number.
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("eded daxil edin");
//        int number = scanner.nextInt();
//        for (int i = 1; i <= number; i++) {
//            if (i % 2 != 0) {
//                System.out.println("tek ededler" + ":" + i);
//
//            }
//        }
//        scanner.close();
//    }

        /// Task 4:
        /// Ask the user to enter a number. Perform the following checks:
        /// If the number is a palindrome (e.g., 12321), display:
        /// If the digits of the number are in increasing order (e.g., 123489), indicate that.
        /// If the digits of the number are in decreasing order (e.g., 97530), indicate that.
        /// Otherwise, display:

        /// 1
        /// If the number is a palindrome (e.g., 12321), display:
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("eded daxil edin");
//        int number = scanner.nextInt();
//        int copyNumber = number;
//        int keepNumber = 0;
//        while (number != 0) {
//            int c = number % 10;
//            keepNumber = keepNumber * 10 + c;
//            number = number / 10;
//        }
//        if (keepNumber == copyNumber) {
//            System.out.println("bu eded polindrom ededdir");
//
//
//        }else {
//            System.out.println("bu eded polindrom eded deyil");a
//        }
//        scanner.close();
//    }


        /// 2 and 3
        /// If the digits of the number are in increasing order (e.g., 123489), indicate that.
        // mentiqi ozunnen sonraki boyukduse artan sira kicikdirse azalan sira dir

        /// If the digits of the number are in decreasing order (e.g., 97530), indicate that.
//    public static void main(String[] args) {
        /// yol 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("eded daxil edin");
//        long enterNumber = scanner.nextLong();
//        long c = enterNumber % 10;
//        System.out.println(c);
//        enterNumber /= 10;
//        while (enterNumber > 0) {
//            long b = enterNumber % 10;
//            System.out.println(b);
//            if (b < c) {
//                System.out.println("artan sira ile");
//
//            } else {
//                System.out.println("azalan sira ile");
//
//            }
//            enterNumber /= 10;
//        }
//
//
//        scanner.close();
        /// yol 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("eded daxil edin");
//        int enterNumber = scanner.nextInt();
//        boolean plus = true;
//        boolean minus = true;
//        long c = enterNumber % 10;
//        System.out.println(c);
//        enterNumber /= 10;
//        while (enterNumber > 0) {
//            long a = enterNumber % 10;
//            System.out.println(a);
//            if (a < c) {
//                minus = false;
//            }
//            if (a > c) {
//                plus = false;
//            }
//
//            enterNumber /= 10;
//        }
//        if (plus) {
//            System.out.println("artan sira ile duzulub");
//        } else if (minus) {
//            System.out.println("azalan sira ile duzulub");
//        }
        /// 3 yol (string cevirib yoxlamaq)

//    }


        /// Task 5:
        /// Ask the user to enter their age and gender (M or F).
        /// If the user is under 18, print "Access denied".
        /// If the user is 18 or older, print:
        /// For M: "Male access granted"
        /// For F: "Female access granted"
        /// If the user enters an incorrect gender, print "Invalid gender entered".
        /// Use ,and .
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("cins elave edin");
//        String gender = scanner.next();
//        System.out.println("yas elave edin");
//        int age = scanner.nextInt();
//        if (age < 18) {
//            System.out.println("entry is not permitted");
//        } else {
//            System.out.println("entry was granted" + ":" + age);
//        }
//        if (gender.equals("M")) {
//            System.out.println("Male access granted");
//
//        } else if (gender.equals("F")) {
//            System.out.println("Female access granted");
//        } else {
//            System.out.println("Invalid gender entered");
//        }
//    }

        /// Task 6:
        /// Write a program that prints Fibonacci numbers.
        ///
        /// Ask the user how many Fibonacci numbers to print.
        /// If the entered number is zero or negative, print "Please enter a valid number".
        /// Use loops to print the Fibonacci sequence.
        /// Use a-to show whether each Fibonacci number is even or odd.


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("eded daxil edin");
//        int number = scanner.nextInt();
//        long number1 = 0;
//        long number2 = 1;
//        long count = 0;
//        if (number <= 0) {
//            System.out.println("Please enter a valid number");
//        }
//
//        if (number >= 1) {
//            System.out.println(number1 + "--" + (number1 % 2 == 0 ? "even" : "odd"));
//            count++;
//        }
//        while (count < number) {
//            System.out.println(number2 + "--" + (number2 % 2 == 0 ? "even" : "odd"));
//            long next = number1 + number2;
//            number1 = number2;
//            number2 = next;
//            count++;
//        }
//        scanner.close();
//    }

        /// task 7
        /// Ask the user to enter a number and calculate its factorial.
        /// If the user enters a negative number, print "Factorial does not exist for negative numbers".
        /// Use loops and (like i++ or --) during the calculation.
        /// Print the result.
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("bir eded daxil edin");
//        int number = scanner.nextInt();
//        if (number <= 0) {
//            System.out.println("Factorial does not exist for negative numbers");
//        } else {
//            int fact = 1;
//            for (int i = 1; i <= number; i++) {
//                fact *= i;
//
//            }
//            System.out.println(fact);
//        }
//
//    }


        /// Task 8
        /// A "Strong number" is defined as follows:
        /// If the sum of the factorials of each digit of the number equals the number itself, then it is a .
        /// 145 → 1! + 4! + 5! = 1 + 24 + 120 = → ✅
        /// 123 → 1! + 2! + 3! = 1 + 2 + 6 = ≠ 123 → ❌
        /// Calculate the factorial for each digit.
        /// Sum them up and compare the result with the original number.

        /// 1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("eded daxil edin");
//        int number = scanner.nextInt();
//        int copyNumber = number;
//        int sum = 0;
//        for (int i = number; i > 0; i /= 10) {
//            int a = i % 10;
//            int fact = 1;
//            for (int j = 1; j <= a; j++) {
//                fact *= j;
//            }
//            sum += fact;
//        }
//        System.out.println("cem" + ":" + sum);
//        if (sum == copyNumber) {
//            System.out.println("strong ededdir");
//        } else {
//            System.out.println("strong eded deyil");
//        }
//        scanner.close();
//    }

        /// task 9
        /// If the sum of each digit raised to the power of the number of digits equals the number itself, then it is an .
        /// 153 → 1³ + 5³ + 3³ = 1 + 125 + 27 = → ✅///153
        /// 9474 → 9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = → ✅
        /// 123 → 1³ + 2³ + 3³ = 1 + 8 + 27 = ≠ 123 → ❌
        /// Extract the digits of the number.
        /// Count how many digits it has.
        /// Raise each digit to the power of the number of digits.
        /// Sum the results and compare with the original number.

        /// alinmadi
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("eded daxil edin");
//        int number = scanner.nextInt();
//        int copyNumber = number;
//        int sum = 0;
//        int sumNumber = 0;
//        for (int i = number; i > 0; i /= 10) {
//            sumNumber++;
//            int a = i % 10;
//
//
//            int fact = 1;
//            for (int j = sumNumber; j <= a; j++) {
//                fact *= j;
//            }
//            sum+=fact;
//            System.out.println(fact);
//        }
//
//        System.out.println(sum);
//        scanner.close();
//    }

    }



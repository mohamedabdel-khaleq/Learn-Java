package Lec3;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        int meineZahl = (int) (100 * Math.random() + 1);
        int deineZahl;
        int attempts = 0;

        do {
            attempts++;

            System.out.println("Attempt number: " + attempts);
            System.out.print("Enter your guess: ");

            deineZahl = input.nextInt();

            if (deineZahl > meineZahl) {
                System.out.println("Your number is too big!");

            } else if (deineZahl < meineZahl) {
                System.out.println("Your number is too small!");

            } else {
                System.out.println("Correct! You won!");
            }

        } while (deineZahl != meineZahl);

        System.out.println("You won in " + attempts + " attempts.");

        input.close();



/* 
int a = 50;
String b = "Hello";
char s = 'A';
*/
final int ahmed = 150;
//ahmed = 200;
System.out.println(ahmed);

/*
1- if / else condition 
2- switch case
3- for loop
*/


// for Loop
// 1- start 2- condition 3- increment / decrement


//++
for (int i = 1 ; i <= 10; i++) {
    System.out.println(i);
} 

//--
for (int i = 50 ; i >= 30 ; i--) {
    System.out.println(i);
}

// if condition 
int number = 100;
if (number > 100){
    System.out.println("The number is greater than 100");
}else if (number < 100){
    System.out.println("The number is less than 100");
} else {
    System.out.println("The number is equal to 100");
}


//Switch  case  break default 
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}

int ttt = 10;
switch (ttt) {
    case 10:
        System.out.println("The number is Ali");
        break;
    case 20:
        System.out.println("The number is Ahmed");
        break;
    case 50:
        System.out.println("The number is Omar");
        break;
    default:
        System.out.println("The number is Khaled");
        break;
}

// loop 1- for 2- while 3- do while 
int uu = 1;
while (uu <= 10) {
    System.out.println(uu); // 1 2 3 4 5 6 7 8 9 10
    uu++;
}

// do while loop
int vv = 1;
do {
    System.out.println(vv); // 1 2 3 4 5
    vv++;
} while (vv <= 5);

    }
}
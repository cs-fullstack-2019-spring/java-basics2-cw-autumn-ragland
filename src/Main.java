import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//        ex1();
//        ex2();
//        ex3();
        ex4();
//        ex5();
//        ch1();
    }

//    ex1.Print 0 through 100 using a while loop.
    private static void ex1(){
        int count = 0;
        while(count <= 100){
            System.out.println(count);
            count++;
        }
    }

//    ex2.Print only the even numbers between 0 and 100 using a for loop
    private static void ex2(){
        int count;
        for(count = 0; count<=100; count++){
            if(count%2==0){
                System.out.println(count);
            }
        }
    }

//    ex.3 Prompt the User for a number. Create a function in your program that counts from 0 to [NUMBER]
    private static void ex3(){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = read.nextInt();
        for(int count=0; count<=num; count++){
            System.out.print(count + " ");
        }
    }

//    ex.4 Prompt the User for secret word.
//    Create a while loop that will continually ask the Player to guess the secret word until it’s correct,
//    or 5 wrong guesses have been made. Once it’s correct print THAT’S CORRECT!!!
//    and also how many guesses it took to get it right.
//    If the Player doesn't get the secret word after 5 tries,
//    end the program and print Sorry! Out of guesses :-(
    private static void ex4(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a Secret Word:");
        String secret = read.nextLine();
        int count = 0;
        boolean flag;
        do{
            System.out.println("Guess the Secret Word:");
            count++;
            if(count > 5){
                System.out.println("Out of Guesses");
                flag = true;
            }
            else if(!read.nextLine().equalsIgnoreCase(secret)){
                System.out.println("Try Again");
                flag = false;
            }
            else{
                System.out.println("Correct");
                flag = true;
            }
        }while(!flag);
    }
//    ex.5 Create a program that sends a different function a number,
//    and that function prints out that many “*”.
    private static void ex5(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number");
        int starCount = read.nextInt();
        stars(starCount);
    }

    private static void stars(int starCount){
        for(int counter=1; counter <= starCount; counter++){
            System.out.print("* ");
        }
    }

//    ch1 Using the '*' function from earlier, produce the output found in the attached image
    private static void ch1(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number");
        int starCount = read.nextInt();
        starsChallenge(starCount);
    }

    private static void starsChallenge(int starCount){
        while(starCount < 10){
            for(int counter=1; counter <= starCount; counter++){
                System.out.print("*");
            }
            System.out.println(" ");
            starCount++;
        }
    }

}

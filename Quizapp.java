
import java.util.Scanner;

public class Quizapp{
    public static void main(String[] args){
        ques_ans ques = new ques_ans();
        ques_ans ans = new ques_ans();
        Scanner input = new Scanner(System.in);
        char answer;
        int correct = 0 , wrong = 0;
        ques.ques1();
        answer = input.next().charAt(0);
        if(answer==ans.ans1){
            correct++;

        }
        else wrong++;
          ques.ques2();
        answer = input.next().charAt(0);
        if(answer==ans.ans2){
            correct++;

        }
        else wrong++;
          ques.ques3();
        answer = input.next().charAt(0);
        if(answer==ans.ans3){
            correct++;

        }
        else wrong++;
          ques.ques4();
        answer = input.next().charAt(0);
        if(answer==ans.ans4){
            correct++;

        }
        else wrong++;
          ques.ques5();
        answer = input.next().charAt(0);
        if(answer==ans.ans5){
            correct++;

        }
        else wrong++;
          ques.ques6();
        answer = input.next().charAt(0);
        if(answer==ans.ans6){
            correct++;

        }
        else wrong++;
          ques.ques7();
        answer = input.next().charAt(0);
        if(answer==ans.ans7){
            correct++;

        }
        else wrong++;
          ques.ques8();
        answer = input.next().charAt(0);
        if(answer==ans.ans8){
            correct++;

        }
        else wrong++;
          ques.ques9();
        answer = input.next().charAt(0);
        if(answer==ans.ans9){
            correct++;
            

        }
        else wrong++;
          ques.ques10();
        answer = input.next().charAt(0);
        if(answer==ans.ans10){
            correct++;

        }
        else wrong++;
        
        double correct_double = correct;
        double percentage = (correct_double/10)*100;

        System.out.println("The toatl marks are : 100");
        System.out.println("Your marks are : "+correct*10);
         System.out.println("Toatl questions are : 10");
          System.out.println("Your correct answers are : " +correct + "\nYour wrong answers are : " +wrong);
           System.out.println("Your percentahe is  : "+percentage+"%");


    }
}

class ques_ans{
    void ques1(){
    System.out.println("1. What is the capital city of France?\r\n" +//
"a) Berlin\r\n" +//
"b) Madrid\r\n" +//
"c) Paris\r\n" +//
"d) Rome");
    }


    void ques2(){
    System.out.println("2. Who wrote the play Romeo and Juliet?\r\n" +//
"a) Charles Dickens\r\n" +//
"b) William Shakespeare\r\n" +//
"c) Jane Austen\r\n" +//
"d) George Orwell");
    }


    void ques3(){
    System.out.println("3. What is the chemical symbol for water?\r\n" +//
"a) O₂\r\n" +//
"b) H₂O\r\n" +//
"c) CO₂\r\n" +//
"d) NaCl");
    }


    void ques4(){
    System.out.println("4. How many continents are there in the world?\r\n" +//
"a) Five\r\n" +//
"b) Six\r\n" +//
"c) Seven\r\n" +//
"d) Eight");
    }


    void ques5(){
    System.out.println("5. What is the largest planet in our solar system?\r\n" +//
"a) Earth\r\n" +//
"b) Mars\r\n" +//
"c) Jupiter\r\n" +//
"d) Saturn");
    }


    void ques6(){
    System.out.println("6. In which year did the Titanic sink?\r\n" +//\r\n" +//
"a) 1905\r\n" +//
"b) 1912\r\n" +//
"c) 1920\r\n" +//
"d) 1931");
    }


    void ques7(){
    System.out.println("7. What is the square root of 64?\r\n" +//
"a) 6\r\n" +//
"b) 7\r\n" +//
"c) 8\r\n" +//
"d) 9");
    }


    void ques8(){
    System.out.println("8. Which element has the atomic number 1?\r\n" +//
"a) Helium\r\n" +//
"b) Oxygen\r\n" +//
"c) Hydrogen\r\n" +//
"d) Carbon");
    }

    void ques9(){
    System.out.println("9. Who painted the Mona Lisa?\r\n" +//
"a) Vincent van Gogh\r\n" +//
"b) Pablo Picasso\r\n" +//
"c) Leonardo da Vinci\r\n" +//
"d) Claude Monet");
    }


    void ques10(){
    System.out.println("10. Which country is known as the Land of the Rising Sun?\r\n" +//
"a) China\r\n" +//
"b) Japan\r\n" +//
"c) South Korea\r\n" +//
"d) Thailand");
    }
    // keys 

char ans1 = 'c';
char ans2 = 'b';
char ans3 = 'b';
char ans4 = 'c';
char ans5 = 'c';
char ans6 = 'b';
char ans7 = 'c';
char ans8 = 'c';
char ans9 = 'c';
char ans10 = 'b';

}





import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        play();
    }

    public static void prepareGame(QuestionList questionList){
        String[] answer1 = {"1924", "1898", "1912", "1930"};
        questionList.addQuestion(new Quiz("What year did the Titanic sink in the Atlantic Ocean?", answer1, 2));
        String[] answer2 = {"Lisbon", "Madrid", "Paris", "Rome"};
        questionList.addQuestion(new Quiz("What is the capital of Portugal?", answer2, 0));
        String[] answer3 = {"20.000", "50.000", "100.000", "30.000"};
        questionList.addQuestion(new Quiz("How many breaths does the human body take daily?", answer3, 0));
        String[] answer4 = {"Ar", "A", "Ag", "An"};
        questionList.addQuestion(new Quiz("What is the chemical symbol for silver?", answer4, 2));
    }

    public static void play(){
        Scanner input = new Scanner(System.in);
        QuestionList questionList = new QuestionList(5);
        int answer = 0;
        int points = 0;
        prepareGame(questionList);
        for(int index = 0; index < questionList.getSize(); index++){
            Quiz currentQuestion = questionList.nextQuestion();
            if(currentQuestion != null){
                System.out.println("Question " + (index + 1) + ":");
                System.out.println(currentQuestion.toString());
                System.out.print("Enter answer: ");
                answer = input.nextInt();
                if(currentQuestion.isCorrect(answer - 1)){
                    System.out.println("Correct!");
                    System.out.println();
                    points += 100;
                }else{
                    System.out.println("Incorrect, you lost...");
                    System.out.println();
                    break;
                }
            }
        }
        System.out.println("End game. Total points: " + points);
        System.out.println();
    }
}

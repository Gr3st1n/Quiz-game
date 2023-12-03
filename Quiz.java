public class Quiz{
    private String question;
    private String[] answers;
    private int correct;

    public Quiz(String question, String[] answers, int correct){
        this.question = question;
        this.answers = answers;
        this.correct = correct;
    }

    public String getQuestion(){
        return question;
    }

    public String[] getAnswers(){
        return answers;
    }

    public int getCorrectAnswer(){
        return correct;
    }

    public boolean isCorrect(int answer){
        return answer == correct;
    }

    public String toString(){
        String s = "Question: " + question + "\n";
        for(int index = 0; index < answers.length; index++){
            s += (index + 1) + ". " + answers[index] + "\n"; 
        }
        return s;
    }
}
public class QuestionList {
    private Quiz[] question;
    private int questionIndex;
    private int size;

    public QuestionList(int size){
        question = new Quiz[size];
        this.size = 0;
        questionIndex = 0;
    }

    public int getSize(){
        return size;
    }

    public void addQuestion(Quiz quiz){
        if(size < question.length){
            question[size] = quiz;
            size++;
        }
    }

    public Quiz nextQuestion(){
        int nextIndex = (questionIndex + 1) % size;
        questionIndex = nextIndex;
        return question[nextIndex];
    }
}

package sit.int202.simple.simple;

public class CalcGrade {
    private int score;

    public CalcGrade(int score) {
        this.score = score;
    }
    public String getScore() {
        if(score >= 80){
            return "A";
        }else if(score >= 70){
            return "B";
        }
        else if(score >= 60){
            return "C";
        }else{
            return "F";
        }
    }
    public int getScoreNum() {
        return score;
    }

}

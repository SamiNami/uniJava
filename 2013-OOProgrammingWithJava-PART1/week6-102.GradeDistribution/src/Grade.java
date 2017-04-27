
public class Grade {

    private int score;
    private int grade;

    public Grade(int score) {
        this.score = score;
        this.grade = setGrade(score);
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public int getGrade() {
        return this.grade;
    }
    
    public int setGrade(int points) {
        if (points <= 29) {            
            return 0;            
        } else if (points >= 30 && points <= 34) {
            return 1;            
        } else if (points >= 35 && points <= 39) {
            return 2;
        } else if (points >= 40 && points <= 44) {
            return 3;
        } else if (points >= 45 && points <= 49) {
            return 4;
        } else if (points >= 50 && points <= 60) {
            return 5;
        }
        return -1;
    }
    
    public String toString(){
        return "The score is:" + this.score + " The grade is: " + this.grade;
    }
    
    

}

import java.util.ArrayList;
public class GradeList {
    private ArrayList<Grade> list;

    public GradeList() {
        this.list = new ArrayList<Grade>();
    }
    
    public void addGrade(Grade grade){
        this.list.add(grade);
    }
    
    public void printGrades() {
        for (Grade grade : list) {
            System.out.println(grade.getGrade());
            
        }
    }
    
    public ArrayList<Grade> searchByGrade(int value) {
        ArrayList<Grade> found = new ArrayList<Grade>();

        for (Grade grade : list) {
            if (grade.getGrade() == value) {
                found.add(grade);
            }
        }
        return found;
    }
    
    
}

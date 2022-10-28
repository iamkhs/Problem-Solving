package HackerRank;
import java.util.ArrayList;
import java.util.List;

public class Grading_Students {
    public static void main(String[] args){

        ArrayList<Integer> grade = new ArrayList<>();
        grade.add(73);
        grade.add(67);
        grade.add(38);
        grade.add(33);

        System.out.println(gradingStudents(grade));

    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for (int i = 0; i< grades.size(); i++){
            int diff = 5 - (grades.get(i) % 5);
            if (!(grades.get(i) < 38 || diff >=3) ){
                grades.set(i, grades.get(i) + diff);
            }
        }
        return grades;
    }

}

package view;

import builder.SubjectBuilder;
import builder.UserBuilder;
import java.util.Scanner;
import model.SubjectsDTO;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;
import sevice.GradeService;
import sevice.UtilService;

public class GradeView {
    public GradeView() {
    }

    public static void main(Scanner sc) {
        System.out.println("이름을 입력해주세요");
        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();
        (new UserBuilder()).name(sc.next()).build();
        SubjectsDTO subjects = (new SubjectBuilder()).scoreKorean(util.createRandomInteger(0, 100)).scoreMath(util.createRandomInteger(0, 100)).scoreEnglish(util.createRandomInteger(0, 100)).build();
        int totalScore = grade.getTotalSum(subjects);
        double average = grade.findTheAvg(totalScore);
        System.out.printf("======성적표=======\n Korean : %d \nEnglish : %d \nMath : %d \nTotal : %d \nAvg : %s", subjects.getScoreK(), subjects.getScoreM(), subjects.getScoreE(), totalScore, String.valueOf(average));
    }
}
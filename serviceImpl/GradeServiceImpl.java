package serviceImpl;

import model.SubjectsDTO;
import sevice.GradeService;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl() {
    }

    public static GradeService getInstance() {
        return instance;
    }

    public int getTotalSum(SubjectsDTO subjects) {
        int sum = subjects.getScoreK() + subjects.getScoreM() + subjects.getScoreE();
        return sum;
    }

    public double findTheAvg(int totalScore) {
        double avg = (double)(totalScore / 3);
        return avg;
    }
}
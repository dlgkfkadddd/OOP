package sevice;

import model.SubjectsDTO;

public interface GradeService {
    int getTotalSum(SubjectsDTO var1);

    double findTheAvg(int var1);
}

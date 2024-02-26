package builder;

import model.SubjectsDTO;

public class SubjectBuilder {
    private int scoreKorean;
    private int scoreMath;
    private int scoreEnglish;
    private int avg;
    private int sum;

    public SubjectBuilder() {
    }

    public SubjectBuilder scoreKorean(int scoreKorean) {
        this.scoreKorean = scoreKorean;
        return this;
    }

    public SubjectBuilder scoreMath(int scoreMath) {
        this.scoreMath = scoreMath;
        return this;
    }

    public SubjectBuilder scoreEnglish(int scoreEnglish) {
        this.scoreEnglish = scoreEnglish;
        return this;
    }

    public SubjectBuilder avg(int avg) {
        this.avg = avg;
        return this;
    }

    public SubjectBuilder sum(int sum) {
        this.sum = sum;
        return this;
    }

    public SubjectsDTO build() {
        return new SubjectsDTO(this.scoreKorean, this.scoreMath, this.scoreEnglish, this.avg, this.sum);
    }
}
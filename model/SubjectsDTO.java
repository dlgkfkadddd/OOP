package model;

public class SubjectsDTO {
    private int scoreKorean;
    private int scoreMath;
    private int scoreEnglish;
    private int avg;
    private int sum;

    public SubjectsDTO(int scoreKorean, int scoreMath, int scoreEnglish, int avg, int sum) {
        this.scoreKorean = scoreKorean;
        this.scoreMath = scoreMath;
        this.scoreEnglish = scoreEnglish;
        this.avg = avg;
        this.sum = sum;
    }

    public String toString() {
        return "SubjectsDTO{국어=" + this.scoreKorean + ", 수학=" + this.scoreMath + ", 영어=" + this.scoreEnglish + ", 평균=" + this.avg + ", 총합=" + this.sum + "}";
    }

    public void setScoreK(int scoreKorean) {
        this.scoreKorean = scoreKorean;
    }

    public void setScoreMath(int scoreM) {
        this.scoreMath = this.scoreMath;
    }

    public void setScoreE(int scoreEnglish) {
        this.scoreEnglish = scoreEnglish;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getScoreK() {
        return this.scoreKorean;
    }

    public int getScoreM() {
        return this.scoreMath;
    }

    public int getScoreE() {
        return this.scoreEnglish;
    }

    public int getAvg() {
        return this.avg;
    }

    public int getSum() {
        return this.sum;
    }
}
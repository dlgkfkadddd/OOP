package serviceImpl;

import sevice.UtilService;

public class UtilServiceImpl implements UtilService {
    private static UtilService instance = new UtilServiceImpl();

    private UtilServiceImpl() {
    }

    public static UtilService getInstance() {
        return instance;
    }

    public int createRandomInteger(int start, int gapBetweenStartAndEnd) {
        return start + (int)(Math.random() * (double)gapBetweenStartAndEnd);
    }

    public double createRandomDouble(double start, double gapBetwwnStartAndEnd) {
        return Double.parseDouble(String.format("%,1f", start + (double)((int)(Math.random() * gapBetwwnStartAndEnd))));
    }

    public String createRandomName() {
        String[] names = new String[]{"이정재", "마동석", "송강호", "윤여정", "황정민", "정우성", "이병헌", "현 빈", "유해진", "손석구", "전도연", "손예진", "하지원", "김하늘", "송중기", "하정우", "장동건", "원 빈", "박해일", "소지섭", "김혜수"};
        return names[this.createRandomInteger(0, 20)];
    }

    public String createRandomTitle() {
        String[] titles = new String[]{"국무위원은", "학교교육", "직무범위", "건전한", "행정기관은", "균등하게", "지체없이", "재판을", "형사피고인은"};
        return titles[this.createRandomInteger(0, 9)];
    }

    public String createRandomContent() {
        String[] contents = new String[]{"국무위원은 국정에 관하여 대통령을 보좌하며, 국무회의의 구성원으로서 국정을 심의한다.", "학교교육 및 평생교육을 포함한 교육제도와 그 운영, 교육재정 및 교원의 지위에 관한 기본적인 사항은 법률로 정한다", "국가원로자문회의의 조직·직무범위 기타 필요한 사항은 법률로 정한다.", "국가는 건전한 소비행위를 계도하고 생산품의 품질향상을 촉구하기 위한 소비자보호운동을 법률이 정하는 바에 의하여 보장한다.", "제1항의 지시를 받은 당해 행정기관은 이에 응하여야 한다. 국회의 회의는 공개한다.", "모든 국민은 능력에 따라 균등하게 교육을 받을 권리를 가진다.", "계엄을 선포한 때에는 대통령은 지체없이 국회에 통고하여야 한다.", "모든 국민은 신속한 재판을 받을 권리를 가진다.", "형사피고인은 상당한 이유가 없는 한 지체없이 공개재판을 받을 권리를 가진다."};
        return contents[this.createRandomInteger(0, 9)];
    }

    public String createRandomCompany() {
        String[] companies = new String[]{"구글", "엔비디아", "메타", "삼성", "애플", "LG"};
        return companies[this.createRandomInteger(0, 6)];
    }
}
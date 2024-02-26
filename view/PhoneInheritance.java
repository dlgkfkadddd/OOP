package view;

public class PhoneInheritance {
    public static void main(String[] args) {
        System.out.println("------- 집 전화 --------");
        Phone phone = new Phone();
         phone.setCompany("금성");
         phone.setCall("제임스");
        System.out.println(phone.toString());
        System.out.println("------- 휴대전화 --------");
        CelPhone cp = new CelPhone();
        cp.setCompany("노키아");
        cp.setCall("에릭");
        cp.setPortable(true);
        System.out.println(cp.toString());
        System.out.println("------- 아이폰 --------");
        Iphone ip = new Iphone();
        ip.setCompany("애플");
        ip.setCall("톰");
        ip.setPortable(true);
        ip.setData("전송하다");
        System.out.println(ip.toString()); // 애플 아이폰으로 톰에게 이동하면서 데이터를 전송한다.
        System.out.println("------- 갤럭시 노트 --------");
        AndroidPhone ap = new AndroidPhone();
        ap.setCompany("삼성");
        ap.setCall("제인");
        ap.setSize("10인치");
        ap.setPortable(true);
        ap.setData("전송하다");
        System.out.println(ap.toString()); // 삼성 갤럭시노트 10인치로 제인에게 폰을 휴대할 수 있음 데이터를 전송한다.

    }
}

class AndroidPhone extends Iphone{
    private String size;
    public static String BRAND = "Galaxy Note";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "안드로이드폰 {" +
                "제조사 = '" + super.company + '\'' +
                BRAND + '\'' +
                ", 사이즈 = '" + size + '\'' +
                ", 수신자 = '" + super.call + '\'' +
                ", 이동성 = " + super.portable +
                ", 이동유무 = '" + super.move + '\'' +
                ", 데이터 = '" + super.data + '\'' +
                '}';
    }
}
class Iphone extends CelPhone{
    protected String data;
    public static String BRAND = "iphone";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "아이폰 {" +
                "제조사 = '" + super.company + '\'' +
                BRAND + '\'' +
                ", 수신자 = '" + super.call + '\'' +
                ", 이동성 = " + super.portable +
                ", 이동유무 = '" + super.move + '\'' +
                ", 데이터 = '" + data + '\'' +
                '}';
    }
}
class CelPhone extends Phone{
    protected boolean portable; // 이동성, 휴대 가능성
    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        if (portable){
            this.setMove("폰을 휴대할 수 있음");
        } else {
            this.setMove("폰을 휴대할 수 없음");
        }
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "휴대폰 {" +
                "제조사 = '" + super.company + '\'' +
                ", 수신자 = '" + super.call + '\'' +
                ", 이동성 = " + portable +
                ", 이동유무 = '" + move + '\'' +
                '}';
    }
}
class Phone{
    protected String company, call; //인스턴스 변수 = 멤버변수 => 힙 영역
    static final double TAX_RATE = 0.095; // 스태틱 변수 = 전역변수 => 스태틱영역, final 걸면 안 바뀜

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call+ "에게 전화를 걸다";
    }

    @Override
    public String toString() {
        return "집 전화 {" +
                "제조사 = '" + company + '\'' +
                ", 수신자 = '" + call + '\'' +
                '}';
    }
}
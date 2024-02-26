package view;

import builder.UserBuilder;
import java.util.Scanner;
import model.UserDTO;
import serviceImpl.UtilServiceImpl;
import sevice.UtilService;

public class JoinView {
    public JoinView() {
    }

    public static void main(Scanner sc) {
        System.out.println("Id, PW, PW확인, 이름, ID, 전화번호,주소, 직업 ,키 , 몸무게 을 입력해주세요");
        UtilService util = UtilServiceImpl.getInstance();
        UserDTO user = (new UserBuilder()).userId(sc.next()).userPw(sc.next()).pwCheck(sc.next()).name(sc.next()).personId(sc.next()).phongNum(sc.nextInt()).address(sc.next()).job(sc.next()).height(sc.nextDouble()).weight(sc.nextDouble()).build();
        System.out.println(user.toString());
    }
}
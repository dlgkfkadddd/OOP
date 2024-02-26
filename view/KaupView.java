package view;

import builder.UserBuilder;
import model.UserDTO;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;
import sevice.KaupService;
import sevice.UtilService;

import java.util.Scanner;

public class KaupView {
    public KaupView() {
    }

    public static void main(Scanner sc) {
        UtilService util = UtilServiceImpl.getInstance();
        KaupService kaup = KaupServiceImpl.getInstance();
        UserDTO user = (new UserBuilder()).height(util.createRandomDouble(150.0, 50.0)).weight(util.createRandomDouble(30.0, 50.0)).build();
        System.out.println("======= 키 몸무게 ========");
        String bmi = kaup.createBmi(user);
        String bodyMass = kaup.createBodyMass(bmi);
        System.out.printf("키 : %.1f mm, 몸무게 : %.1f", user.getHeight(), user.getWeight());
        System.out.println("");
        System.out.printf("======= BMI 계산기 ========\nbmi : %s\n체질량 : %s\n", bmi, bodyMass);
    }
}
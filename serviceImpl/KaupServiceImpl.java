package serviceImpl;

import model.UserDTO;
import sevice.KaupService;

public class KaupServiceImpl implements KaupService {
    private static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl() {
    }

    public static KaupService getInstance() {
        return instance;
    }

    public String createBmi(UserDTO user) {
        double height = user.getHeight();
        double weight = user.getWeight();
        double bmi = weight / Math.pow(height / 100.0, 2.0);
        return String.valueOf(bmi);
    }

    public String createBodyMass(String bmi) {
        double doubleBmi = Double.parseDouble(bmi);
        String BodyMass = "";
        if (doubleBmi < 18.5) {
            BodyMass = "저체중";
        } else if (doubleBmi < 23.0) {
            BodyMass = "정상";
        } else if (doubleBmi < 25.0) {
            BodyMass = "과체중";
        } else if (doubleBmi > 25.0) {
            BodyMass = "비만";
        }

        return BodyMass;
    }
}

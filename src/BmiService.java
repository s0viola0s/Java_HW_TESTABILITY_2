public class BmiService {
    public int calculate(int weightKg, double heightMeter) {

        int bmi = (int) (weightKg / (heightMeter * heightMeter));
        return bmi;
    }
}

public class BmiService {
    public int calculate(int weight_kg, double height_meter) {

        int bmi = (int) (weight_kg / (height_meter * height_meter));
        return bmi;
    }
}

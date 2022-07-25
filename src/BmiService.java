public class BmiService {
    public int calculate(int weight, float height) {
        int bmi = (int) Math.floor(weight / (height * height));
        return bmi;
    }
}

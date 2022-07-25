public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 63;
        float height = 1.6f;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}

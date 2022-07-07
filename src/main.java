public class main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 56;
        int height = 156;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
public class main {

    public static void main(String[] args) {
        int weight = 56;
        int height = 156;

        BmiService service = new BmiService();
        int index = service.calculate(weight, height);

        System.out.println(index);
    }
}
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BodyMassIndex = service.calculate(190, 80);
        System.out.println("Индекс массы тела равен: " + BodyMassIndex);
    }
}

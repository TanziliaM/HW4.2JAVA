public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
    double weight = 55; // в килограммах
    double height = 1.75; // в квадратных метрах
    double index = service.calculate(weight,height);
    System.out.println(index);
}
}


public class BmiService {
    public double calculate (double weight, double height) {
        double index = weight / (height * height);
        if(index < 18.5){
            System.out.println("Underweight: < 18.5");
        }else if(index < 25){
            System.out.println("Normal weight:  18.5 - 25");
        }else if(index < 30){
            System.out.println("Overweight: 25 - 30");
        }else if (index > 30) {
            System.out.println("Obesity: of 30 or greater");
        }
        return index;
    }


}

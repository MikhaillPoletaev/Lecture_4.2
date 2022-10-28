public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService ();
        double weight = 90;
        double height = 1.85;
        double bmi = service.calculate (height, weight);

        System.out.println(bmi);
    }
}
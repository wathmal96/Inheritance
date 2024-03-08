public class Main {
    public static void main(String[] args) {
        AdditionCal additionCal = new AdditionCal(3,1);
        SubtractionCal subtractionCal = new SubtractionCal();

        System.out.println(additionCal.addNumbers());
        System.out.println(subtractionCal.subtractNumbers());
    }
}

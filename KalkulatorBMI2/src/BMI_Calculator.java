import java.util.Scanner;

public class BMI_Calculator extends Person implements BMI {

    public BMI_Calculator(double weight, double height) {
        super(weight, height);
    }

    public double calculateBMI(double weight, double height) {
        if (height == 0) {
            // Handle the error, for example, return a special value or throw an exception.
            return 0.0;
        }
        return weight / (height * height);
    }

    public void displayBMI(double bmi) {
        System.out.println("BMI Anda Adalah: " + bmi);
        interpretBMI(bmi);
    }

    private void interpretBMI(double bmi) {
        System.out.print("Interpretation: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }

    public void displayInfo() {
        System.out.println("Berat: " + getWeight() + " kg");
        System.out.println("Tinggi: " + getHeight() + " meters");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Berat Badan dalam Kilograms :");
        double weight = scanner.nextDouble();

        System.out.print("Masukkan Tinggi Badan dalam Meter : ");
        double height = scanner.nextDouble();

        BMI_Calculator calculator = new BMI_Calculator(weight, height);

        double bmiResult = calculator.calculateBMI(weight, height);
        calculator.displayBMI(bmiResult);

        calculator.displayInfo();

        // Close the scanner to release resources
        scanner.close();
    }
}

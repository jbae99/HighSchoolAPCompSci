import java.util.Scanner;

public class BMICALC
 {
    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your weight in pounds");
		double weight = input.nextInt();
		System.out.println("Please enter your height in inches");
		double height = input.nextInt();
		System.out.println("Your BMI is " + ((weight/(height*height)) * 703));
		System.out.println("BMI VALUES");
        System.out.println("Underweight: Under 18.5");
        System.out.println("Normal: 18.5-24.9 ");
        System.out.println("Overweight: 25-29.9");
        System.out.println("Obese: 30 or over");

	
	}
 }


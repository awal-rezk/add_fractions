import java.util.Scanner;

public class Add_Fractions {
    // Numerators of the input fractions
    int first_num, second_num;
    // Denominators of the input fractions
    int first_denom, second_denom;

    public Add_Fractions(int first_num, int second_num, int first_denom, int second_denom){
        this.first_num = first_num;
        this.second_num = second_num;
        this.first_denom = first_denom;
        this.second_denom = second_denom;
    }

    // Compute the fractional sum of the two fractions
    public void find_result(){
        // Compute the common denominator of both fractions
        int common_denom = this.first_denom*this.second_denom;

        // Multiply each fraction's numerator by the other fraction's denominator
        int new_first_num = this.first_num*this.second_denom;
        int new_second_num = this.second_num*this.first_denom;

        // Sum the new numerators
        int new_num = new_first_num + new_second_num;
        display_result(new_num, common_denom);
    }

    // Format how the fractional sum will be displayed
    public void display_result(int result_num, int result_denom){
        System.out.println("Sum = " + result_num + "/" + result_denom);
    }

    public static void main(String[] args){
        Scanner object1 = new Scanner(System.in);
        System.out.println("Please enter the numerator and denominator of each of two fractions you want to sum, respectively.");

        // User inputs the numerators and denominators of each of the two fractions
        int numerator_one = object1.nextInt();
        int denominator_one = object1.nextInt();

        int numerator_two = object1.nextInt();
        int denominator_two = object1.nextInt();

        Add_Fractions entry = new Add_Fractions(numerator_one, numerator_two, denominator_one, denominator_two);

        // Compute and display the fractional sum of the two fractions
        entry.find_result();
    }
}



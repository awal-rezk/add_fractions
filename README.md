# Add Fractions
This program prompts the user to input the numerators and denominators of two fractions that the user wishes to sum. Afterwards, the terminal displays the fractional sum.

In the file Add_Fractions.java, there is a constructor. This constructor allows the numerators and denominators that the user inputs in the main() method to be used in the member methods of the Add_Fractions class.
The method find_result() first computes the common denominator of the fractions that the user wishes to sum. The common denominator serves as the denominator of the fractional sum. Then, the method find_result() multiplies each fraction's numerator by the other fraction's denominator and each product serves as the new numerator for its corresponding input fraction. Next, the method find_result() sums the new numerators, and this serves as the numerator of the fractional sum. Finally, the method find_result() passes the numerator and denominator of the fractional sum as arguments to the method display_result(). 
The method display_result() displays the fractional sum in the format "Sum = numerator/denominator".  

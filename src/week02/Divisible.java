package week02;

public class Divisible {
    public static void main(String[] args) {
        System.out.println("Divisible By 15:");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nDivisible By 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nDivisible By 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
    }

}
/*
 Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
-if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section
-if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section
-if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

 */
/*
Explanation:

The program iterates through numbers from 1 to 100.
For each number, it checks if the number is divisible by 15, 5, or 3, based on the conditions provided.
If the number is divisible by 15, it's printed under the "Divisible By 15" section.
If the number is divisible by 5 but not by 15, it's printed under the "Divisible By 5" section.
If the number is divisible by 3 but not by 15, it's printed under the "Divisible By 3" section.
Numbers that are divisible by both 5 and 3 are automatically divisible by 15, so
they are not printed again under the "Divisible By 5" or "Divisible By 3" sections.




 */

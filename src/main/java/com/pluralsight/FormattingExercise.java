package com.pluralsight;

public class FormattingExercise {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 32;
        double gpa = 3.6789;

        // Step 1: Format and print the string variable (name)
        // Example output: Name: Alice
        String formattedName = String.format("Name: %s", name) ;
        System.out.println(formattedName);

        // Step 2: Format and print the integer variable (age)
        // Example output: Age: 25
        String formattedAge = String.format("Age: %,d", age);
        System.out.println(formattedAge);

        // Step 3: Format and print the double variable (gpa) with 2 decimal places
        // Example output: GPA: 3.68
        String formattedGPA = String.format("GPA: %.2f",gpa);
        System.out.println(formattedGPA);

        // Step 4: Combine all three into one formatted sentence using String.format
        // Example output: Name: Alice, Age: 25, GPA: 3.68
        String formattedSentence = String.format("Name: %s, Age: %d, GPA: %.2f", name, age, gpa);
        System.out.println(formattedSentence);

        // Step 5: Print the same combined sentence using printf
        // Example output: Name: Alice, Age: 25, GPA: 3.68
        System.out.printf("Name: %s, Age: %d, GPA: %.2f", name, age, gpa);
    }
}

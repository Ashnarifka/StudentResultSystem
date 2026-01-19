import java.util.Scanner;
public class StudentResultSystem {
    static double calculatePercentage(int total, int subjects) {
        return (double) total / subjects;
        }
        static String assignGrade(double percentage) {
            int gradeKey = (int) percentage / 10;

            switch (gradeKey) {
                case 10:
                case 9:
                    return "A";
                case 8:
                    return "B";
                case 7:
                    return "C";
                case 6:
                    return "D";
                case 5:
                    return "E";
                default:
                    return "F";
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\nEnter Student Name:");
                String name = sc.nextLine();

                System.out.println("Enter number of subjects:");
                int subjects = sc.nextInt();

                int total = 0;

                for (int i = 1; i <= subjects; i++) {
                    System.out.println("Enter marks for subject " + i + ":");
                    int marks = sc.nextInt();

                    if (marks < 0 || marks > 100) {
                        System.out.println("Invalid marks! Enter between 0 and 100.");
                        i--;
                        continue;
                    }
                    total += marks;
                }

                double percentage = calculatePercentage(total, subjects);
                String grade = assignGrade(percentage);

                System.out.println("\n--- Result Summary ---");
                System.out.println("Student Name : " + name);
                System.out.println("Total Marks : " + total);
                System.out.println("Percentage  : " + percentage + "%");
                System.out.println("Grade       : " + grade);

                System.out.println("\nDo you want to enter another student? (yes/no)");
                sc.nextLine();
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("no")) {
                    break;
                }
            }

            sc.close();
            System.out.println("\nProgram Ended.");
        }
    }



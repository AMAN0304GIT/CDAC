import java.util.Scanner;
class PassOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get grades for three subjects
        System.out.print("Enter the grade for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter the grade for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter the grade for Subject 3: ");
        int subject3 = scanner.nextInt();

        int failedSubjects = 0;

        // First switch to evaluate the first subject
        switch (subject1 > 40 ? 1 : 0) {
            case 0:
                failedSubjects++;
                // Nested switch to evaluate the second subject
                switch (subject2 > 40 ? 1 : 0) {
                    case 0:
                        failedSubjects++;
                        // Another nested switch to evaluate the third subject
                        switch (subject3 > 40 ? 1 : 0) {
                            case 0:
                                failedSubjects++;
                                break;
                            case 1:
                                break;
                        }
                        break;
                    case 1:
                        // Evaluate third subject if second is passed
                        switch (subject3 > 40 ? 1 : 0) {
                            case 0:
                                failedSubjects++;
                                break;
                            case 1:
                                break;
                        }
                        break;
                }
                break;

            case 1:
                // If the first subject is passed, evaluate the second subject
                switch (subject2 > 40 ? 1 : 0) {
                    case 0:
                        failedSubjects++;
                        // Evaluate third subject if second is failed
                        switch (subject3 > 40 ? 1 : 0) {
                            case 0:
                                failedSubjects++;
                                break;
                            case 1:
                                break;
                        }
                        break;
                    case 1:
                        // Evaluate third subject if second is passed
                        switch (subject3 > 40 ? 1 : 0) {
                            case 0:
                                failedSubjects++;
                                break;
                            case 1:
                                break;
                        }
                        break;
                }
                break;
        }

        // Determine if the student passes or fails
        switch (failedSubjects) {
            case 0:
                System.out.println("The student passes.");
                break;
            default:
                System.out.println("The student fails in " + failedSubjects + " subject(s).");
                break;
        }

 
    }
}

public class SurveyBasic {
    public static void main(String[] args) {
        int[][] survey = {
            {4, 5, 3, 4, 5, 4},
            {3, 4, 2, 3, 4, 3},
            {5, 4, 4, 5, 5, 4},
            {4, 4, 3, 4, 4, 4},
            {3, 3, 3, 3, 3, 3},
            {5, 5, 5, 5, 5, 5},
            {4, 3, 4, 4, 3, 4},
            {2, 3, 2, 3, 2, 3},
            {5, 4, 5, 4, 5, 4},
            {4, 5, 4, 5, 4, 5}
        };

        int respondents = survey.length;
        int questions = survey[0].length;

        // 1️⃣ Rata-rata per responden
        System.out.println("=== Average Score per Respondent ===");
        for (int i = 0; i < respondents; i++) {
            double sum = 0;
            for (int j = 0; j < questions; j++) {
                sum += survey[i][j];
            }
            double avg = sum / questions;
            System.out.println("Respondent " + (i + 1) + ": " + avg);
        }

        // 2️⃣ Rata-rata per pertanyaan
        System.out.println("\n=== Average Score per Question ===");
        for (int j = 0; j < questions; j++) {
            double sum = 0;
            for (int i = 0; i < respondents; i++) {
                sum += survey[i][j];
            }
            double avg = sum / respondents;
            System.out.println("Question " + (j + 1) + ": " + avg);
        }

        // 3️⃣ Rata-rata keseluruhan
        double totalSum = 0;
        for (int i = 0; i < respondents; i++) {
            for (int j = 0; j < questions; j++) {
                totalSum += survey[i][j];
            }
        }
        double overallAverage = totalSum / (respondents * questions);
        System.out.println("\nOverall Average Score: " + overallAverage);
    }
}

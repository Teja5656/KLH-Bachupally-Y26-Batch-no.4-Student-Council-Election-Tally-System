import java.util.Scanner;
public class StudentElectionTally {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = {"John", "Mon", "Con"};
        int[] votes = new int[3];
        System.out.print("Enter the number of students voting: ");
        int n = s.nextInt();
        System.out.println("Enter 1 for John, 2 for Mon, 3 for Con (0 to view results):");
        int count=0;
        while (count<n) {
            int choice = s.nextInt();
           if (choice >= 1 && choice <= 3){
            votes[choice - 1]++;
            count++;
            }
            else {
            System.out.println("Invalid choice.");
            }
        }
        int maxVotes = 0, winnerIndex = 0;
            for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + ": " + votes[i]);
            if (votes[i] > maxVotes) {
            maxVotes = votes[i];
            winnerIndex = i;
            }
        }
        if (maxVotes > 0) 
        System.out.println("Winner: " + names[winnerIndex] + "!");
    }
}
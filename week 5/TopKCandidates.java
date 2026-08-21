import java.util.*;

class Candidate {
    int candidateId;
    String name;
    int aptitude;
    int technical;
    int communication;

    Candidate(int candidateId, String name, int aptitude, int technical, int communication) {
        this.candidateId = candidateId;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    int getTotalScore() {
        return aptitude + technical + communication;
    }
}

public class TopKCandidates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Candidate[] candidates = new Candidate[n];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int aptitude = sc.nextInt();
            int technical = sc.nextInt();
            int communication = sc.nextInt();

            candidates[i] = new Candidate(
                id, name, aptitude, technical, communication
            );
        }

        Arrays.sort(candidates, new Comparator<Candidate>() {
            public int compare(Candidate a, Candidate b) {
                if (a.getTotalScore() != b.getTotalScore()) {
                    return b.getTotalScore() - a.getTotalScore();
                }

                return a.candidateId - b.candidateId;
            }
        });

        for (int i = 0; i < k; i++) {
            System.out.println(
                candidates[i].candidateId + " " +
                candidates[i].name + " " +
                candidates[i].getTotalScore()
            );
        }

        sc.close();
    }
}
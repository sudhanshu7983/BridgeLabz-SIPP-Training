import java.util.*;

public class VotingSystem {
    Map<String, Integer> votes = new HashMap<>();       // Candidate -> Votes
    Map<String, Integer> orderedVotes = new LinkedHashMap<>(); // maintain order

    // Add vote
    public void addVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, orderedVotes.getOrDefault(candidate, 0) + 1);
    }

    // Show results sorted by candidate name
    public Map<String, Integer> getResultsSorted() {
        return new TreeMap<>(votes);
    }

    // Show results in order of voting
    public Map<String, Integer> getResultsInOrder() {
        return orderedVotes;
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        system.addVote("Alice");
        system.addVote("Bob");
        system.addVote("Alice");
        system.addVote("Charlie");
        system.addVote("Bob");
        system.addVote("Alice");

        System.out.println("🔹 Final Votes (HashMap): " + system.votes);
        System.out.println("🔹 Sorted Results (TreeMap): " + system.getResultsSorted());
        System.out.println("🔹 Order of Voting (LinkedHashMap): " + system.getResultsInOrder());
    }
}

import java.util.*;
import java.time.*;

class Policy {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyHolder, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "[" + policyNumber + ", " + policyHolder + ", " + expiryDate + ", " + coverageType + ", " + premiumAmount + "]";
    }
}

public class InsuranceSystem {
    
    Map<String, Policy> hashMap = new HashMap<>();         // fast lookup
    Map<String, Policy> linkedHashMap = new LinkedHashMap<>(); // insertion order
    Map<LocalDate, Policy> treeMap = new TreeMap<>();      // sorted by expiry

    public void addPolicy(Policy p) {
        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);
        treeMap.put(p.expiryDate, p);
    }


    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }


    public List<Policy> getExpiringPolicies() {
        List<Policy> expiring = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);
        for(Policy p : treeMap.values()) {
            if(!p.expiryDate.isBefore(today) && !p.expiryDate.isAfter(limit)) {
                expiring.add(p);
            }
        }
        return expiring;
    }

    // Policies by coverage type
    public List<Policy> getPoliciesByCoverage(String coverageType) {
        List<Policy> result = new ArrayList<>();
        for(Policy p : hashMap.values()) {
            if(p.coverageType.equalsIgnoreCase(coverageType)) result.add(p);
        }
        return result;
    }

   
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        hashMap.values().removeIf(p -> p.expiryDate.isBefore(today));
        linkedHashMap.values().removeIf(p -> p.expiryDate.isBefore(today));
        treeMap.values().removeIf(p -> p.expiryDate.isBefore(today));
    }

    public static void main(String[] args) {
        InsuranceSystem system = new InsuranceSystem();

        system.addPolicy(new Policy("P101", "Sudhanshu", LocalDate.now().plusDays(10), "Health", 5000));
        system.addPolicy(new Policy("P102", "Ravi", LocalDate.now().plusDays(40), "Auto", 3000));
        system.addPolicy(new Policy("P103", "Aman", LocalDate.now().plusDays(5), "Home", 7000));

        System.out.println("🔹 Policy by Number (P101): " + system.getPolicyByNumber("P101"));
        System.out.println("🔹 Expiring in 30 days: " + system.getExpiringPolicies());
        System.out.println("🔹 Coverage Type (Auto): " + system.getPoliciesByCoverage("Auto"));

        system.removeExpiredPolicies();
        System.out.println("🔹 All policies after removing expired: " + system.hashMap.values());
    }
}

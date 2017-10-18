package builder;

public class Main {
    public static void main(String[] args) {
        PolicyService.Builder builder = new PolicyService.Builder();
        PolicyService service =
                builder.numOfYears(12).driverSeniority(15).build();
    }
}

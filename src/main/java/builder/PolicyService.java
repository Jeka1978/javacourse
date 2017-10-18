package builder;

public class PolicyService {
    private final int age;
    private final int numOfYears;
    private final int driverSeniority;

    private PolicyService(int age, int numOfYears, int driverSeniority) {
        this.age = age;
        this.numOfYears = numOfYears;
        this.driverSeniority = driverSeniority;
    }

    public PolicyService addAge(int delta) {

        return new PolicyService(age + delta, numOfYears, driverSeniority+delta);
    }


    public static class Builder{
        private int age;
        private int numOfYears;
        private int driverSeniority;


        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder numOfYears(int numOfYears) {
            this.numOfYears = numOfYears;
            return this;

        }

        public Builder driverSeniority(int driverSeniority) {
            this.driverSeniority = driverSeniority;
            return this;

        }

        public PolicyService build() {
            validate();
            return new PolicyService(age, numOfYears, driverSeniority);
        }

        private void validate() {
            if (age == 0) {
                throw new RuntimeException("age can't be 0");
            }
        }
    }



























}













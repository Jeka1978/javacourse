package java8;

public class StringIgonreCaseEqualator implements Equaltor<String> {
    @Override
    public boolean equals(String t1, String t2) {
        return t1.equalsIgnoreCase(t2);
    }
}

package strings;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String asds = stringBuilder.append("asds")
                .append(12)
                .append(12)
                .toString();

      log.error("****************");

    }
}

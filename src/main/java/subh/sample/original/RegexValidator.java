package subh.sample.original;

import java.util.Optional;
import java.util.function.Function;
import java.util.regex.Pattern;

public class RegexValidator {

    public static void main(String[] args) {
        // Static inputs for regex and text
        final String regex = "\\d"; // Example: Matches any sequence of digits
        final String input = "12345."; // Example: Input text

        // Validate the input text against the regex pattern using Java 8 features
        Optional.of(input)
                .map((Function<String, Boolean>) text -> Pattern.compile(regex)
                        .matcher(text)
                        .matches())
                .ifPresentOrElse(
                        isMatch -> System.out.println(
                                String.format("Regex: '%s'\nInput: '%s' -> %s", regex, input, isMatch ? "Matches" : "Does not match")),
                        () -> System.out.println("Input text is null"));
    }
}

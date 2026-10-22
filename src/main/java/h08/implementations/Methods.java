package h08.implementations;

import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

@SuppressWarnings("DuplicatedCode")
public final class Methods {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    @DoNotTouch
    private Methods() {
        // do not instantiate helper class
        throw new UnsupportedOperationException("do not instantiate helper class");
    }

    /**
     * Creates a Markdown heading from the input string.
     * A Markdown heading is a string that starts with a hash symbol (#) followed by a space and the heading text.
     *
     * @param text the text to be converted to a heading
     * @return the text formatted as a Markdown heading (# text)
     */
    @StudentImplementationRequired("H8.2.2")
    public static String heading(String text) {
        // TODO: H8.2.2
        return org.tudalgo.algoutils.student.Student.crash("H8.2.2 - Remove if implemented");
    }

    /**
     * Creates a Markdown bold text from the input string.
     * Markdown bold text is surrounded by "**".
     *
     * @param text the text to be made bold
     * @return the text formatted as bold (**text**)
     */
    @StudentImplementationRequired("H8.2.3")
    public static String bold(String text) {
        // TODO: H8.2.3
        return org.tudalgo.algoutils.student.Student.crash("H8.2.3 - Remove if implemented");
    }

    /**
     * Concatenates two strings
     *
     * @param x first string
     * @param y second string
     * @return x + y
     */
    @StudentImplementationRequired("H8.3.2")
    public static String concat(String x, String y) {
        // TODO: H8.3.2
        return org.tudalgo.algoutils.student.Student.crash("H8.3.2 - Remove if implemented");
    }

    /**
     * Replaces occurrences of the substring "OLD" in a string with a replacement
     *
     * @param text        the original text
     * @param replacement the replacement text (not used in this signature, but for method reference pattern)
     * @return the modified text
     */
    @StudentImplementationRequired("H8.3.3")
    public static String replaceOLD(String text, String replacement) {
        // TODO: H8.3.3
        return org.tudalgo.algoutils.student.Student.crash("H8.3.3 - Remove if implemented");
    }

    /**
     * Creates an acronym from an array of strings using title case.
     * An acronym is the concatenation of the starting characters of each word. Title case means that only
     * capital words are considered for the acronym.
     *
     * @param words the input words
     * @return the acronym formed from first letters of each word
     */
    @StudentImplementationRequired("H8.4.2")
    public static String acronym(String[] words) {
        // TODO: H8.4.2
        return org.tudalgo.algoutils.student.Student.crash("H8.4.2 - Remove if implemented");
    }

    /**
     * Joins strings with a spaces
     *
     * @param words the input words
     * @return the words joined with spaces
     */
    @StudentImplementationRequired("H8.4.3")
    public static String joinWithSpaces(String[] words) {
        // TODO: H8.4.3
        return org.tudalgo.algoutils.student.Student.crash("H8.4.3 - Remove if implemented");
    }
}

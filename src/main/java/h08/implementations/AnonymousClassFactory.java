package h08.implementations;

import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

@SuppressWarnings({"Convert2Lambda", "unused"})
public final class AnonymousClassFactory {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    @DoNotTouch
    private AnonymousClassFactory() {
        // do not instantiate helper class
        throw new UnsupportedOperationException("do not instantiate helper class");
    }

    /**
     * Returns a function that creates a Markdown heading from the input string.
     * A Markdown heading is a string that starts with a hash symbol (#) followed by a space and the heading text.
     *
     * @return function that formats the text as a Markdown heading (# text)
     */
    @StudentImplementationRequired("H8.2.2")
    public static Object heading() {
        // TODO: H8.2.2
        return org.tudalgo.algoutils.student.Student.crash("H8.2.2 - Remove if implemented");
    }

    /**
     * Returns a binary function that concatenates two strings.
     *
     * @return function that concatenates its two inputs
     */
    @StudentImplementationRequired("H8.3.2")
    public static Object concat() {
        // TODO: H8.3.2
        return org.tudalgo.algoutils.student.Student.crash("H8.3.2 - Remove if implemented");
    }

    /**
     * Returns a binary function that replaces occurrences of a target substring.
     *
     * @param target the substring to replace
     * @return function that replaces {@code target} in the input text
     */
    @StudentImplementationRequired("H8.3.4")
    public static Object replace(String target) {
        // TODO: H8.3.4
        return org.tudalgo.algoutils.student.Student.crash("H8.3.4 - Remove if implemented");
    }

    /**
     * Returns a variadic function that joins strings with the given delimiter.
     *
     * @param delimiter the string used between elements
     * @return function that joins the input strings with {@code delimiter}
     */
    @StudentImplementationRequired("H8.4.3")
    public static Object join(String delimiter) {
        // TODO: H8.4.3
        return org.tudalgo.algoutils.student.Student.crash("H8.4.3 - Remove if implemented");
    }
}

package h08;

import h08.interfaces.*;
import h08.implementations.*;
import h08.implementations.classes.*;
import h08.nodes.*;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

public class PaperFormatter {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    @DoNotTouch
    private PaperFormatter() {
        // do not instantiate helper class
        throw new UnsupportedOperationException("do not instantiate helper class");
    }

    /**
     * Formats the title nodes into a single paper title.
     * A title consists of a title case acronym and the full title separated by ": ".
     *
     * @param title the title words as nodes
     * @return a node evaluating to the formatted title
     */
    @StudentImplementationRequired("H8.6.1")
    public static Node formatTitle(
        Node[] title
    ) {
        // TODO: H8.6.1
        return org.tudalgo.algoutils.student.Student.crash("H8.6.1 - Remove if implemented");
    }

    /**
     * Formats a paper from title, author, and section nodes.
     * A title consists of a paper title ({@link PaperFormatter#formatTitle(Node[])}), followed by the authors in
     * italic, and the sections separated by two newlines.
     * Authors are separated by ", " and sections are preceded by "## Section\n".
     *
     * @param title    the title words as nodes
     * @param authors  the author names as nodes
     * @param sections the paper sections as nodes
     * @return a node evaluating to the formatted paper
     */
    @StudentImplementationRequired("H8.6.2")
    public static Node formatPaper(
        Node[] title,
        Node[] authors,
        Node[] sections
    ) {
        // TODO: H8.6.2
        return org.tudalgo.algoutils.student.Student.crash("H8.6.2 - Remove if implemented");
    }
}

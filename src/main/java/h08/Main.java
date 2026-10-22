package h08;

import h08.interfaces.*;
import h08.implementations.*;
import h08.implementations.classes.*;
import h08.nodes.*;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;
import org.tudalgo.algoutils.student.test.StudentTestUtils;

import static org.tudalgo.algoutils.student.test.StudentTestUtils.testEquals;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        sanityChecks();
        StudentTestUtils.printTestResults();
    }

    /**
     * Test student's implementation
     */
    @StudentImplementationRequired("H8.7")
    public static void sanityChecks() {
        // example comparison (modify as you want)
        String expected = "MyTest";
        String actual = "WrongActual";
        testEquals(expected, actual);

        // example paper result
        final String EXAMPLE_PAPER_STRING = """
            # LASER: Light Amplification by Stimulated Emission of Radiation

            *Charles H. Townes, Arthur L. Schawlow*

            ## Section
            The laser was invented around 1960 by Charles H. Townes and Arthur L. Schawlow.

            ## Section
            The laser was the first device to produce coherent electromagnetic waves.""";

        // TODO: H8.7
        org.tudalgo.algoutils.student.Student.crash("H8.7 - Remove if implemented");
    }

}

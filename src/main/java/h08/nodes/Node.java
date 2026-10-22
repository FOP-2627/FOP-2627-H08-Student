package h08.nodes;

import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * Represents a string expression which can be evaluated to its result.
 * Implementors will provide evaluation logic depending on their operand count.
 * Can also act as a functional interface.
 */
@FunctionalInterface
public interface Node {

    /**
     * Evaluates this expression, i.e. computes the String that is the result of this expression.
     *
     * @return the result of this expression
     */
    String evaluate();

    /**
     * Creates an array of {@link UnaryNode} instances, each applying the given {@link MyStringFunction} to the
     * corresponding {@link Node} in the provided array.
     *
     * @param function the function to be applied to each node
     * @param nodes    the nodes to which the function will be applied
     * @return an array of {@link UnaryNode} instances, each representing the application of the function to a node
     */
    @StudentImplementationRequired("H8.5.4")
    static Node[] forEachNode(Object function, Node... nodes) {
        // TODO: H8.5.4
        return org.tudalgo.algoutils.student.Student.crash("H8.5.4 - Remove if implemented");
    }
}

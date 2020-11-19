
package SP;

public class BinaryNode {
    Comparable key;          // The data in the node
    BinaryNode left;         // Left child
    BinaryNode right;        // Right child
    
    BinaryNode(Comparable theKey) {
        key = theKey;
        left = right = null;
    }
}

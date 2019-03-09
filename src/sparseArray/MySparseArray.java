package sparseArray;

/** Implementation of the SparseArray Interface. FILL IN CODE. */
public class MySparseArray implements SparseArray {

    // Add instance variables, helper methods, nested classes as needed.

    /**
     * Sets the default value for the sparse array
     * @param defaultValue default value
     */
    public MySparseArray(Object defaultValue) {
        // FILL IN CODE
    }

    /**
     * Getter for the default value
     * @return Returns the default value
     */
    @Override
    public Object getDefaultValue() {
        // FILL IN CODE
        return null;
    }

    /**
     * Returns an iterator over the rows
     * @return iterator over rows
     */
    @Override
    public RowIterator iterateRows() {
        // FILL IN CODE
        return null;
    }

    /**
     * Returns an iterator over the columns
     * @return iterator over columns
     */
    @Override
    public ColumnIterator iterateColumns() {
        // FILL IN CODE
        return null;
    }

    /**
     * Gets element at the given row and column
     * @param row row
     * @param col column
     * @return
     */
    @Override
    public Object elementAt(int row, int col) {
        // FILL IN CODE
        return null;
    }

    /**
     * Modifies the value at a given row, column,
     * or inserts the node for this row, column in the sparse array
     * if it did not exist before.
     * If value is the default value, then the node should be deleted from
     * the sparse array
     * @param row row
     * @param col column
     * @param value value of the element
     */
    @Override
    public void setValue(int row, int col, Object value) {
            // FILL IN CODE
    }
}

/**
 * An ordered list of String objects with an internal working position index.
 * 
 * The working position is a '1 based' index (there is no position 0), and may
 * be no more than 1 greater than the number of Strings stored in the list.
 * 
 * Lab 4 assignment objectives
 *  - create a class implementing this interface called LinkedStringList
 *  - use provided unit tests and the API docs to guide your implementation
 * hints: insert(String, int) and remove(int) should make use of other methods
 * Hand in: printed class code, D2L: zipped Netbeans project folder
 * Marking Criteria
 *  - code reuse (DRY)
 *  - pass all provided unit tests
 *  - WOW factor
 *  - Total /10
 */
interface StringList {

    /**
     * @return true if the list does not currently have any stored items
     */
    boolean isEmpty();

    /**
     * @return the number of items currently stored in the list
     */
    int getSize();

    /**
     * @return the current working position index
     */
    int getPosition();

    /**
     * Move the working position to the given index
     * 
     * The new working position index must be greater than 0 and less than one
     * more than the number of Strings currently stored in the list.
     * 
     * @param index the new working position
     * @throws IndexOutOfBoundsException if `index` is not a valid position
     *   within this list
     */
    void setPosition(int index);

    /**
     * Increments the working position index by 1, to a maximum of one more than
     * the number of items currently stored in the list.
     * 
     * @return false if the working position is already at the end of the list
     */
    boolean next();

    /**
     * Decrements the working position index by 1, to a minimum of 1.
     * 
     * @return false if the working position is already at the start of the list
     */
    boolean prev();

    /**
     * @return the String at the working position
     */
    String getString();

    /**
     * Insert a String into the list at the working position.
     * 
     * Any objects that are already at this position or later in the list
     * will be shifted up to the next position to make room for the newly
     * inserted String.
     * 
     * The working position is not changed by this method.
     * 
     * @param item the String to insert into the list
     */
    void insert(String item);

    /**
     * Insert a String into the list at the specified position.
     * 
     * The specified position must be between 1 and one more than the number
     * of String objects currently stored in the list.
     * 
     * Any objects that are already at this position or later in the list
     * will be shifted up to the next position to make room for the newly
     * inserted String.
     * 
     * The working position will be set to `index` by this method.
     * 
     * @param item the String to insert into the list
     * @param index the position where the new String will be added
     * @throws IndexOutOfBoundsException if `index` is not a valid position
     *   within this list
     */
    void insert(String item, int index);

    /**
     * Append a String to the end of the list.
     * 
     * The working position will not be changed by this method.
     * 
     * @param item the new String to add to the list
     * @return the position of the newly added item
     */
    int append(String item);

    /**
     * Remove the String at the working position from the list.
     * 
     * Any following items will be shifted down one position to fill the space
     * of the removed item.
     * 
     * The working position is not changed by this method.
     * 
     * @return false if the working position is at the end of the list
     *   where there is nothing to be removed, otherwise true
     */
    boolean remove();

    /**
     * The item at the specified position is removed from the list.
     * 
     * Any following items will be shifted down one position to fill the space
     * of the removed item.
     * 
     * The working position will be set to `index` by this method if
     * it returns true, or will be unchanged if it returns false.
     * 
     * @param index the position in the list where a String will be removed
     * @return false if there is no item to be removed at `index`, otherwise true
     */
    boolean remove(int index);

    /**
     * Remove all stored Strings from the list.
     * 
     * The working position will be set to 1 by this method.
     */
    void removeAll();

    /**
     * Sorts the list in ascending alphabetical order.
     * 
     * The working position will be set to 1 by this method.
     */
    void sort();

}

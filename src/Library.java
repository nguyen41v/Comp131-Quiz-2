import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> collection;

    /* Constructor; creates an empty collection.
     */
    public Library() {
        this.collection = new ArrayList<>();
    }

    /* Add a LibraryItem to the collection
     *
     * @param obj  The item to add.
     */
    public void addToCollection(LibraryItem obj) {
        this.collection.add(obj);
    }

    /* Count the number of items by the specified creator.
     *
     * The creator must match exactly.
     *
     * @param creator  The exact name of the creator to search for
     * @returns        The number of items by that creator
     */
    public int countCreatorItems(String creator) {
        int num_creator = 0;
        for (LibraryItem obj : this.collection) {
            if (obj.getCreator().equals(creator)) {
                num_creator ++;
            }
        }
        return num_creator;
    }

    /* Print all items in the library.
     */
    public void printCollection() {
        for (LibraryItem obj : this.collection) {
            System.out.println(obj.getName() + ", " + obj.getAttributionLine());
        }
    }

}

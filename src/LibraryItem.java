public class LibraryItem {

    private String name;
    private String creator;

    /* Constructor; The name of the item and its creator
     *
     * @param name     The name of this item
     * @param creator  The creator of this item
     */
    public LibraryItem(String name, String creator) {
        this.name = name;
        this.creator = creator;
    }

    /* Get the name of this item
     *
     * @returns  The name of this item
     */
    public String getName() {
        return this.name;
    }

    /* Set the name of this item
     *
     * @param name  The new name of this item
     */
    public void setName(String name) {
        this.name = name;
    }

    /* Get the creator of this item
     *
     * @returns  The creator of this item
     */
    public String getCreator() {
        return this.creator;
    }

    /* Set the creator of this item
     *
     * @param creator  The new name of this item
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /* Get a string that describes how the item was made by the creator
     *
     * @returns  The description
     */
    public String getAttributionLine() {
        return "created by " + this.getCreator();
    }

}

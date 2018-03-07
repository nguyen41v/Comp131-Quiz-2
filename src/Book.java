public class Book extends LibraryItem {

    /* Constructor; The name of the book and its author
     *
     * @param name     The name of this book
     * @param creator  The author of this book
     */


    public Book(String name, String creator) {
        super(name, creator);
        if (this.getCreator().isEmpty()) {
            this.setCreator("Anonymous");
        }
    }


    /* Get a string that describes how the item was made by the creator
     *
     * @returns  The description
     */
    public String getAttributionLine() {
        return "written by " + this.getCreator();
    }

}

public class Film extends LibraryItem {

    /* Constructor; The name of the film and its director
     *
     * @param name     The name of this film
     * @param creator  The director of this film
     */
    public Film(String name, String creator) {
        super(name, creator);
    }

    /* Get a string that describes how the item was made by the creator
     *
     * @returns  The description
     */
    public String getAttributionLine() {
        return "directed by " + this.getCreator();
    }

}

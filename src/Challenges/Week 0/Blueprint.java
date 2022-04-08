public abstract class Blueprint {
    String optionTitle;

    public Blueprint(String optionTitle) {
        this.optionTitle = optionTitle;
    }

    public abstract void run();

    public String getTitle() {
        return this.optionTitle;
    }
}
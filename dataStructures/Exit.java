public class Exit extends Blueprint {
    public Exit(String optionTitle) {
        super(optionTitle);
    }

    public void run() {
        System.exit(0);
    }

}
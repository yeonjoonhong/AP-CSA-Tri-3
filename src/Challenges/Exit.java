public class Exit extends Blueprint {
    public Exit(String optionTitle) {
        super(optionTitle);
    }

    public void run() {
        //terminates program
        System.exit(0);
    }

}

package by.home.сosmodrome;

public class Start {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        IStart[] iStarts = {new SpaceX(), new Shuttle()};
        for (IStart iStart : iStarts) {
            cosmodrome.launch(iStart);
            System.out.println();
        }
    }
}
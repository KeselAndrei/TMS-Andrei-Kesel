package by.home.сosmodrome;

public class Start {
    public static void main(String[] args) {
        IStart spaceX = new SpaceX();
        IStart shuttle = new Shuttle();
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.launch(shuttle);
        System.out.println();
        cosmodrome.launch(spaceX);

    }
}
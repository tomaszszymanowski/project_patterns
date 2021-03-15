package pl.tomasz.wzorceprojektowe.singleton;

public class Management {

    private static Management management;

    private Management(){
    }

    public static Management getInstance() {
        if(management == null){
            management = new Management();
        }
        return management;
    }
}

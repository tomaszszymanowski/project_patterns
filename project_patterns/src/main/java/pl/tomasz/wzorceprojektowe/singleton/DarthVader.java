package pl.tomasz.wzorceprojektowe.singleton;

public class DarthVader {
    private static DarthVader Datrh_Vader;

    public static DarthVader getInstance() {
        if(Datrh_Vader == null){
            Datrh_Vader = new DarthVader();
        }
        return Datrh_Vader;
    }
}

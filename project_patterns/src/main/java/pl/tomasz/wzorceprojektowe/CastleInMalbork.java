package pl.tomasz.wzorceprojektowe;

public class CastleInMalbork {
    private static CastleInMalbork malborkCastle;


    public static CastleInMalbork getInstance() {
        if(malborkCastle == null){
            malborkCastle = new CastleInMalbork();
        }
        return malborkCastle;
    }
}

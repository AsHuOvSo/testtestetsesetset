public class produktionskode {
    public static int Funktion1(int x, int y, int z){
        int midt = 0;
        if (x >= y && y >= z || x <= y && y <= z){
            midt = y;
        }
        if(y >=x && x >= z || z >= x && x >= y) {
            midt = x;
        }
        else {midt = z;}
        return midt;
    }
}


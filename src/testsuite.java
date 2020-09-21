public class testsuite {
    public static void main(String[] args) {
        //Testcase 1
        int x = 4, y = 3, z = 6;
        int res = produktionskode.Funktion1(x, y, z);
        System.out.println(res + " er det miderste tal");

        //testcase 2
        x = 3; y = 1; z = 2;
        res = produktionskode.Funktion1(x, y, z);
        System.out.println(res + " er det miderste tal");

        //testcase 3
        x = 1; y = 1; z = 3;
        res = produktionskode.Funktion1(x, y, z);
        System.out.println(res + " er det miderste tal");

        //Testcase 4
        x = 1; y = -2; z = 3;
        res = produktionskode.Funktion1(x, y, z);
        System.out.println(res + " er det miderste tal");

        //Testcase 5
        x = -1; y = 2; z = -3;
        res = produktionskode.Funktion1(x, y, z);
        System.out.println(res + " er det miderste tal");
    }
}

public class OOPSBannerApp {

    static void printO(int row) {
        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
        System.out.print(O[row] + "  ");
    }

    static void printP(int row) {
        String[] P = {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
        System.out.print(P[row] + "  ");
    }

    static void printS(int row) {
        String[] S = {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
        System.out.print(S[row] + "  ");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            printO(i);
            printO(i);
            printP(i);
            printS(i);

            System.out.println();
        }

    }
}
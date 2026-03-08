public class OOPSBannerApp {

    class BannerPrinter {

        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] P = {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };

        String[] S = {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };

        void printBanner() {

            for (int i = 0; i < 5; i++) {
                System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
            }

        }

    }

    public static void main(String[] args) {

        OOPSBannerApp app = new OOPSBannerApp();
        BannerPrinter printer = app.new BannerPrinter();

        printer.printBanner();

    }

}
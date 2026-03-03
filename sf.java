public class OOPSBanner {
    public static void main(String[] args) {
        String[] o = generateO();
        String[] p = generateP();
        String[] s = generateS();
        for (int i = 0; i < 9; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
    public static String[] generateO() {
        return new String[]{
                "  *****   ",
                " **     **",
                "**      **",
                "**      **",
                "**      **",
                "**      **",
                "**      **",
                " **     **",
                "  *****   "
        };
    }
    public static String[] generateP() {
        return new String[]{
                "******    ",
                "**     ** ",
                "**      ** ",
                "**     ** ",
                "******    ",
                "**        ",
                "**        ",
                "**        ",
                "**        "
        };
    }
    public static String[] generateS() {
        return new String[]{
                "  *****   ",
                " **     **",
                "**      **",
                "**        ",
                "  *****   ",
                "       ** ",
                "        **",
                " **     **",
                "  *****   "
        };
    }
}

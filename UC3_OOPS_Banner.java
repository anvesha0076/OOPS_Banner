public class UC3_OOPS_Banner {
    public static void main(String[] args) {

        String l1 = String.join("   ",
                "  ****  ",   
                "  ****  ",   
                " *****  ",   
                "  ****  "    
        );

        String l2 = String.join("   ",
                " *    * ",   // o
                " *    * ",   // o
                " *    * ",   // p
                " *      "    // s
        );

        String l3 = String.join("   ",
                " *    * ",
                " *    * ",
                " *****  ",
                "  ****  "
        );

        String l4 = String.join("   ",
                " *    * ",
                " *    * ",
                " *      ",
                "      * "
        );

        String l5 = String.join("   ",
                "  ****  ",
                "  ****  ",
                " *      ",
                "  ****  "
        );

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
    }
}
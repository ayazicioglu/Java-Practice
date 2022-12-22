package test.day05;

public class Q2_Menu {
    public static void main(String[] args) {
        // // create 2D array of food:
        //        // print all the foods sorted
        //        // american
        //        //----------
        //        // italian
        //        //----------
        //        // asian
        //        //----------
        //        // afghani
        //        //----------
        //        // indian
        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};

        for (String[] ulke:food) {
            for (String yemek:ulke) {
                System.out.println(yemek);
            }
            System.out.println("--------------------------------");
        }
        System.out.println("=============Fori Cozumu============");
        String[] ulkeler={"american","italian","asian","afghani","indian"};
        for (int i = 0; i < ulkeler.length; i++) {
            System.out.println("--------------- " +ulkeler[i]+" -------------");
            for (int j = 0; j < food[i].length; j++) {
                System.out.println(food[i][j]);
            }
        }
    }
}

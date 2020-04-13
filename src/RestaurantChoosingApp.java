public class RestaurantChoosingApp {
    public static void main(String[] args) {
        VeganRestaurant.Info.printName();
        VeganRestaurant.Info.printAddress();
        VeganRestaurant.Info.printMenu();
        System.out.println( );
        System.out.println( );
        SushiRestaurant.Info.printName();
        SushiRestaurant.Info.printAddress();
        SushiRestaurant.Info.printMenu();
    }
}

// ###################### RESTAURANT CLASSES ##########################
class VeganRestaurant {
    static class Info {
        static void printName() {
            System.out.println("########### Vegan Restaurant #############");

        }
        static void printMenu() {

            System.out.println("MENU          " +"x "+ Menu.getPrice(1) +"  portions"+ "         " + Menu.getPrice() );
            System.out.println("MENU          " +"x "+ Menu.getPrice(5) +"  portions"+ "(-" + Menu.disc(10) + "%)" +"   " +(( Menu.getPrice()*Menu.getPrice(5))-( Menu.getPrice()*Menu.getPrice(5))*0.10) );
            System.out.println("SPECIAL MENU  " +"x "+ SpecialMenu.getPrice(1) +"  portions"+ "         " + SpecialMenu.getPrice() );
            System.out.println("SPECIAL MENU  " +"x "+ SpecialMenu.getPrice(10) +" portions"+ "(-" + SpecialMenu.disc(20) + "%)" +"  " +(( SpecialMenu.getPrice()*SpecialMenu.getPrice(10))-( SpecialMenu.getPrice()*SpecialMenu.getPrice(10))*0.20) );

        }
        static void printAddress() {
            System.out.println("-- DownTown Str 88/A, Minicity         --");
        }
    }
    static class Menu {
        static double getPrice() {

            return 100.0;
        }
        static int getPrice(int portions) {


        return portions;
        }
        static int disc(int disscounts) {


            return disscounts;
        }

    }
    static class SpecialMenu {
        static double getPrice() {

            return 300.0;

        }
        static int getPrice(int portions) {


            return portions;
        }
        static int disc(int disscounts) {


            return disscounts;
        }
    }

}

class SushiRestaurant extends VeganRestaurant {
    static class Info {
        static void printName() {
            System.out.println("######### Sushi Mini Restaurant #########");
        }

        static void printAddress() {
            System.out.println("-- UpTown Str 77/B, Maxicity           --");
        }


        public static void printMenu() {
            System.out.println("MENU          " +"x "+ Menu.getPrice(1) +"  portions"+ "          " + (Menu.getPrice()-50) );
            System.out.println("MENU          " +"x "+ Menu.getPrice(5) +"  portions"+ "(-" + (Menu.disc(5) + "%)" +"    " +(((Menu.getPrice()-50)*Menu.getPrice(5))-((Menu.getPrice()-50)*Menu.getPrice(5))*0.05) ));
            System.out.println("SPECIAL MENU  " +"x "+ SpecialMenu.getPrice(1) +"  portions"+ "         " + (SpecialMenu.getPrice()-100) );
            System.out.println("SPECIAL MENU  " +"x "+ SpecialMenu.getPrice(10) +" portions"+ "(-" + SpecialMenu.disc(10) + "%)" +"  " +(((SpecialMenu.getPrice()-100)*SpecialMenu.getPrice(10))-((SpecialMenu.getPrice()-100)*SpecialMenu.getPrice(10))*0.10) );
        }
    }




}
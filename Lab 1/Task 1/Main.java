public class Main
{
    public static void main(String[] args) {
        boolean nofirst1;
        boolean nofirst2;
        boolean nofirst3;

        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();

        monitor1.col = "Black";
        monitor1.resol = 1880;
        monitor1.dimen = 17.3f;

        monitor1.col = "White";
        monitor1.resol = 720;
        monitor1.dimen = 15.6f;

        if (monitor1.col == monitor2.col) {
            nofirst1 = true;
            System.out.println("Colours are the same");
        }
        else {nofirst1 = false;
            System.out.println("Different colours");
        }

        if (monitor1.resol == monitor2.resol) {
            nofirst2 = true;
            System.out.println("Resolution is the same");
        }
        else {nofirst2 = false;
            System.out.println("Different resolution");
        }

        if (monitor1.dimen == monitor2.dimen) {
            nofirst3 = true;
            System.out.println("Same dimensions");
        }
        else {nofirst3 = false;
            System.out.println("Different dimensions");
        }

        if (nofirst1 == true){
            if (nofirst2 == true){
                if (nofirst3 == true){
                    System.out.println("Monitors are the same");
                }
            }
        }
        else System.out.println("Monitors differ at least by 1 criterium");
    }
}

public class ClassesTest {

    public static void main(String[] args) throws Exception {
        // Pet veera = new Pet("Veera X");
        // System.out.println(veera.name);

        //Product p1 = new Product("iPhone 13", 3000);
        //System.out.println(p1.title); // "iPhone 13"
        //System.out.println(p1.price); // 3000

        Logfile lf = new Logfile("output.txt");
        lf.log("Hello");
        lf.log("World");

        Logfile lf2 = new Logfile("/tmp/out.txt");
        lf2.log("Writing out some content");
        lf2.log("Writing out more content again");

        Logfile lf3 = new Logfile("logs.txt");
        lf3.log("Outputting something");
    }
}

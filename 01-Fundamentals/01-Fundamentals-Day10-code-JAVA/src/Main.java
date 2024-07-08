public class Main {

    public static void main(String[] args) {

        var template = "Hello %s from the city %s! Best wishes to your country %s!"
        var msg = String.format(template, args[0], args[1], args[2])

        System.out.println(msg);
    }
}

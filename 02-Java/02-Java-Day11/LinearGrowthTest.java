class LinearGrowthTest {

    public static void main(String[] args) {
        int[] massiveArray = new int[10_000];
        for (int i = 0; i < massiveArray.length; i++) {
            massiveArray[i] = i + 1;
        }

        printLastInArray(massiveArray);
    }

    public static void printLastInArray(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
          s += i;
        }
        // System.out.println(s);
    }
}
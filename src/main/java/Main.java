public class Main {
    public static void main(String[] args) {
        String arg1 = "11";
        String arg2 = "100";
        BinOps binOps = new BinOps();

        String sum = binOps.sum(arg1, arg2);
        String mult = binOps.mult(arg1, arg2);

        System.out.println("3 + 4 =");
        System.out.println(Integer.parseInt(sum, 2));
        System.out.println("3 * 4 =");
        System.out.println(Integer.parseInt(mult, 2));
    }
}

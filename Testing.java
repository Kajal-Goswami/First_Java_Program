public public class Testing {

    public int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Testing t = new Testing();
        System.out.println("Sum = " + t.sum(10,5));
    }
}

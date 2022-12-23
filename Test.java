public class Test {
    public static void main(String[] args) {
        ShapeCalculator sc = new ShapeCalculator();
        Shape shape = null;
        boolean shouldAgain = true;
        while (shouldAgain) {
            try {
                System.out.println("What u want create?");
                System.out.println("1-Rectangle, 2-Circle,3-Triangle");
                shape = sc.createShape();
                System.out.println(shape.toString());
                shouldAgain = false;
            } catch (Exception e) {
                System.err.println("Bad data try again");
            } finally {
              sc.clearBuffer();
            }

        }
        sc.closeScanner();
    }
}

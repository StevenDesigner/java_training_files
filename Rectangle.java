public class Rectangle {
    static int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Area: " + calculateArea(5, 10)); // 50
        System.out.println("Area: " + calculateArea(7, 3));  // 21
    }
}

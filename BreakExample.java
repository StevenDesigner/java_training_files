public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {  
                break;  // Stop the loop when i is 7
            }
            System.out.println(i);
        }
    }
}

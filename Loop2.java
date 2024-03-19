public class Loop2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // In the loop, when the value is "4", jump directly to the next value.
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}

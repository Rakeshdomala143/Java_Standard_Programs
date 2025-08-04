class HarshadNumbersToPrint1To100 {
    public static void main(String[] args) {

        System.out.println("Harshad numbers from 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            int s = 0, tmp = i;
            
            // Calculate sum of digits
            while (tmp > 0) {
                s += tmp % 10;
                tmp /= 10;
            }

            // Check if it's a Harshad number
            if (i % s == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

public class Liczydlo {
    public static void main(String[] args) {
        int count=0;

        int[] numbers = new int[]{2, 3, 7, 3, 3, 5, 2};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
                if (numbers[i]==3) {
                    count++;
                }


        }

        System.out.println("Ilosc trojek "+count);

    }
}
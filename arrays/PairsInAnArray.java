public class PairsInAnArray {
    public static void pairsInArr(int numbers[]) {
        int totalEle = 0;
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];

            //next loop
            for(int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                totalEle++;
            }
            System.out.println();
        }
        System.out.print(totalEle);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        pairsInArr(numbers);
    }
}
package exercises;

import java.util.ArrayList;

public class EvenCheck {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Integer count = 341;
        Integer numTo = count - 1;
        for (int i = 1; i < count; i++) {
            numList.add(i);
        }
        Integer sum = 0;
        Integer howMany = 0;
        for (Integer num : numList) {
            if (num % 2 == 0) {
                sum += num;
                howMany += 1;
            }
        }
        System.out.println("The sum of 1-" + numTo + " is " + (sum/howMany));
    }
}

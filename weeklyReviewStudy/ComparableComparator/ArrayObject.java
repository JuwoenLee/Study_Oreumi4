package weeklyReviewStudy.ComparableComparator;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayObject {
    public static void main(String[] args) {
        RandomNumber[] randomNumbers = new RandomNumber[5];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = new RandomNumber((int)(Math.random() * 100));
        }

        for (RandomNumber randomNumber : randomNumbers) {
            System.out.print(randomNumber.value + " ");
        }
        System.out.println();

        // Comparator 인터페이스는 오직 하나의 추상 메서드인 compare()를 정의하고 있으므로,
        // 람다식을 이용하여 Comparator를 정의할 때는 자동으로 compare() 메서드를 재정의

        Comparator<RandomNumber> comparator = (o1, o2) -> o1.value - o2.value;

//         배열과 comparator 객체로 정렬 기준을 전달
        Arrays.sort(randomNumbers, comparator);

        for (RandomNumber randomNumber : randomNumbers) {
            System.out.print(randomNumber.value + " ");
        }
        System.out.println();
    }
}

class RandomNumber {
    int value;

    public RandomNumber(int value) {
        this.value = value;
    }
}

package ControlFlowStatements;

public class SumOddChallenge {

    public static void main(String[] args) {

        System.out.println(isOdd(5));
        System.out.println(sumOdd(-1,-5));

    }

    public static boolean isOdd (int number) {
        if (number <= 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd (int start, int end) {

        if (start<=0 || end<=0 || start > end) {
            return -1;
        }

        int sum = 0;

        for (int i=start; i <= end; i++) {

            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;

        }
    }



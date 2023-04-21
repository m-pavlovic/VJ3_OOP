public class AUXCLS {

    public static long calSumFirstNInt(int numInt) {
        long sum = 0;

        for (int k = 0; k <= numInt; k++) {
            sum+=k;
        }


        return sum;
    }

    public static long recursiveSumFirstNInt(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n + recursiveSumFirstNInt(n-1);
        }
    }

    public static long powerOf(int n, int pot) {
        long result = 1;
        for (int k = 1; k <= pot; k++) {
            result*=n;
        }


        return result;
    }

    public static long recursivePowerOf(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * recursivePowerOf(base, exponent-1);
        }
    }

    public static long recursiveNFact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return  n * recursiveNFact(n-1);

        }
    }
}

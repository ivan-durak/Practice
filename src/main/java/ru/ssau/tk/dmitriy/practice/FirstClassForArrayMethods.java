package ru.ssau.tk.dmitriy.practice;

public class FirstClassForArrayMethods {

    public double[] createArrayWithDimension(int dimension) {
        return new double[dimension];
    }

    public double[] getArrayOfOnes(int dimension) {
        double[] array = new double[dimension];
        for (int i = 0; i < array.length; i++) {
            if ((i == 0) || (i == array.length - 1)) {
                array[i] = 2;
            } else
                array[i] = 1;
        }
        return array;
    }

    public double[] getArrayOfOddIntegerNumbers(int dimension) {
        double[] array = new double[dimension];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
        }
        return array;
    }

    public double[] getArrayOfEvenDecreasingNumbers(int dimension) {
        double[] array = new double[dimension];
        for (int i = 0; i < array.length; i++) {
            array[i] = (dimension - i) * 2;
        }
        return array;
    }

    public double[] getArrayOfFibonacciNumbers(int dimension) {
        double[] array = new double[dimension];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public double[] getArrayOfSquareOfNumbers(int dimension) {
        double[] array = new double[dimension];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        return array;
    }

    public double[] getSolvingTheQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return new double[]{-c / b};
        }
        if (b == 0) {
            double result = -c / a;
            if (result < 0) {
                return new double[]{};
            } else {
                return new double[]{-Math.sqrt(result), Math.sqrt(result)};
            }
        }
        if (c == 0) {
            double result = -b / a;
            if (result < 0) {
                return new double[]{result, 0};
            } else {
                return new double[]{0, result};
            }
        }
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) return new double[]{};
        if (discriminant == 0) return new double[]{-b / (2 * a)};
        double firstX = (-b + Math.sqrt(discriminant)) / (2 * a);
        double secondX = (-b - Math.sqrt(discriminant)) / (2 * a);
        if (firstX == secondX) return new double[]{firstX};
        if (secondX < firstX) return new double[]{secondX, firstX};
        return new double[]{firstX, secondX};
    }

    public double[] getArrayOfNaturalNumbersNotDivisibleBy3(int dimension) {
        double[] array = new double[dimension];
        int help = 0;
        for (int i = 0; array[dimension - 1] == 0; i++) {
            if (i % 3 == 0) {
                help++;
                continue;
            }
            array[i - help] = i;
        }
        return array;
    }

    public double[] getArrayOfArithmeticProgression(int dimension, double firstElement, double difference) {
        double[] array = new double[dimension];
        array[0] = firstElement;
        for (int i = 1; i < dimension; i++) {
            array[i] = firstElement + difference * i;
        }
        return array;
    }

    public double[] getArrayOfGeometricProgression(int dimension, double firstElement, double denominator) {
        double[] array = new double[dimension];
        array[0] = firstElement;
        for (int i = 1; i < dimension; i++) {
            array[i] = firstElement * Math.pow(denominator, i);
        }
        return array;
    }

    public double[] getArrayOIntegerDivisors(double number) {
        int numberOfDivisors = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) numberOfDivisors++;
        }
        if (numberOfDivisors == 0) return null;
        double[] array = new double[numberOfDivisors];
        int j = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                array[j++] = i;
            }
        }
        return array;
    }

    public double[] getArrayOfPositivePrimes(double number) {
        int numberOfPositivePrimes = 0;
        for (int i = 2; i <= number; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if ((i % j) != 0) {
                    continue;
                }
                isSimple = false;
            }
            if (isSimple) numberOfPositivePrimes++;
        }
        double[] array = new double[numberOfPositivePrimes];
        int index = 0;
        for (int i = 2; i <= number; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    continue;
                }
                isSimple = false;
            }
            if (isSimple) array[index++] = i;
        }
        return array;
    }

    public double[] getSymmetricalArray(int dimension) {
        double[] array = new double[dimension];
        int index;
        if (dimension % 2 != 0) {
            index = (dimension / 2) + 1;
        } else {
            index = dimension / 2;
        }
        for (int i = 1; i <= index; i++) {
            array[i - 1] = i;
            array[dimension - i] = i;
        }
        return array;
    }

    public void getArrayOfElementsWithOppositeSigns(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= (-1);
        }
    }

    public boolean isNumberInTheArray(double[] array, double number) {
        boolean result = false;
        for (double x : array) {
            if (x == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isNullInTheArray(Integer[] array) {
        boolean result = false;
        for (Integer x : array) {
            if (x == null) {
                result = true;
                break;
            }
        }
        return result;
    }
}
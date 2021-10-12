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

    public int getNumberOfEvenNumbersInArray(double[] array) {
        int numberOfEvenNumbers = 0;
        for (double element : array) {
            if (element % 2 == 0) {
                numberOfEvenNumbers++;
            }
        }
        return numberOfEvenNumbers;
    }

    public Object getMaximalElementInArray(double[] array) {
        if (array.length == 0) {
            return null;
        }
        double maxElement = array[0];
        for (double v : array) {
            if (maxElement < v) {
                maxElement = v;
            }
        }
        return maxElement;
    }

    public double getSumOfNumbersWithEvenIndexes(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public boolean whoHasTheMostDivisible(double[] array) {
        int divisibleByFirstElement = 0, divisibleByLastElement = 0;
        for (double v : array) {
            if (v % array[0] == 0) {
                divisibleByFirstElement++;
            }
            if (v % array[array.length - 1] == 0) {
                divisibleByLastElement++;
            }
        }
        return divisibleByFirstElement > divisibleByLastElement;
    }

    public double theNumberThatRepeats(double[] array) {
        double[] duplicateNumbers = new double[1];
        double[] numberOfRepetitions = new double[1];
        int index = 0; //по нему определяем длину верхних массивов
        for (int i = 0; i < array.length; i++) { //опорный элемент
            for (int j = array.length - 1; j > i; j--) { //сравниваемый элемент с конца
                if (array[i] == array[j]) { //элементы равны
                    if (i > getIndexOfDuplicateNumber(array[i], array)) {
                        continue;
                    } else if (isInTheArrayOfDuplicateNumbers(array[i], duplicateNumbers)) { //элемент уже содержится в массиве повторяющихся значений
                        numberOfRepetitions[getIndexOfDuplicateNumber(array[i], duplicateNumbers)]++;
                    } else { //не содержится
                        double[] newDuplicateNumbers = new double[duplicateNumbers.length + 1];
                        double[] newNumberOfRepetitions = new double[numberOfRepetitions.length + 1];
                        System.arraycopy(duplicateNumbers, 0, newDuplicateNumbers, 0, duplicateNumbers.length);
                        System.arraycopy(numberOfRepetitions, 0, newNumberOfRepetitions, 0, numberOfRepetitions.length);
                        duplicateNumbers = newDuplicateNumbers;
                        numberOfRepetitions = newNumberOfRepetitions;
                        duplicateNumbers[index] = array[i];
                        numberOfRepetitions[index]++;
                        index++;
                    }
                }
            }
        }
        return duplicateNumbers[0];
    }

    private boolean isInTheArrayOfDuplicateNumbers(double x, double[] array) { //для метода theNumberThatRepeats()
        boolean result = false;
        for (double element : array) {
            if (x == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    private int getIndexOfDuplicateNumber(double x, double[] array) { //для метода theNumberThatRepeats()
        int help = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                help = i;
                break;
            }
        }
        return help;
    }

    public int getFirstIndexOfNumber(double[] array, double number) {
        int help = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                help = i;
                break;
            }
        }
        return help;
    }

    public void oppositeTheMaxAndMinElements(double[] array) {
        double maxElement = array[0], minElement = array[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
        }
        array[minIndex] = maxElement;
        array[maxIndex] = minElement;
    }

    public void bitwiseNegation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }
}
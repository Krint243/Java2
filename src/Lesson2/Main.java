package Lesson2;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {
                {"0", "0", "3", "4"},
                {"2", "7", "2", "3"},
                {"1", "11", "2", "2"},
                {"2", "0", "5", "2"},
        };
        try {
            System.out.println("Сумма значений массива - " + getSum(arr, 4));
        } catch (MyArraySizeException e) {
            System.out.println("Невозможно вычислить сумму массива. Массив имеет неверный размер.");
        } catch (MyArrayDataException e) {
            System.out.println("Невозможно вычислить сумму массива. В ячейке " + e.getCoordinates() + " ошибочные данные");
        }
    }

    public static int getSum(String[][] arr, int arraySize) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        if (arr.length != arraySize) {
            throw new MyArraySizeException("Неверный размер массива", arr.length);

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arraySize) {
                throw new MyArraySizeException("Неверный размер массива", arr[i].length);
            }
            for (int j = 0; j < arr[j].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Эллемент невозможно привести к цифровому значению", i, j);
                }
            }

        }
        return result;
    }
}




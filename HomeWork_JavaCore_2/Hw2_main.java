package HomeWork_JavaCore_2;

public class Hw2_main {

    public static int arraySum(String[][] twoArray) throws MyArraySizeException, MyArrayDataException {
        if (twoArray.length != 4) {
            throw new MyArraySizeException("Длина массива не равна 4");
        }

        for (String[] oneArray : twoArray) {
            if (oneArray.length != 4) {
                throw new MyArraySizeException("Высота массива не равна 4");
            }
        }
        int sum = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray.length; j++) {
                try {
                    sum += Integer.parseInt(twoArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке содержится не число: " + i + "," + j);
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        String[][] successArray =
                        {{"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"}};

        try {
            System.out.println(arraySum(successArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


        String[][] NotCorrectArray =
                        {{"5h", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"}};

        try {
            System.out.println(arraySum(NotCorrectArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


        String[][] IncorrectNumberOfCells =
                        {{"2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"},
                        {"1", "2", "3", "4"}};

        try {
            System.out.println(arraySum(IncorrectNumberOfCells));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

}

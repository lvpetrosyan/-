import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] arg) {

        int array[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length-i-1; i++) {
            int testArray = array[i];

            // Обмен местами элементов
            array[i] = array[array.length-1-i];
           array[array.length - 1 - i]=testArray;
        }


        // Вывод перевернутого массива
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

}
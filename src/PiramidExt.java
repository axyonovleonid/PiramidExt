/**
 * PiramidExt created by лёня on 04.05.2017.
 */

public class PiramidExt {

    public static void main(String[] args) {

        try {
            if(args.length != 2)
                throw new IllegalArgumentException("Incorrect arguments");

            int rowPos = Integer.parseInt(args[0]);
            int colPos = Integer.parseInt(args[1]);

            if(colPos > rowPos || rowPos < 0 || colPos < 0)
                throw new IllegalArgumentException("Incorrect arguments");


// А вот тут, в отличие от предыдущей задачи, мне удалось найти формулу, дающую правильное решение за О(1).
// Ну, наверное, правильное. Зато точно за О(1)!

            int count = colPos + (rowPos - colPos)*(colPos + 1);
            System.out.println(count);

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}


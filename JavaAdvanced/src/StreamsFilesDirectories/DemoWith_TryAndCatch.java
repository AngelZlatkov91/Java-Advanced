package StreamsFilesDirectories;

public class DemoWith_TryAndCatch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[100]);
            // ако това ми върне грешка да го задържи
            // и да продължи на дол
            // без да прекъсва програмата
        } catch (ArrayIndexOutOfBoundsException e){
         // какво искаме да се случи ако имаме грешка
            System.out.println("This index is not valid");
        } finally {
            // код, който винаги се изплнява ,
            // но не е задължително да го има
        }

        System.out.println("Angel");
    }
}

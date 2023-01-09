public class Task_3 {
    //Дан следующий код, исправьте его там, где требуется (задание 3)
    public static void main(String[] args) throws Exception {
        int index = 3;
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        if (index > abc.length) {
            throw new IndexOutOfBoundsException("Array Fault!");
        }
        abc[index] = 9;
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
package lr6.task3;

public class Task3 {
    private static class Task{
        //наибольшее значение,
        private static void calcMax(int ... array){
            int max = array[0];
            for (int i =0; i<array.length; i++) {
                max = Math.max(max, array[i]);
            }
            System.out.println("Maximum array[] = "+max);
        }
        //наименьшее значение,
        private static void calcMin(int ... array){
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                min = Math.min(min, array[i]);
            }
            System.out.println("Minimum array[] = "+min);
        }
        //среднее значение из набора чисел.
        private static void calcAvg(int ... array){
            int sum = 0;
            for (int i =0; i<array.length; i++) {
                sum = array[i]+sum;
            }
            double avg = (double)sum/array.length;
            System.out.println("Average array[] = "+avg);
        }
    }
    public static void main(String[] args) {
        Task.calcMax(1,0,-9,5,25,-101);
        Task.calcMin(3,0,500,-2,33,-5,6,17);
        Task.calcAvg(3,0,50,-2,33,-5,6,17);
    }
}
/*Напишите программу с классом, в котором есть статические методы, которым
можно передавать произвольное количество целочисленных аргументов (или
целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
значение из набора чисел.
*/
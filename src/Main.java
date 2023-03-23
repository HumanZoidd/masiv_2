public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
       // task5();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1(){
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            summa = summa + arr[i];
        }
            System.out.println("Сумма расходов "+ summa+" через обычный цикл");
        int summaEach = 0;
        for (int element : arr) {
            summaEach = summaEach + element;
        }
        System.out.println("Сумма расходов "+ summaEach+" через цикл for-each");
    }
    public static void task2(){
        //«Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей»
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int minSumma = arr[0];
        int maxSumma = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSumma) {
                minSumma = arr[i];
            }
            if (arr[i] > maxSumma) {
                maxSumma = arr[i];
            }
        }
        System.out.println();
        System.out.println("« Минимальная сумма трат за день составила "+ minSumma+" рублей.»");
        System.out.println("« Максимальная сумма трат за день составила " + maxSumma + " рублей.»");


    }
    public static void task3(){
        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int totalSumma = 0;
        int kolDnei = arr.length;
        for (int element : arr) {
            totalSumma = totalSumma + element;
        }
        System.out.println(" Средняя сумма в день составляет " + (totalSumma / kolDnei) + " рублей, за "+ kolDnei+ " дней. ");
    }
    public static void task4(){
        // Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        }
    }


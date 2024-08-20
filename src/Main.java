import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1(){

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double [] array2 = {1.57, 7.654, 9.986};
        int [] array3 = {1, 2, -1, 0};
    }
    public static void task2(){
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double [] array2 = {1.57, 7.654, 9.986};
        int [] array3 = {1, 2, -1, 0};
        for (int i = 0; i<array1.length; i++){
            if (i< array1.length - 1) {
                System.out.print(array1[i] + ", ");
            }
            else {
                System.out.print(array1[i]+"\n");
            }
        }
        for (int i = 0; i<array2.length; i++){
            if (i< array2.length - 1) {
                System.out.print(array2[i] + ", ");
            }
            else {
                System.out.print(array2[i]+"\n");
            }
        }
        for (int i = 0; i<array3.length; i++){
            if (i< array3.length - 1) {
                System.out.print(array3[i] + ", ");
            }
            else {
                System.out.print(array3[i]+"\n");
            }
        }
    }
    public static void task3(){
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double [] array2 = {1.57, 7.654, 9.986};
        int [] array3 = {1, 2, -1, 0};
        for (int i = array1.length-1; i>=0; i--){
            if (i>0) {
                System.out.print(array1[i] + ", ");
            }
            else {
                System.out.print(array1[i]+"\n");
            }
        }
        for (int i = array2.length-1; i>=0; i--){
            if (i>0) {
                System.out.print(array2[i] + ", ");
            }
            else {
                System.out.print(array2[i]+"\n");
            }
        }
        for (int i = array3.length-1; i>=0; i--){
            if (i>0) {
                System.out.print(array3[i] + ", ");
            }
            else {
                System.out.print(array3[i]+"\n");
            }
        }
    }
    public static void task4(){
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i<array1.length; i++){
            if (array1[i] %2 !=0){
                array1[i]+=1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
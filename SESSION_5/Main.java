/*
In this session, we will do a comparison between three sorting algorithms.

We will be looking into how many comparisons are performed using each algorithm.

To do so, we compare using the class MyComparator, which implements the interface Comparator.

To read more about Comparator and how to use it, refer to https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html

Quick example:

    if (a>b)  -> if (MyComparator.getInstance().compare(a,b) > 0)
    if (a==b) -> if (MyComparator.getInstance().compare(a,b) == 0)
    if (b<=a) -> if (MyComparator.getInstance().compare(b,a) <= 0)

The Comparator interface is useful when we need to compare between objects that don't have a direct numerical value.

In this program, we will be using Comparator to count how many comparisons are performed in each algorithm.

Take a look around the code that already exists.
The method bubbleSort(Integer[]) is already implemented, see how we use the Comparator there.

Your task is to implement the methods: mergeSort(Integer[]) and selectionSort(Integer[]) using the Comparable class
as shown in the bubbleSort example.

You may look up the code on your course page or online if you want to.


The second task is to try and explain the results obtained in the tests we have.


 */
public class Main {
    //TODO Have fun!

    static void bubbleSort(Integer[] array){
        int n = array.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (MyComparator.getInstance().compare(array[j - 1], array[j]) > 0) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }


    static void mergeSort(Integer[] array){
    }

    static void selectionSort(Integer[] array){
    }


    static int numberOfTests = 10;
    static int maxLengthOfArray= 25;
    public static void main(String[] args) {

        int counter=1;
        while(counter<=numberOfTests){
            Integer[] testArray = Helper.createRandomArray(maxLengthOfArray);

            System.out.print("\n\n\nTest #"+String.valueOf(counter)+": ");
            Helper.printArray(testArray);

            MyComparator.getInstance().resetCounter();
            bubbleSort(testArray);
            System.out.println("Sorting with Bubble Sort took "+String.valueOf(MyComparator.getInstance().getNumberOfComparisons()+ " comparisons"));

            MyComparator.getInstance().resetCounter();
            selectionSort(testArray);
            System.out.println("Sorting with Selection Sort took "+String.valueOf(MyComparator.getInstance().getNumberOfComparisons()+ " comparisons"));

            MyComparator.getInstance().resetCounter();
            mergeSort(testArray);
            System.out.println("Sorting with Merge Sort took "+String.valueOf(MyComparator.getInstance().getNumberOfComparisons()+ " comparisons"));


            counter++;
        }
    }
}

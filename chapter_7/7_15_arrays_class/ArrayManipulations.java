import java.util.Arrays;
public class ArrayManipulations {
    public static void main(String... args){

        //Classifying an array
        double[] notas = {12.5, 10.5, 20, 9, 2.5, 4, 1, 6.3, 9.2, 10.4, 11, 16.3};
        System.out.printf("Array notas whitout sort: %n");
        int counter = 1;
        for(double nota: notas)
            System.out.printf("%-2d-> %5.2f%n", counter++, nota);

        Arrays.sort(notas);
        System.out.printf("Array notas with sort: %n");
        counter = 1;
        for(double nota: notas)
            System.out.printf("%-2d-> %5.2f%n", counter++, nota);

        //Filling an empty array
        int[] emptyArray = new int[10];
        outputArrayUni_dimensional(emptyArray, "Printing emptyArray without values");
        Arrays.fill(emptyArray,10);
        outputArrayUni_dimensional(emptyArray, "Printing filled emptyArray with values");

        //Copying an array
        int [] data = {2001, 2005, 2018, 1994, 1894, 2004, 2003, 1423, 1548, 1914};
        outputArrayUni_dimensional(data, "Printing array data");
        int[] dataCopy = new int[data.length];
        System.arraycopy(data, 0, dataCopy, 0, data.length);
        outputArrayUni_dimensional(dataCopy, "Printing array dataCopy");

        //Comparing two arrays
        boolean result = Arrays.equals(data, dataCopy);
        System.out.printf("Array data is %s to Array dataCopy.%n", (result ? "==" : "!="));

        //Comparing two arrays
        result = Arrays.equals(data, emptyArray);
        System.out.printf("Array data is %s to Array emptyArray.%n", (result ? "==" : "!="));

        //Making a binary search
        int binarySearchResult = Arrays.binarySearch(data, 1894);
        if(binarySearchResult>=0)
            System.out.printf("The %d value is in the index %d of the array data.%n", data[binarySearchResult], binarySearchResult);
else
            System.out.printf("The %d is not in the array data, the future position will be %d.%n",20, binarySearchResult );
        binarySearchResult = Arrays.binarySearch(data, 3097);
        if(binarySearchResult>=0)
            System.out.printf("The %d value is in the index %d of the array data.%n", data[binarySearchResult], binarySearchResult);
        else
            System.out.printf("The %d is not in the array data, the future index will be %d.%n",3097, -(binarySearchResult+1) );
    }

    public static void outputArrayUni_dimensional(int[] values, String message){
        System.out.printf("%n***** %s *****%n", message);
        System.out.printf("%6s-> %6s%n", "Index", "Value");
        int index = 0;
        for (int value: values)
            System.out.printf("%6d-> %-6d%n", index++, value);
        System.out.printf("***** PRINTING ENDED ******%n");
    }
}

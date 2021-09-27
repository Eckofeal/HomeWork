public class HomeWork {


    public static void main(String[] args) {
        int[] randArray = new int[10];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = randomInt(-100, 100);
        }

        System.out.println("Unsorted array:");
        printArray(randArray);

        quickSort(randArray, 0, randArray.length - 1);
        System.out.println("Quick sort result:");
        printArray(randArray);


    }

    public static void printArray(int[] array)
    {
        for(int element : array)
        {
        System.out.print(element+" ");
        }
        System.out.println("");
    }
    public static int randomInt(int from, int to)
    {
        int result = from + (int) (Math.random() * (to - from));
        return result;
    }

    public static void quickSort(int[] array, int low, int high)
    {

        if(array.length == 0) return;
        if(low >= high) return;

        int mid = low + ((high - low) / 2);
        int l = low;
        int h = high;

        while (l <= h)
        {
            while(array[l] < array[mid])
            {
                l++;
            }
            while(array[h] > array[mid])
            {
                h--;
            }

            if(l <= h)
            {
                int temp = array[l];
                array[l] = array[h];
                array[h] = temp;
                l++;
                h++;
            }
        }

        if(low < h) quickSort(array, low, h);
        if(high > l) quickSort(array, l, high);

    }


}

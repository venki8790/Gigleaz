  public static void sortArray(int[] array)
    {
        int temporary = 0;
 
        // Sort the array 'arr' elements in ascending order
        // using nested for loops
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }

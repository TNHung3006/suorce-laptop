class MaxAlgorithm {
    // Để ý cách duyệt các phần tử trong dãy
    public static void main(String[] args) {
        int[] array = {-20, 19, 1, 5, -1, 27, 19, 5};
        int max;
        // initialize the current maximum
        max = array[0];
        // scan the array
        for (int value : array) {
            if (value > max)    // examine the current element
                max = value;         // if it is the largest so far, change max
        }
        System.out.println("The maximum of this array is: " + max);
    }
}
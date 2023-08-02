import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        sort(new String[] {
                "max21",
                "an1on7",
                "jane123",
                "user456",
                "alpha22",
                "beta99",
                "gamma123",
                "test007"
        });
    }

    public static String[] sort(String[] list) {
        int n = list.length;
        boolean swapped;

        System.out.printf("Before bubble-sort: %s\n", Arrays.toString(list));

        do {
            swapped = false;

            for (int i = 0; i < n-1; i++)
            {
                if (list[i].compareTo(list[i + 1]) > 0)
                {
                    swapInArray(i, i + 1, list);
                    swapped = true;
                }
            }

        } while (swapped);

        System.out.printf("After bubble-sort:  %s", Arrays.toString(list));

        return list;
    }

    private static void swapInArray(int x, int y, String[] list) {
        String temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }
}
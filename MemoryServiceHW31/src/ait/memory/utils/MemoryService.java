package ait.memory.utils;

public class MemoryService {
    public static int getMaxAvailableMemory() {
        int begin = 0;
        int end = Integer.MAX_VALUE;
        int mid = 0;
        while (begin <= end) {
            mid = (end - begin) / 2 + begin;
            try {
                int[] arr = new int[mid];
                begin = mid + 1;
            } catch (OutOfMemoryError e) {
                end = mid - 1;
            }
        }
        return end;
    }
}

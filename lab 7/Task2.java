public class Task2 {

    
    static class MaxThread extends Thread {
        private int[] row;
        private int max = Integer.MIN_VALUE;

        public MaxThread(int[] row) {
            this.row = row;
        }

        @Override
        public void run() {
           
            for (int val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }

        public int getMax() {
            return max;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = {
            {15, 5, 92, 2},
            {12, 3, 27, 8},
            {4, 15, 6, 11},
            {-2, 20, 1, 0}
        };
        MaxThread[] threads = new MaxThread[matrix.length];

        
        for (int i = 0; i < matrix.length; i++) {
            threads[i] = new MaxThread(matrix[i]);
            threads[i].start();
        }

        int globalMax = Integer.MIN_VALUE;

        
        for (MaxThread thread : threads) {
            thread.join();
            if (thread.getMax() > globalMax) {
                globalMax = thread.getMax();
            }
        }

        System.out.println("Наибольший элемент в матрице: " + globalMax);
    }
}

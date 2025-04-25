class practical{
    String [][] input_data;
    String [][] sudoku_data;
    int size = 0;
    // String [][] input_data = new String[size][size];

    practical(String size){
        this.size = Integer.parseInt(size);
        this.input_data = new String[Integer.parseInt(size)][Integer.parseInt(size)];
        this.sudoku_data = new String[Integer.parseInt(size)][Integer.parseInt(size)];
    }

    void genrateLayout(String [] input){
        int index = 1;
        for(int row = 0; row < size; row++){
            for(int col=0; col < size; col++){
                input_data[row][col] = input[index++];
            }
        }
    }
   
    void gridView(String[][] input_data){
        for(int row = 0; row < size; row++){
            for(int col = 0; col<size; col++){
                System.out.print("|");
                System.out.print(input_data[row][col]!=null ? this.input_data[row][col] : " ");
                System.out.print("|");
            }
            System.out.println();
            if(row != size-1){
                for(int j = 0; j<size; j++){
                    System.out.print("---");
                }
            }
            System.out.println();
        }
    }

    void genrateSudoku(){
        
        // this code is not enough to give always difference in output, due to giving same boxes null multiple times.
        // for(int i = 0; i < 2 * sudoku_data.length; i++) {
        //     sudoku_data[(int)(System.nanoTime() % sudoku_data.length)][(int)(System.nanoTime() % sudoku_data.length)] = " ".repeat(Integer.toString(sudoku_data.length).length());
        // }

        java.util.Random rand = new java.util.Random();
        for(int i = 0; i < 2 * sudoku_data.length; i++) {
            int row = rand.nextInt(sudoku_data.length);
            int col = rand.nextInt(sudoku_data.length);
            sudoku_data[row][col] = " ".repeat(Integer.toString(sudoku_data.length).length());
        }

        gridView(sudoku_data);

    }

    //  void showLayout() {
    //     for (int row = 0; row < size; row++) {
    //         for (int col = 0; col < size; col++) {
    //             System.out.print(sudoku_data[row][col] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        practical p = new practical(args[0]);
        // p.input_data = new String[p.size][p.size];
        p.genrateLayout(args);
        // p.showLayout();
        System.out.println("Grid View As per Input Size :");
        p.gridView(p.input_data);
        System.out.println();
        System.out.println("Sudoku box :");
        p.genrateSudoku();

        // p.showLayout();

    }
}
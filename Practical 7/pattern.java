class pattern {

    static void name(int size) {
        for (int ln = 1; ln <= size; ln++) {
            // "O"
            for (int star = 1; star <= size; star++) {
                if (ln == 1 || ln == size) {
                    System.out.print("* ");
                } else {
                    if (star == 1 || star == size) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            // "M"
            for (int star = 1; star <= size + 1; star++) {
                if (star == 1 || star == size + 1) {
                    System.out.print("* ");
                } else if (ln == star || ln == size + 2 - star) {
                    if (ln <= size / 2 + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        name(8);
    }
}

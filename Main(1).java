public class Main {
    public static void main(String[] args) {
        //2*2矩阵测试
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setValue(0, 0, 1);
        matrix1.setValue(0, 1, 2);
        matrix1.setValue(1, 0, 3);
        matrix1.setValue(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setValue(0, 0, 5);
        matrix2.setValue(0, 1, 6);
        matrix2.setValue(1, 0, 7);
        matrix2.setValue(1, 1, 8);

        System.out.println("Matrix 1:");
        matrix1.print();

        System.out.println("Matrix 2:");
        matrix2.print();

        Matrix sum = matrix1.add(matrix2);
        System.out.println("Sum:");
        sum.print();

        Matrix minus = matrix1.minus(matrix2);
        System.out.println("Minus:");
        minus.print();

        Matrix multi = matrix1.multiple(matrix2);
        System.out.println("Multi:");
        multi.print();
    }
    }

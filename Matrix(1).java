public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }


    public void setValue(int row, int col, double value) {
        data[row][col] = value;
    }

    public double getValue(int row, int col) {
        return data[row][col];
    }

    // 相加
    public Matrix add(Matrix other){
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.setValue(i, j, this.getValue(i, j) + other.getValue(i, j));
            }
        }
        return result;
    }

    // 相减
    public Matrix minus(Matrix other) {
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.setValue(i, j, this.getValue(i, j) - other.getValue(i, j));
            }
        }
        return result;
    }

    // 相乘
    public Matrix multiple(Matrix other) {
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.setValue(i, j, result.getValue(i, j) + this.getValue(i, k) * other.getValue(k, j));
                }
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%.2f ", data[i][j]);
            }
            System.out.println();
        }
    }
}

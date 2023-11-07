package practic18_new;

public class Matrix<T extends Number>{
    public static void main(String[] args) {
        Integer[][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Matrix<Integer> m1 = new Matrix<>(matrix1);
        Double[][] matrix2 = {
                {1.0,2.0,3.0},
                {4.0,5.0,6.0},
                {7.0,8.0,9.0}
        };
        Matrix<Double> m2 = new Matrix<>(matrix2);
        Matrix.printMatrix(m1);
        Matrix.printMatrix(m2);
        m2 = Matrix.sum(m1,m2);
        Matrix.printMatrix(m2);
        m2 = Matrix.subtract(m1,m2);
        Matrix.printMatrix(m2);
    }
    public T[][] numbers;
    private int m;
    private int n;
    public Matrix(T[][] matrixValues){
        this.n = matrixValues.length;
        this.m = matrixValues[0].length;
        this.numbers = matrixValues;
    }
    public static Matrix sum(Matrix m1, Matrix m2){
        if(m1.getM()!=m2.getM()||m1.getN()!=m2.getM()){
            System.out.println("Can't plus matrix with different sizes");
        }else{
            int n = m1.getN(), m = m1.getM();
            Double[][] resultMatrix = new Double[n][m];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    double first = m1.numbers[i][j].doubleValue();
                    double second = m2.numbers[i][j].doubleValue();
                    double result = first + second;
                    resultMatrix[i][j] = result;
                }
            }return new Matrix(resultMatrix);
        }
        return null;
    }
    public static Matrix subtract(Matrix m1, Matrix m2){
        if(m1.getM()!=m2.getM()||m1.getN()!=m2.getM()){
            System.out.println("Can't plus subtract with different sizes");
        }else{
            int n = m1.getN(), m = m1.getM();
            Double[][] resultMatrix = new Double[n][m];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    double first = m1.numbers[i][j].doubleValue();
                    double second = m2.numbers[i][j].doubleValue();
                    double result = first - second;
                    resultMatrix[i][j] = result;
                }
            }return new Matrix(resultMatrix);
        }
        return null;
    }
    public static void printMatrix(Matrix matrix){
        for(int i = 0;i<matrix.numbers.length;i++){
            for(int j = 0;j<matrix.numbers[0].length;j++){
                System.out.print(matrix.numbers[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public int getN(){
        return this.n;
    }
    public int getM(){
        return this.m;
    }
}

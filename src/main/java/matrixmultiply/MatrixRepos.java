package matrixmultiply;

public class MatrixRepos {

    private double[][] matrix1;
    private double[][] matrix2;
    private double[][] resultmatrix;

    public MatrixRepos(double[][] matrix1, double[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.resultmatrix = new double[matrix1.length][matrix2[0].length];
    }

    public double[][] getMatrix1() {
        return matrix1;
    }

    public void setMatrix1(double[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public double[][] getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(double[][] matrix2) {
        this.matrix2 = matrix2;
    }

    public double[][] getResultmatrix() {
        return resultmatrix;
    }

    public void setResultmatrix(double[][] resultmatrix) {
        this.resultmatrix = resultmatrix;
    }
    
    public void setCellInResultmatrix(int row,int column,double value) {
        if(row < resultmatrix.length && column < resultmatrix[0].length){
            resultmatrix[row][column] = value;
        }
    }
    

}

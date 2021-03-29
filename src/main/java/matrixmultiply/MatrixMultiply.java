package matrixmultiply;


public class MatrixMultiply {
    
    public static double[][] multiply(double[][] matrix1,double[][] matrix2) throws InterruptedException{
        MatrixRepos repos = new MatrixRepos(matrix1,matrix2);
        if(matrix1.length >= matrix2[0].length){
            for(int j = 0;j < matrix2[0].length;j++){
                Thread tr = new Thread(new CompileColumnRunnable(repos,j));
                tr.start();
                tr.join();
            }
        }else{
            for(int i = 0;i < matrix1.length;i++){
                Thread tr = new Thread(new CompileRowRunnable(repos,i));
                tr.start();
                tr.join();
            }            
        }
        return repos.getResultmatrix();
    }
}

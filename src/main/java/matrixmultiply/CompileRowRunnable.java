
package matrixmultiply;


public class CompileRowRunnable implements Runnable{
    
    private MatrixRepos matrixRepos;
    private int inputI;
    
    public CompileRowRunnable(MatrixRepos matrixRepos,int inputI){
        this.matrixRepos = matrixRepos;
        this.inputI  =inputI;
    }

    @Override
    public void run() {
        compileRow(inputI);
    }
    
    private void compileRow(int i2){
        for(int j = 0;j < matrixRepos.getMatrix2()[0].length;j++){
            double valueCell = 0;
            for(int i = 0;i < matrixRepos.getMatrix2().length;i++){            
                valueCell += matrixRepos.getMatrix2()[i][j]*matrixRepos.getMatrix1()[i2][i];
            }
            matrixRepos.setCellInResultmatrix(i2, j, valueCell);
        }
    }
    
}

package matrixmultiply;


public class CompileColumnRunnable implements Runnable{
    
    private MatrixRepos matrixRepos;
    private int inputJ;
    
    public CompileColumnRunnable(MatrixRepos matrixRepos,int inputJ){
        this.matrixRepos = matrixRepos;
        this.inputJ  =inputJ;
    }

    @Override
    public void run() {
        compileColumn(inputJ);
    }
    
    private void compileColumn(int j2){
        for(int i = 0;i < matrixRepos.getMatrix1().length;i++){
            double valueCell = 0;
            for(int j = 0;j < matrixRepos.getMatrix1()[i].length;j++){            
                valueCell += matrixRepos.getMatrix1()[i][j]*matrixRepos.getMatrix2()[j][j2];
            }
            System.out.println("------------"+j2+"---------------");
            matrixRepos.setCellInResultmatrix(i, j2, valueCell);
        }
    }
    
}

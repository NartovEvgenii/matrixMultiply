package matrixmultiply;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MatrixMultiplyTest {
    
    @Test
    public void testOneRowMatrix() {
        System.out.println("test multiply");
        double[][] matrix1 = {
			{1,2,3}
		};
        double[][] matrix2 = {
			{4},
			{5},
			{6}
		};
        double[][] result;
        try {
            result = MatrixMultiply.multiply(matrix1, matrix2);
            for(int i=0;i<result.length;i++){
                for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+"  ");
                }
                System.out.println();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MatrixMultiplyTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void testThreeMatrix() {
        System.out.println("test multiply");
        double[][] matrix1 = {
			{3,6,6},
			{5,4,7},
			{9,9,9}
		};
        double[][] matrix2 = {
			{1,0,2},
			{2,1,1},
			{1,3,2}
		};
        double[][] result;
        try {
            result = MatrixMultiply.multiply(matrix1, matrix2);
            for(int i=0;i<result.length;i++){
                for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+"  ");
                }
                System.out.println();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MatrixMultiplyTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

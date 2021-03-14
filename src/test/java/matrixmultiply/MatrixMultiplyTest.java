package matrixmultiply;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MatrixMultiplyTest {
       
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
        double[][] trueResult = {
			{21.0,24.0,24.0},
			{20.0,25.0,28.0},
			{36.0,36.0,45.0}
		};
        double[][] result;
        try {
            result = MatrixMultiply.multiply(matrix1, matrix2);
            Assert.assertArrayEquals(trueResult, result);
        } catch (InterruptedException ex) {
            Logger.getLogger(MatrixMultiplyTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

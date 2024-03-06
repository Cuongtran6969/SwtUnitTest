/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package logic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class LogicMatrixTest {
    
    @Test
    public void testAdditionMatrix() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };
        int[][] expected = {
            {6, 8},
            {10, 12}
        };
        int[][] result = logicMatrix.additionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testSubtractionMatrix() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {5, 3},
            {7, 2}
        };
        int[][] matrix2 = {
            {2, 1},
            {1, 2}
        };
        int[][] expected = {
            {3, 2},
            {6, 0}
        };
        int[][] result = logicMatrix.subtractionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    @Test
    public void testMultiplicationMatrix() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };
        int[][] expected = {
            {19, 22},
            {43, 50}
        };
        int[][] result = logicMatrix.multiplicationMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
            
    @Test
    public void testAdditionMatrixErr() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {3, 4},
            {5, 6},
            {7, 8}
        };
        int[][] expected = {
            
        };
        int[][] result = logicMatrix.additionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testSubtractionMatrixErr() {
        LogicMatrix logicMatrix = new LogicMatrix();
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {3, 4},
            {5, 6},
            {7, 8}
        };
        int[][] expected = {
            
        };
        int[][] result = logicMatrix.subtractionMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMultiplicationMatrixErr() {
        LogicMatrix logicMatrix = new LogicMatrix();
        // Khởi tạo mảng ma trận thứ nhất
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {5, 6, 7},
            {8, 9, 10}
        };
        int[][] expected = {
           
        };
        int[][] result = logicMatrix.multiplicationMatrix(matrix1, matrix2);
        assertArrayEquals(expected, result);
    }
    
}

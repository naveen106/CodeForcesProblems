import java.util.*;
import java.io.*;

public class Tester {
    
    static PrintWriter out = new PrintWriter(System.out);
    public static void placeNQueens(int n){
        if(n<4)
            return;
        
        int[][] matrix = new int[n][n];
        
        
        //going to test for position of queen in first row, which means every possible desired outcome
        for(int j = 0; j<n; j++){
            int i = 0;
            fill(matrix,i,j,n);
            printValues(matrix);
            matrix = new int[n][n];
        }
        out.close();
        
    }
    
    static void printValues(int[][] matrix){
        
        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                out.print(matrix[i][j] + " ");
            }
        }
        out.println();
    }
    
    static  void fill(int[][]matrix, int r, int c, int n){
        
        HashSet<Integer> set = new HashSet<>();
        set.add(c);
        
        matrix[r][c] = 1;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(isSafe(matrix,i,j,n,set)){
                    set.add(j);
                    matrix[i][j] = 1;
                }
            }
        }
        
    }
    
    //(m,n) are the coordinate of the current position which is to be checked
    static boolean isSafe(int[][]matrix, int r, int c, int n, HashSet<Integer> set){
        
        int i = r, j = c;
        
        //for top and bottom (set has values of j which means index of the coloumn in the matrix which already has a queen)
        if(set.contains(j))
            return false;
        
        //for top-left direction
        
        
        for(; i>=0; i--){
            
            for(;j>=0;j--){
                if(matrix[i][j] == '1')
                    return false;
            }
        }
        
        i=r;j=c;
        
        //for top-right direction
        for(; i>=0; i--){
            for(;j<n;j++){
                if(matrix[i][j] == '1')
                    return false;
            }
        }
        
        i=r;j=c;
        //for bottom-left direction
        for(; i<n; i++){
            for(;j>=0;j--){
                if(matrix[i][j] == '1')
                    return false;
            }
        }
        
        i=r;j=c;
        //for bottom-right direction
        for(; i<n; i++){
            for(;j<n;j++){
                if(matrix[i][j] == '1')
                    return false;
            }
        }
        
        
        // for(; i>=0; i--){  //
        //     if(matrix[i][j] == '1')
        //     return false;
        // }
        return true;
    }
    
    
    
    
    public static void main(String[] args) {
        placeNQueens(4);
    }
}

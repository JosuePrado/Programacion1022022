
package Practice7;

import java.util.Scanner;

public class Matrix {
        public void Menu(){
        
        Scanner read = new Scanner(System.in);
        int opc;
        int[][] matrix1= new int[4][4];
        int row, col;
        do{
        System.out.println("""
                           Escoga una opcion
                           1.-LLenar la matriz
                           2.-Suma de una fila
                           3.-Suma de una columna
                           4 Suma de diagonal principal
                           5 Suma de diagonal inversa
                           6 Media de los valores de la matriz
                           0 salir""");
        opc=read.nextInt();
        
        if(opc== 1){
            System.out.println("Introduzca la matriz:");
            Matrix(matrix1,read);
              for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    System.out.print(matrix1[i][j]);
                }
                System.out.println("");
            }
            }
        else if(opc== 2){
                System.out.println("Ingrese la fila: ");
                row = read.nextInt();
                
                if(RowSum(row,matrix1) == 0){
                    System.out.println("primero debe rellenar la matriz");
                }
                else{
                    if(row > matrix1.length){
                        System.out.println("fila incorrecta intente denuevo");
                    }
                    else{
                        System.out.println("La suma es:");
                        System.out.println(RowSum(row,matrix1));
                    }
                }
                }
        else if(opc== 3){
                System.out.println("Ingrese la Columna: ");
                col = read.nextInt();
                if(ColSum(col,matrix1) == 0){
                    System.out.println("primero debe rellenar la matriz");
                }
                else{    
                    if(col > matrix1.length){
                        System.out.println("fila incorrecta intente denuevo");

                    }
                    else{
                        System.out.println("La suma es:");
                        System.out.println(ColSum(col,matrix1));                    
                    }
                }
        }
        else if(opc== 4){
                System.out.println("La suma es:");
                if(add_diagonal(matrix1) == 0){
                    System.out.println("primero debe rellenar la matriz");
                }
                else{                
                System.out.println(add_diagonal(matrix1));
                }
        }        
        else if(opc== 5){
                System.out.println("La suma es :");
                if(add_diagonalI(matrix1) == 0){
                    System.out.println("primero debe rellenar la matriz");
                }
                else{                 
                System.out.println(add_diagonalI(matrix1));
                }
        }
        else if(opc== 6){
                if(media(matrix1) == 0){
                    System.out.println("primero debe rellenar la matriz");
                }
                else{ 
                
                System.out.println("La media es :");
                System.out.println(media(matrix1));
                }
        }
        }while(opc!= 0);
        read.close();
        }
        
        
      public int[][] Matrix(int[][] matrix, Scanner read2){
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix.length; j++){
                    System.out.println("matrix ["+ i +"]["+ j +"]: ");
                    matrix[i][j] = read2.nextInt();
                }
            }

        return matrix;
      }         

        
     public int RowSum(int row,int[][]matrix){
        int result = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                 if(i == row){
                    result += matrix[i][j] ;
                 }
                 
                }
        }
                 
        return result ;
     }
     public int ColSum(int col, int[][]matrix){
        int result = 0;
        for(int j = 0; j < 4; j++){
                for(int i = 0; i < 4; i++){
                 if(i == col){
                    result += matrix[i][j] ;
                 }
                }
        }
                 
        return result ;
     }
     public static int add_diagonal(int[][] matrix){
        int result = 0; 
        for (int i = 0; i < matrix.length; i++){
            result += matrix[i][i]; 
        }
        return result;
    }
     public static int add_diagonalI(int[][] matrix){
        int result = 0; 
        for (int i = 0; i < matrix.length; i--){
            result += matrix[i+matrix.length][i+matrix.length]; 
        }
        return result;
    }
    public static int media(int[][] matrix){
        int result = 0,media = 0; 
        
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                media += matrix[i][j];
                result = media/(matrix.length*matrix.length); 
            }
        }    
        return result;
    }
        
}

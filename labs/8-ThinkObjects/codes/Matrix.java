package Lab8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author shohreh
 */
public class Matrix {
    
    // instance variables
    
      int m =4, n=4; 
      int[][] array = new int[m][n];
//       int[][] array2 = new int[m][n];
//      int[][] array3 = new int[m][n]; 
//       int[][] list = new int[m][n];    
       
  static int numberOfObjects=0;
       
     // Constructors  
       
       Matrix(){
       
       }
       
    // instance methods
       
       /** This method fills an array of two dimensional integers with random numbers u
     * up to given limit
     * @param array of two dimensional integers
     * @param limit - upper limit of random numbers generated
     */
    
    void fill (int[][] array, int limit){
    // first matrix
       System.out.println("First Matrix");
       for (int x=0; x<array.length;x++){
            for (int y=0; y<array[x].length;y++){
           array[x][y]= (int)(Math.random()*limit);
           System.out.print(array[x][y]+ "\t");
            }// end of for loop (y) 
            System.out.print( "\n" );
        }// end of for loop (x)    
    
    }//end of method fill
    
    int[][] add (int[][] array, int[][] array2){
   
       int m = array.length;
       int n = array[0].length;
       int[][] temp = new int[m][n]; 
       
   // addition of first and second matrix  
       System.out.println("Third Matrix -  Union of Matrix one and two"); 
       for (int x=0; x<array2.length;x++){
            for (int y=0; y<array2[x].length;y++){
           temp[x][y]= array[x][y]+array2[x][y];
           System.out.print(temp[x][y]+ "\t");
            }// end of for loop (y)
            System.out.print( "\n" );
        }// end of for loop (x) 
       return temp;
    
   }// end of add method
    
  void multiply(int[][] a){
   for (int x=1; x<=a.length;x++){
            for (int y=1; y<=a[x-1].length;y++){
                a[x-1][y-1]= x*y;
                System.out.print(a[x-1][y-1]+ "\t");
            }// end of for loop (y)
          System.out.print( "\n" );
        }// end of for loop (x)    
//       
   }// end of muliply method
   
 void upper (int[][] a){  
    for (int i=a.length-1; i>=0 ;i--){
            for (int j=i; j>=0;j--){
                
                //System.out.print("*"+ "\t");
                System.out.print(a[i][j]+ "\t");
            }// end of for loop (y)
          System.out.print( "\n" );
        }// end of for loop (x)    
     }// end of upper method
   
void lower (int[][] a){ 
for (int i=0; i<a.length ;i++){
            for (int j=0; j<=i;j++){
                System.out.print(a[i][j]+ "\t");
                //System.out.print("*"+ "\t");
            }// end of for loop (y)
          System.out.print( "\n" );
     }// end of for loop (x)    
 }// end of lower method      

 public String drawMatrix(){
     String temp =" "; 
     int i,j,size = 20;
      //int[][] array= new int[5][5];
      for ( i=0; i<size; i++){
        for (j=0; j<size; j++){
          
         temp +=  "* ";
      }
       temp +=  "\n ";
  }
      return temp; 
      
    }// end of draw Matrix
 
 public  int[][]  fillMatrix(){
    int[][] mylist = new int[4][3];
     int i,j;
      //int[][] array= new int[5][5];
      for ( i=0; i<mylist.length; i++){
        for (j=0; j<mylist[i].length; j++){
          
        mylist[i][j]= (int)(Math.random()*50);
      }
      }
      return mylist;     
  }
     
 public String drawMatrixNum(int[][] mylist){
     String temp =" "; 
     int i,j;
      for ( i=0; i<mylist.length; i++){
        for (j=0; j<mylist[i].length; j++){
          
         temp += " " + mylist[i][j]+"\t"; 
      }
       temp +=  "\n ";
  }
      return temp; 
      
    }// end of draw Matrix
            
       
    
}// end of class Matrix

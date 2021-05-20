class Practical_11{
    public static void main(String args[]){
    int[][] matrix = new int[6][6];
    System.out.println("here Randomaly generate matrix elements="); 
    int i,j;
    for(i=0 ; i<matrix.length ; i++ ){
       for(j=0 ; j<matrix.length ; j++){
          matrix[i][j] = (int)(Math.random() * 2);
          }
       }
    System.out.println("print our the randomaly generated matrix =");
    for(i=0 ; i<matrix.length ; i++ ){
       for(j=0 ; j<matrix.length ; j++){
          System.out.print(matrix[i][j] + " "); 
          }
       System.out.println();
       }

    for(i=0 ; i<matrix.length ; i++){
       int count=0;
       for(j=0 ; j<matrix.length ; j++){
          if(matrix[i][j] == 1){
             count++;
             }
          }
       if(count%2 != 0){
          System.out.println("odd number of one's in row : "+ (i+1));
          }
       }

    for(i=0 ; i<matrix.length ; i++){
       int count=0;
       for(j=0 ; j<matrix.length ; j++){
          if(matrix[j][i] == 1){
             count++;
             }
          }
          if(count%2 != 0){
             System.out.println("odd number of one's in column : "+ (i+1));
             }
       }
    }
 }
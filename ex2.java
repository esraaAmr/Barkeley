public class ex2 {
    public static void max(int[] m){
        int maximum = m[0];
        for(int i=0;i<m.length;i++){
            if(maximum < m[i]){
                maximum = m[i];
            }
        }
        System.out.println("The Maximum Number of the array is: "+ maximum);
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        max(numbers);   
     }
    
}

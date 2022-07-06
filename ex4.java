public class ex4 {
    public static void windowPosSum(int[] a,int n){
        try{
        for(int i=0;i<a.length;i++){
            if(a[i] <= 0){  // No negative Values
				continue;
			}
            for(int j=i+1;j<=i+n;i++){
                if(j>= a.length){
                    break;
                }
                a[i] = a[i] +a[j];
            }

        }
    }catch(Exception e){
        System.out.println("Error,Index 6 out of bounds for length 6");
    }
    }
    /**
     * @param args
     */
    public static void main(String[] args){
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a,n);
        System.out.println(java.util.Arrays.toString(a));
    }
}


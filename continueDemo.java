public class continueDemo {
    public static void main(String[] args) {
        String[] a = {"cat","dog", "laser horse", "ketchup", "horse", "horbse"};
        for(int i=0;i<a.length;i++){
            if(a[i].contains("dog")){
                continue;
            }
            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
            }
        }
    }
    
}

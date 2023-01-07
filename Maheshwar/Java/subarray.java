package Java;

public class subarray {
    public static void printSubarrays(int n[]){
        // int ts=0;
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                // ts++;
                for(int k=i;k<=j;k++){
                 System.out.print(n[k]+" ");
                 

                }

                System.out.println();
            }
            
            System.out.println();
        }
        // System.out.println(ts);
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6};
        printSubarrays(n);
    }
}

package Java;

public class reverse {
        public static void reverse(int numbers[]){
            int first=0,last=numbers.length-1;
            while(first<last){
                int temp=numbers[last];
                numbers[last]=numbers[first];
                numbers[first]=temp;
                first++;
                last--;
            }
        }
         public static void main(String[] args) {
                int numbers[]={4,6,8,5,9,7};
                reverse(numbers);
                for(int i=0;i<numbers.length;i++){
                    System.out.print(numbers[i]+" ");
                }
                System.out.println();
         }
}
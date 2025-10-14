package Day3;

public class code {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};

        int n=0;
        int m=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                n=n+1;                      
        } else{
            m=m+1;
        }
        
    }
    System.out.println("Even numbers are: "+n); 
    System.out.println("Odd numbers are: "+m); 
    
}
    
}

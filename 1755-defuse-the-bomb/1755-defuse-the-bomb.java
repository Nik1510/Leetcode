class Solution {
    public int[] decrypt(int[] code, int k) {
        // k>0 sum of next k number
        // k<0 sum of the pervious k number 
        // k==0 replace the number with 0

        int[] n = new int[code.length];
        if(k==0){
            for(int i =0; i<code.length;i++){
                n[i]=0;
            }
            return n;
        }
        if(k>0){
            for(int i =0; i<code.length;i++){
                n[i]=sum(code,i,k);
            }
            return n;
        }
        if(k<0){
            for(int i =0; i<code.length;i++){
            n[i]=sum2(code,i,k);
            }
         return n;
        }
        return n;
        
    }
    private int sum(int[] arr, int start, int k){
        int i = start+1;
        int c=0;
        int sum=0;
        while(c<k){
            sum+= arr[i%arr.length];
            c++;
            i++;
        }
        return sum;
    }
    static int sum2 (int[] arr, int start, int k){
        // i will start form start-1
        int i;
        if(start==0){
             i = arr.length-1;
        }else{
             i = start-1;
        }

        int c=0;
        int sum=0;
        k=k*-1;
        while(c<k){
            if(i<0){
                i=(arr.length-1);
            }
            sum+= arr[i%arr.length];
            c++;
            i--;
        }
        return sum;
    }
}
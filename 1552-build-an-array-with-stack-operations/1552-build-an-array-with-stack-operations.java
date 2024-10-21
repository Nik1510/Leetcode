class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> arr = new ArrayList<>();
        int toMake=1;
        int i =0;

        while(i<target.length && toMake <=n){
            if(toMake == target[i]){
                arr.add("Push");
                i++;
            }else{
                arr.add("Push");
                arr.add("Pop");
            }
            toMake++;
        }
        return arr;
    }
}
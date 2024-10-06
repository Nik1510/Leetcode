class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i =1; i<height.length;i++){
            if(height[i-1]>threshold){
                arr.add(i);
            }
        }
        return arr;
    }
}
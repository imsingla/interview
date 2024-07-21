public class MyClass {
    public static void main(String args[]) {
    }
    
    public static class Pair {
        int x;
        int y;
        
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public Integer getX(){
            return this.x;
        }
        
        public Integer getY(){
            return this.y;
        }
    }
    
    // Time Complexity = O (n * 2)
    // Space Complexity = O ( n )
    
    public static Integer minCost(final Pair[] input){
        int totalCost = 0;
        
        final Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < input.size(); i++){
            Pair first = input[i];
            int end = -1;
            int min = Integer.MAX_VALUE;
            for(int j = 0; i< input){
                
                if (i == j || map.getOrDefault(j, -1) == i){
                    continue;
                }
                
                Pair second = input[i];
                int temp = Math.abs(second.getX() - first.getX()) + Math.abs(second.getY() - first.getY());
                if(temp < min){
                    min = temp;
                    end = j;
                }
            }
            
            map.put(i, end);
            totalCost += min;
        }
        
        return totalCost;
    }
}

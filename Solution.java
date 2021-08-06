public class Solution {
        public static int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int count = 0;
            int size = nums.length ;
            for( int i = 0; i< size; i++){
                if(nums[i] == 1){
                    count ++;
                    max = Math.max(count, max);
                }else{
                    count = 0;
                }

            }
            return max;


        }
        public static void main(String arg[]){
            System.out.println("Solution");
            int[] values = new int[]{0, 1, 1, 0, 1, 1, 1};
            System.out.print("{ ");
            for (int i = 0; i< values.length; i++){
                System.out.print(values[i]);
                System.out.print(", ");
            }
            System.out.println("}");
            int max = findMaxConsecutiveOnes(values);
            System.out.println(max);
        }
    }


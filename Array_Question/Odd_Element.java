package Array_Question;

import java.util.HashMap;
import java.util.Map;

public class Odd_Element {
    
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5,6,6};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i =0 ;i<arr.length;i++){
            if(map.get(arr[i]) == null){
                count=1;
                map.put(arr[i],count);
            }
            else{
                map.put(arr[i],++count);
            }
        }

        System.out.println(map);
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() % 2 != 0){
                System.out.println("Odd element is : " + e.getKey());
            }
        }
                                    

    }

}

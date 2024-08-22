class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        Map<Character, Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        while(!map.isEmpty()){
            int max=0;
            char maxchar='a';
            for(Map.Entry<Character,Integer> e:map.entrySet()){
                if(e.getValue()>max){
                    maxchar=e.getKey();
                    max=e.getValue();
                }
            }
            for(int i=0;i<max;i++){
                sb.append(maxchar);
            }
            map.remove(maxchar);
           
        }
        return sb.toString();
    }
}
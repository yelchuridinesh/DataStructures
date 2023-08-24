class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> ans = new HashSet<>(); // as the question says avoid duplicates I took hashset
        int index=0;
        List<Integer>list= new ArrayList<>();
        combinationSum2(index, target, candidates, ans, list);
      //This logic is to convert HashSet to List as I need to return List<List<Integer>>
        List<List<Integer>> CombinationSum = new ArrayList<>(ans);
        return CombinationSum;
    }

    public void combinationSum2(int index, int target, int[]candidates, HashSet<List<Integer>> ans, List<Integer>list){
        if(index>=candidates.length){
            if(target==0){
                List<Integer> temp = new ArrayList<Integer>(list);
              //Sorting the list before adding because let's say my logic gives me 1,2,5 and 2,5,1 which sums upto 8 in my case as 
              //duplicates are not allowed I am sorting it so that hashset doesnt takes duplicates
                Collections.sort(temp);
                ans.add(temp);
            }
            return;
        }
            if(candidates[index]<=target){
                list.add(candidates[index]); // adding to the list
                combinationSum2(index+1, target-candidates[index], candidates, ans, list); // recursion
                list.remove(list.size()-1);// not adding to the list
            }
            combinationSum2(index+1, target, candidates, ans, list); // recursion 
    }
}

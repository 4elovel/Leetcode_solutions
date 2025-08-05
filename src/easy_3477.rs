impl Solution {
    pub fn num_of_unplaced_fruits(fruits: Vec<i32>, baskets: Vec<i32>) -> i32 {
        let mut b = baskets.clone();
        let mut num =0;
        'a:for i in (0..fruits.len()){
            for j in (0..b.len()){
                if(fruits[i]<=b[j]){
                    b.remove(j);
                    continue 'a;
                }
            }
            num+=1;
        }
        num
    }
}
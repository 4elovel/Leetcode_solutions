impl Solution {
    pub fn is_power_of_two(n: i32) -> bool {
        n.count_ones()==1 && n>0
    }
}
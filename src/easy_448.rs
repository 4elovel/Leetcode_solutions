impl Solution {
pub fn find_disappeared_numbers(nums: Vec<i32>) -> Vec<i32> {
    let mut nums = nums.clone();
    nums.sort();
    let n = nums.len();
    let mut result = Vec::new();
    let mut expected = 1;
    let mut i = 0;

    while expected <= n as i32 {
        if i < nums.len() && nums[i] == expected {
            let current = nums[i];
            while i < nums.len() && nums[i] == current { i += 1; }
            expected += 1;
        } else if i < nums.len() && nums[i] < expected {
            i += 1;
        } else {
            result.push(expected);
            expected += 1;
        }
    }
    result
}
}
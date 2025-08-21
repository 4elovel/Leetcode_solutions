impl Solution {
    pub fn str_str(haystack: String, needle: String) -> i32 {
        haystack.find(&needle).unwrap_or_else(|| {
            return -(1i32) as usize;
        }) as i32
    }
}
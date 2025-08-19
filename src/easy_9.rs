impl Solution {
    pub fn is_palindrome(x: i32) -> bool {
        if x < 0 {return false;}
        if x < 10 {return true;}
        let mut len :i32 = 1;
        let mut buf:i32 = x;
        while buf>9{
            buf = buf/10;
            len+=1;
        }
        println!("len {}",len);
        let mut buff:i32= len/2;
        for i in 0..buff{
            let mut right:i32 =x/(10_i32.pow(i as u32)); 
            right = right%(10_i32.pow((1) as u32 ));

            let mut left:i32 = x/10_i32.pow((len-1-i)as u32);
            if (left>9) {left = left%(10_i32.pow(1 as u32))};
            println!("left {}",left);
            println!("right {}",right);
            if left==right {continue;}
            return false;

        }
        return true;


    }
}
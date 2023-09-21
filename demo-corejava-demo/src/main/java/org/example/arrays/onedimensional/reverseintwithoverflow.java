package practice;

public class reverseintwithoverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int num=1111111119;

		Integer num2 = 1111111119;

		Integer num3 = 191234;

		int n = -234;
		System.out.println(reverse(num2));

	}

	public static int reverse2(int x) {
		// flag marks if x is negative
		boolean flag = false;
		if (x < 0) {
			x = 0 - x;
			flag = true;
		}
		int reverse = 0;
		int num = x;
		while (num > 0) {
			int mod = num % 10;
			num = num / 10;
			reverse = reverse * 10 + mod;
		}
		if (flag) {
			reverse = 0 - reverse;
		}
		return reverse;
	}

	public static int reverse(Integer num) {

		int mod = 0;
		Integer reverse = 0;
		Integer sendNum = 0;

		try {
			while (num > 0) {
				mod = num % 10;
				reverse = reverse * 10 + mod;
				num = num / 10;

			}

            if(reverse>(Integer.MAX_VALUE/10))
            {
            	return -1;
            }

		} catch (Exception ex) {
			reverse = -1;
			ex.printStackTrace();
		}

		return reverse;
	}
    int reverse(int x) {
        int rev = 0;
         int top_limit = Integer.MAX_VALUE/10;
         int bottom_limit = Integer.MIN_VALUE/10;
        while (x>0) {
            if (rev > top_limit || rev < bottom_limit)
                return 0;
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }
};

}

package spring.test.ch01.ex02;

import java.util.List;

public class Nums {
	private List<Integer> nums;
	
	public Nums(List<Integer> nums){
		this.nums = nums;
	}
	
	public int getGreatest(){
		int max = Integer.MIN_VALUE;
		
		if(nums.size() != 0){
			for(int i:nums)
				if(i>max) max=i;
		}else{
			throw new RuntimeException("숫자값이 없습니다.");
		}
		return max;
	}
}

package capgemini.interfaces;

import java.util.Arrays;

interface ArraySort {
	void sortAsc();

	void sortDes();
}

class ArraySortImpl implements ArraySort {
	int[] nums;

	// constructor
	public ArraySortImpl(int[] nums) {
		this.nums = nums;
	}

	@Override

	public void sortAsc() {
		for (int j = 0; j < nums.length - 1; j++) {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] > nums[i + 1]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
		}
	}

	@Override
	public void sortDes() {
		for (int j = 0; j < nums.length - 1; j++) {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] < nums[i + 1]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
		}
	}

	// own method of ArraySortImpl
	public void print() {
		System.out.println(Arrays.toString(nums));
	}
}

public class ArraySortImpl_Test {

	public static void main(String[] args) {
		int[] nos = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArraySortImpl a = new ArraySortImpl(nos);
		a.sortAsc();
		a.print();
		a.sortDes();
		a.print();
	}
}

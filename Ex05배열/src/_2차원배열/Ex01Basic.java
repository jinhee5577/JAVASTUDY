package _2차원배열;

public class Ex01Basic {

	public static void main(String[] args) {
		// int[] 변수명 = new int[크기];
		
		int[][] array = new int[3][3];		
		int[][] array2 = {{1,2,3},{1,2},{6,7},{1,7,3,4,6,8,9}};	// 이것도 가능.
		
		System.out.println(array2[0][0]); // 1
		System.out.println(array2[3][2]); // 
		System.out.println(array2[2][0]); // 
		System.out.println(array2[2]); // 주소가 나옴.
		
		
		
		
	}

}

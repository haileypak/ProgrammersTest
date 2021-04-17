package sort;

import java.util.Arrays;

/**
 --------------파일명정렬 -------------- 내장함수 없이 문제 풀이 연습
 */
public class 파일명정렬2 {

	public static void main(String[] args) {
	//	String[] files = {"img12.png",  "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] files2 = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		
		파일명정렬2_Solution s = new 파일명정렬2_Solution();
		System.out.println(Arrays.toString(s.solution(files2)));
	}

}

class 파일명정렬2_Solution {
	public String[] solution(String[] files) {
		
		for (int i = 0; i < files.length; i++) {
			for (int j = i+1; j < files.length; j++) {
				
				int result = getHead(files[i]).compareToIgnoreCase(getHead(files[j]));
				
				if ( result == 0 ) {
					result = getNumber(files[i]) - getNumber(files[j]);
				}
				
				if ( result > 0 ) {
					String tmp = files[i];
					files[i] = files[j];
					files[j] = tmp;
				} 
			}
		}

		return files;
	}
	
	private String getHead(String file) {
		int n = 0;

		while (true) {
			if (Character.isDigit(file.charAt(n)))		//파일명의 앞글자부터 한글자씩 숫자인지 판단
				break;										
			else 
				n++;									//숫자가 아니면 인덱스 늘려줌
		}
		
		return file.substring(0, n);					//첫인덱스부터 숫자인덱스까지 자름
	}

	
	private int getNumber(String file) {
		file = file.replace(getHead(file), "");			//헤드 부분 없앰
		String number = "";
		for (int i = 0; i < file.length(); i++) {
			if (Character.isDigit(file.charAt(i)) && number.length() < 5) {
				number += file.charAt(i);
			} else {
				break;
			}
		}
		
		return Integer.parseInt(number);
	}
	
}

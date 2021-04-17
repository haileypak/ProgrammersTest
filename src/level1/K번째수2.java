package sort;

/*
 --------------K번째 수 -------------- 내장함수 없이 문제 풀이 연습
*/

public class K번째수2 {	

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = { {2,5,3}, {4,4,1}, {1,7,3} };

		K번째수2_Solution s = new K번째수2_Solution();
		int[] answer = s.solution(array, commands);


		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
			if(i!=answer.length-1)
				System.out.print(",");
		}
	}
}

class K번째수2_Solution {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];				//commands의 길이로 배열 초기화

		for (int i = 0; i < commands.length; i++) {		

			int[] command = commands[i];						//계산에 사용될 command배열 저장

			int[] temp = new int[command[1]-command[0]+1];		//자를 수를 가지고 임시배열 생성

			for (int j = 0; j < temp.length; j++) {
				temp[j] = array[command[0]-1+j];		//index는 0부터 시작이라 -1을하고 시작점에서 한칸씩 다음인덱스로 진행해야하므로 +j를 해줌
			}

			sort(temp);

			answer[i] = temp[command[2]-1]; 		//정렬된 배열에서 값 찾아서 answer에 담음
		}

		return answer;
	}

	private void sort(int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			for (int j = i+1; j < temp.length; j++) {
				if ( temp[i] > temp[j] ) {			//앞에 숫자가 더 크면 자리바꿈 
					int n = temp[i];
					temp[i] = temp[j];
					temp[j] = n;
				} else {
					continue;
				}
			}
		}

	}


}

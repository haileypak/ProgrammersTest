package level1;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 -------------- 같은 숫자는 싫어 --------------
 문제 설명
    배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
    이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
    단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
    arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
    arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.

    배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

 제한사항
    배열 arr의 크기 : 1,000,000 이하의 자연수
    배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

 입출력 예
    arr	                answer
    [1,1,3,3,0,1,1]	    [1,3,0,1]
    [4,4,4,3,3]	        [4,3]

 * **/
public class 같은숫자는싫어 {
    public static void main(String[] args) {
      //  int[] input = {1, 1, 3, 3, 0, 1, 1};
        int[] input = {4, 4, 4, 3, 3};

        같은숫자는싫어_Solution s = new 같은숫자는싫어_Solution();
        int[] result = s.solution(input);
        System.out.println(Arrays.toString(result));

    }
}

class 같은숫자는싫어_Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();

        temp.add(arr[0]);       //첫번째 숫자는 무조건 담기

        for (int i=1; i<arr.length; i++) {
            if ( temp.get(temp.size()-1) != arr[i] ) {    //리스트의 마지막 숫자와 현재 값이 같지 않으면 담기
                temp.add(arr[i]);
            }
        }
        answer = new int[temp.size()];
        for (int i=0; i<temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
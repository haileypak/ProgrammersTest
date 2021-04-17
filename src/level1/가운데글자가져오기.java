package level1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 -------------- 가운데 글자 가져오기 --------------
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    제한 조건
    s는 길이가 1 이상, 100이하인 스트링입니다.

    입출력 예
     s	        return
    "abcde"	    "c"
    "qwer"	    "we"
 **/
public class 가운데글자가져오기 {
    public static void main(String[] args) {
        String input = "qwer";

        가운데글자가져오기_Solution s = new 가운데글자가져오기_Solution();
        String result = s.solution(input);

        System.out.println(result);
    }
}

class 가운데글자가져오기_Solution {
    public String solution(String s) {
        String answer = "";

        if ( s.length()%2 == 1) {   //길이가 홀수면
            answer = s.substring(s.length()/2, s.length()/2+1);
        } else {    //짝수면
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }

       // answer = s.substring( (s.length()-1)/2, s.length()/2+1 ); //한줄코드
        return answer;
    }
}
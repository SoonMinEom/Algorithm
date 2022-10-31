package onclass.t221031;

public class prepareTest {

    public int[] solution(int[] answers) {
        int[] answer = {};

//        1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//        2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//        3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};

        int firstStudentAnswerCnt = 0;
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i%5]) {
                firstStudentAnswerCnt++;
            }
        }

        System.out.println(firstStudentAnswerCnt);
        return answer;
    }

    public static void main(String[] args) {
        prepareTest pt = new prepareTest();
        int[] answers = {1,2,3,4,5};
        pt.solution(answers);
    }
}

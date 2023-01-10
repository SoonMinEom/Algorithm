package programers.level_0.part2;
// https://school.programmers.co.kr/learn/courses/30/lessons/120894

public class 영어가싫어요 {
    public long solution(String numbers) {
        numbers = numbers.replaceAll("one","1");
        numbers = numbers.replaceAll("two","2");
        numbers = numbers.replaceAll("three","3");
        numbers =  numbers.replaceAll("four","4");
        numbers = numbers.replaceAll("five","5");
        numbers = numbers.replaceAll("six","6");
        numbers = numbers.replaceAll("seven","7");
        numbers = numbers.replaceAll("eight","8");
        numbers = numbers.replaceAll("nine","9");
        numbers = numbers.replaceAll("zero","0");
        long answer = Long.valueOf(numbers);
        return answer;
    }

    public static void main(String[] args) {
        영어가싫어요 x = new 영어가싫어요();
        System.out.println(x.solution("oneonetwo"));
    }
}

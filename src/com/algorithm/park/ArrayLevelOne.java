package com.algorithm.park;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayLevelOne {

    public void minMax(String param) {
        String[] numList = param.split(" ");
        TreeSet<String> numTree = new TreeSet();
        for (String num : numList) {
            numTree.add(num);
        }

        System.out.println(numTree.last() + " " + numTree.first());
    }

    public void maxAndNum(String param) {
        String[] numList = param.split(" ");
        int maxNum = 0;
        int targetNum = 0;
        for (int index = 0; index < numList.length; index++) {
            if (targetNum < Integer.parseInt(numList[index])) {
                targetNum = Integer.parseInt(numList[index]);
                maxNum = index;
            }
        }
        System.out.println((maxNum + 1) + " " + targetNum);
    }

    public void findUseNum(String param) {
        String[] numList = param.split(" ");
        int calcNum = 1;
        for (int index = 0; index < numList.length; index++) {
            calcNum *= Integer.parseInt(numList[index]);
        }

        String findNum = String.valueOf(calcNum);
        int index = 0;
        int targetIndex = findNum.length();
        while (findNum.length() > 0) {
            findNum = findNum.replaceAll(String.valueOf(index), "");
            if (targetIndex > findNum.length())
                System.out.println(index + " = " + (targetIndex - findNum.length()));
            targetIndex = findNum.length();
            index++;
        }
    }

    public void restNumCount(String param) {
        String[] numList = param.split(" ");

        Set<Integer> restList = new TreeSet<>();

        for (int index = 0; index < numList.length; index++) {
            int rest = Integer.parseInt(numList[index]) % 42;
            restList.add(rest);
        }
        System.out.println(restList.size());
    }

    public void fakeAverage(String param) {
        String[] scoreArray = param.split(" ");

        int maxScore = 0;
        float sum = 0;
        for (String score : scoreArray) {

            if (maxScore < Integer.parseInt(score)) {
                maxScore = Integer.parseInt(score);
            }
            sum += Integer.parseInt(score);
        }

        System.out.println(((sum/maxScore)*100)/scoreArray.length);

    }

    public void scoreOX(String param) {
        String[] answerArray = param.split("");

        int score=0;
        int sum=0;
        for(String answer : answerArray){
            if("O".equals(answer)){
                score++;
            }else{
                score=0;
            }
            sum+=score;
        }

        System.out.println(sum);
    }

    public void hightAverage(String param) {
        String[] scoreArray = param.split(" ");
        List<Integer> scoreList = new ArrayList<>();

        int sum=0;
        float average=0;

        for (String score:scoreArray){
            sum+=Integer.parseInt(score);
            scoreList.add(Integer.parseInt(score));
        }
        average=sum/scoreList.size();

        float highScoreCount = 0;

        for (Integer score:scoreList){
            if(score>average) highScoreCount++;
        }
        System.out.println(String.format("%,.3f", (highScoreCount/scoreList.size())*100));
    }
}

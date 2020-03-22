package com.hacker;

import javafx.scene.control.skin.SliderSkin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;



public class Test {

//   static  void print(){
//       System.out.println("in class test");
//   }


//    public static void main(String[] args) throws IOException, InterruptedException {
//        int[] i = {1,2,3,45};
//       String string = "curl -X GET -H \"X-TrackerToken: edf13663e41148390888d60c11d4d5ab\" \"https://www.pivotaltracker.com/services/v5/projects/2197332/stories\"";
//       List<String> split= Arrays.asList(string.split(" "));
//        ProcessBuilder builder = new ProcessBuilder(split);
//        Process process = builder.start();
//        process.waitFor(7, TimeUnit.SECONDS);
//        BufferedReader reader =
//                new BufferedReader(new InputStreamReader(process.getInputStream()));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
//        System.out.println(split);
//
//    }

    public int[] twoSum(int[] nums, int target) {
        boolean flag = true;
        int[] result = new int[2];
        int check=0;
        for(int i=0; i< nums.length; i++){
            check = target- nums[i];
            for(int j=i+1; i<nums.length; j++){
                if(check==nums[j]) {
                    flag = false;
                    result[1]=j;
                    break;
                }
            }
            if(!flag){
                result[0]= i;
                break;}
        }

        return result;

    }

    public static void main(String[] args) {
int a[] ={6,4,5,0,11};
Test test = new Test();

        int result[] = test.twoSum(a,11);
        Arrays.stream(result).forEach(x -> System.out.println(x));

    }

    private static void print(int[] a) {
        a[0]=4;
    }
}

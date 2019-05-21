package problem_solving;

import java.util.Arrays;
 
public class Programmers42578 {
	
	
    public static void main(String[] ar){
        Programmers42578 ex = new Programmers42578();
        int[] arr = { 1, 2, 3, 4 }; 
        int n = arr.length;
        int r = 3; 
        int[] combArr = new int[n];
        
        ex.doCombination(combArr, n, r, 0, 0, arr);
        System.out.println(num);
    }
    
    
    
    static int num = 0;
    public int solution(String[][] clothes) {
        int answer = 0;
        return answer;
    }
    
    public void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr){
         
        if(r == 0){
            num++;
        }else if(target == n){ 
            return ;
        }else{
            combArr[index] = target;
            doCombination(combArr, n, r-1, index+1, target+1, arr);
            doCombination(combArr, n, r, index, target+1, arr); 
        }
    }
}
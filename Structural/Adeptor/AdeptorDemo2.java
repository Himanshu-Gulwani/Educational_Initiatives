import java.util.*;

interface MathsProcessing{
    public void performMathOperation(String type,int[] arr,int key,int value);
}

class ArrayToList{
    public  List<Integer> ConvertArrayToList(int[] arr){
        List<Integer> ls = new ArrayList<Integer>();
        for(int i:arr){
            ls.add(i);
        }
        return ls;
    }
}

class BasicMathsProcessing implements MathsProcessing{
    AdvancedMathsProcessing amp = new AdvancedMathsProcessing();
    ArrayToList atl = new ArrayToList();
    List<Integer> ls = new ArrayList<Integer>();
     public void performMathOperation(String type,int[] arr,int key,int value) {
        ls= atl.ConvertArrayToList(arr);

        if(type=="+"){
            amp.addition(arr);
        }
        else if(type=="*"){
            amp.multiply(arr);
        }
        else if(type.equalsIgnoreCase("Sort")){
            amp.sort(ls);
        }
        else if(type.equalsIgnoreCase("Avg")){
            amp.average(ls);
        }

        else if(type.equalsIgnoreCase("Search")){
            amp.SearchData(ls, key);
        }
        else if(type.equalsIgnoreCase("Replace")){
            amp.replace(ls, key, value);
        }
        
    }
}

class AdvancedMathsProcessing{
    float result;
    ArrayToList AL1 = new ArrayToList();
    // List<Integer> ls = new ArrayList<Integer>();
    
    // Iterator itr = ls.iterator();

    public void addition(int[] arr){
        result = 0;
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        System.out.println("Sum of array element is : " + (int)result);
    }

    public void multiply(int[] arr){
        result = 1;
        for(int i=0;i<arr.length;i++){
            result*=arr[i];
        }
        System.out.println("Product of array element is : " + (int)result);
    }

    public void average(List<Integer> ls){
        result = 0;
        for(int i=0;i<ls.size();i++){
            result+=ls.get(i);
        }
        result = (Float) result/(ls.size());
        System.out.println("Average of array element is : " + result);
    }

    public void sort(List<Integer> ls){
        System.out.println("Before : ");
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i) + " ");
        } 

        Collections.sort(ls); 
        System.out.println();
        System.out.println("After");     
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i) + " ");
        } 
        
    }

    public void SearchData(List<Integer> ls,int key){
        if(ls.contains(key)){
            System.out.println("Number " + key +" is present");
        }
        else{
            System.out.println("Number " + key +" is present");
        }
    }

    public void replace(List<Integer> ls,int key,int value){
        System.out.println("Before:");
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i) + " ");
        } 
        ls.set(key, value);
        System.out.println();
        System.out.println("After:");
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i) + " ");
        } 
    }
}

public class AdeptorDemo2 {
    public static void main(String[] args) {
        MathsProcessing mp = new BasicMathsProcessing();
        int[] arr = {5,4,3,2,1};
        
        mp.performMathOperation("sort", arr, 2, 63);
    }
}

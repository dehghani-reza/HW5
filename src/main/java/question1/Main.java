package question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner strScanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);//0
        arrayList.add(2);//1
        arrayList.add(3);//2
        arrayList.add(4);//3
        arrayList.add(5);//4
        arrayList.add(4);//5
        arrayList.add(25);

        System.out.println(ordering(arrayList));



    }//end of method main


    static ArrayList ordering (ArrayList<Integer> arrayList){
        ArrayList<Integer> index = new ArrayList<Integer>();
        //if its odd we omit the last index
        if(arrayList.size()%2!=0){
            arrayList.remove(arrayList.size()-1);
        }

        for(int i=0 ; i<arrayList.size()/2;i++){
           if(arrayList.get(2*i)<arrayList.get(2*i+1)){
              index.add(arrayList.get(2*i));
              index.add(arrayList.get(2*i+1));
           }
        }


        return index;
    }



}
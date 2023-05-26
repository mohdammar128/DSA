package ArrayList;

import java.util.*;
public class arrlist1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ls=new ArrayList<>();//this arraylist will store array list
        ArrayList<Integer>ls2=new ArrayList<>();
        ls2.add(1);
        ls2.add(2);
        ls2.add(3);
        ls.add(ls2);
        //print
        System.out.println(ls);
        for(int i=0;i<ls.size();i++){
            ArrayList<Integer> curr=ls.get(i);
            for(int j=0;j<curr.size();j++){
             System.out.println(curr.get(j));
            }
        }
    }
}

//activity selection problem
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

public class greedy1 {
   public static void main(String[] args) {
    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};//sorted hai , ager nhi hoga toh pahley sort karengey end time

//activity ager sorted na dii ho 
int activity[][]=new int[end.length][3];
for(int i=0;i<end.length;i++){
    
        activity[i][0]=i;
        activity[i][1]=start[i];
        activity[i][2]=end[i];
  
}
//lamda function => shortform----------,,,(comparator is interface)
Arrays.sort(activity,Comparator.comparing(o->o[2]));//mainey bataya hai kii sorting column number 2 sey kerna hai
    int maxAct=0;
    ArrayList<Integer> act=new ArrayList<>();
    maxAct=1;
    act.add(activity[0][0]);
    int lastEnd=activity[0][2];
    for(int i=1;i<end.length;i++){
        if(lastEnd<=activity[i][1]){
            act.add(activity[i][0]);
            lastEnd=activity[i][2];
            maxAct++;
        }
    }
    System.out.println("Max Acitivity that we can do : "+ maxAct);
    for(int val:act){
        System.out.print("A"+val+" ");
    }
   } 
}

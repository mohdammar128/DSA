import java.util.*;

public class greedy6 {
    static class Jobs {
        int deadline;
        int profit;
        int id;

        Jobs(int deadline, int profit, int id) {
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer jobInfo[][] = new Integer[4][2];
        for (int i = 0; i < jobInfo.length; i++) {
            jobInfo[i][0] = sc.nextInt();// dead line
            jobInfo[i][1] = sc.nextInt();// profit
        }
        /*
         * Create the ArrayList of jobs storing the data of each jobs (basically we have
         * created objects)
         */
        ArrayList<Jobs> jobs = new ArrayList<>();
        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Jobs(jobInfo[i][0], jobInfo[i][1], i));
        }
        // sort the jobs according to maximum profit ,(descending order of profit)
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        int time = 0;/*
                      * it will keep track of deadline of each job ,we can consider the jobs when
                      * deadline will be greater than this time
                      */
        int totalProfit = 0;

        ArrayList<Integer> ans = new ArrayList<>(); // track job id


        for (int i = 0; i < jobInfo.length; i++) {
            Jobs currJob = jobs.get(i);
            if (currJob.deadline > time) {
                ans.add(i);
                totalProfit += currJob.profit;
                time++;
            }
        } 
        System.out.println(totalProfit + "  "+ ans);

        /*
         * new thing to learn
         * lamda function for custom comparator
         * (obj1,obj2)-> obj1.profit-obj2.profit //for ascending order
         */
        sc.close();

    }
}

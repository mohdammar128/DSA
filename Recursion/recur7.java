
//friend pairing problem
public class recur7 {
    
    public static int FriendPairing(int n){
    if(n==1 ||n==2){
        return n;
    }
    //kaam ,single rahney kii choice
    int single=FriendPairing(n-1);
    int pair=n-1*FriendPairing(n-2);
    return single+pair;
    }

    public static void main(String[] args) {
        int res=FriendPairing(3);
        System.out.println(res);
    }
}

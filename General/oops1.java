package General;

public class oops1{
    public static void main(String[] args) {
        // Pen p1=new Pen();//create p1 object
        

    }
}
class Pen{
   private String color;
   private int tip;
    Pen(){
        color="blue";
        tip=5;
    }
    //getters function
    String getColor(){
        return this.color;
    }
    int  getTip(){
    return this.tip;
    }
  // setter function
    void setTip(int newTip){
    this.tip=newTip;
    }
    void setColor(String newColor){
        this.color= newColor;
    }
}

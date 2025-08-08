
class getset{
    
    private String name,dept;
    private int roll;

    getset(String name,int roll,String dept){
        this.name=name;
        this.roll=roll;
        this.dept=dept;
    }

    public String getName(){
        return name;
    }

    public int getRoll(){
        return roll;
    }

    public String getDept(){
        return dept;
    }

    // public void setName(String name){
    //     this.name=name;
    // }
    // public void setRoll(int roll){
    //     this.roll=roll;
    // }
    // public void setDept(String dept){
    //     this.dept=dept;
    // }

}
public class encpsulation {
    public static void main(String[] args) {
        getset gst=new getset("Sid",18,"SW");
        System.out.println(gst.getName());
        System.out.println(gst.getRoll());
        System.out.println(gst.getDept());
    }
}

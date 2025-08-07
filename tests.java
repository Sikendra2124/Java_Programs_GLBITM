
class student {
    String Name;
    int Roll;
    student(String Name, int Roll){
        this.Name=Name;
        this.Roll=Roll;
    }
    public int getRoll(int Roll){
        return Roll;
    }
    public void setRoll(int Roll){
        this.Roll=Roll;
    }
}
public class tests {
    public static void main(String[] args){
        student s1=new student("sikendra",101);
        System.out.println(s1.Name);
        System.out.println(s1.Roll);
    }
}

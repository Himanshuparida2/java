public class Student{
    String name,roll1;
    int roll,age;
    void rollnumber(int roll){
        this.roll=roll;
    }
    void rollnumber(String roll1){
        this.roll1=roll1;
    }
    void print(){
        System.out.println("Name: "+name+"\n Roll Number: "+roll+"\n Age: "+age);
    }
}
    class driver {
        public static void main(String himanshu[]){
            Student obj=new Student();
            obj.name="Himanshu";
            obj.age=20;
            obj.rollnumber(43);
            obj.print();
        } 
    }
class Student {

    int roll;
    String name;
    int grade = 10;

    public Student(int roll, String name, int grade) {
        this.roll = roll;
        this.name = name;
        this.grade = grade;
    }
}
public class ForEachExample {
   
    public static void main(String args[]){
        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        
        for(int i=0; i<nums.length;i++){
            System.out.println(nums[i]);
        }

        for(int item : nums){
            System.out.println(item);
        }

        Student s1 = new Student(1, "Ram", 10);
        Student s2 = new Student(2, "Shyam", 10);
        Student s3 = new Student(3, "Hari", 10);
        Student s4 = new Student(4, "Gita", 10);
        Student students[] = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        for (Student student: students){
            System.out.println(student.roll + " " + student.name + " " + student.grade);
        }
    }
}

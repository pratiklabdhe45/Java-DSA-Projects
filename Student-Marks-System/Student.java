import java.util.Scanner;
public class Student{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);

```
    System.out.print("Enter number of students: ");
    int size=sc.nextInt();

    int[] student=new int[size];

    for(int i=0;i<size;i++){
        System.out.print("Enter marks of student "+(i+1)+": ");
        student[i]=sc.nextInt();
    }

    System.out.println("\n===== Student Marks =====");

    for(int i=0;i<size;i++){
        System.out.println("Student "+(i+1)+": "+student[i]);
    }

    System.out.println("\n===== Highest Marks =====");

    int max=student[0];
    for(int i=0;i<size;i++){
        if(student[i]>max){
            max=student[i];
        }
    }

    System.out.println("Highest marks: "+max);

    System.out.println("\n===== Lowest Marks =====");

    int low=student[0];
    for(int i=0;i<size;i++){
        if(student[i]<low){
            low=student[i];
        }
    }

    System.out.println("Lowest marks: "+low);

    System.out.println("\n===== Average Marks =====");

    int sum=0;
    for(int i=0;i<size;i++){
        sum=sum+student[i];
    }

    double average=(double)sum/size;

    System.out.println("Average marks: "+average);

    System.out.println("\n===== Pass / Fail Analysis =====");

    int pass=0;
    int fail=0;
    int passingmarks=35;

    for(int i=0;i<size;i++){
        if(student[i]>=passingmarks){
            pass++;
        }
        else{
            fail++;
        }
    }

    System.out.println("Number of students passed: "+pass);
    System.out.println("Number of students failed: "+fail);

}
```

}

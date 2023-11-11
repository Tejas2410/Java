public class Arr_02 {
    public static void main(String[] args) {
        int[] num = { 5 , 6 ,7};
        num[1] = 8;
        System.out.println(num[0]); //5
        System.out.println(num[1]); //8
        

        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        System.out.println("~~~~~~~~~~~~~~~~~~~~~2D Array~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int[][] a = new int[3][4]; // 2d array
        int[][][] b = new int[3][4][5]; // 3d array

        for(int i = 0 ; i < a.length ; i++) {
            for(int j = 0 ; j < a[0].length ; j++) {
                a[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0 ; i < a.length ; i++) {
            for(int j = 0 ; j < a[0].length ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~jagged array~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int[][] c = new int[3][]; // jagged array row are of fixed size and col size are different

        c[0] = new int[3];
        c[1] = new int[4];
        c[2] = new int[5];

        for(int i = 0 ; i < c.length ; i++) {
            for(int j = 0 ; j < c[i].length ; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // Drawbacks of Array -> we can't store int string different types in same array

        System.out.println("~~~~~~~~~~~~~~~~~~~~~Array of object~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Tejas";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Navin";
        s2.marks = 77;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Rohit";
        s3.marks = 70;

        
        Student[] stud = new Student[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        for(int i = 0 ; i < stud.length ; i++) {
            System.out.println(stud[i].name + " : " + stud[i].marks);
        }
        // o/p
        // Tejas : 80
        // Navin : 77
        // Rohit : 70

        System.out.println("~~~~~~~~~~~~~~~~~~~~~For Each / Enhanced Loop~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for(Student items : stud){
            System.out.println(items.name + " : " + items.marks);
        }

        // o/p
        // Tejas : 80
        // Navin : 77
        // Rohit : 70
        
      

    }

}

class Student{
        int rollno;
        String name;
        int marks;
    }

    /*class Student{
        String Name;
        int age;
        public void write(){
            System.out.println("Write");
        }

    }
    public class demo{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Name="Ramesh";
        s1.age=35;
        System.out.println(s1.Name);
        System.out.println(s1.age);
        Student s2=new Student();
        s1.write();
    }
}*/


/*class Student{
        String Name;
        int age;
        public void write(){
            System.out.println("Write");
        }
        public void work(){
            System.out.println(this.Name);
            System.out.println(this.age);

        }

    }
    public class demo{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Name="Ayush";
        s1.age=18;
        s1.write();
        s1.work();
    }
}*/
//Functions
/* 
class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void write() {
        System.out.println(name);
        System.out.println(age);
    }
}
public class demo {
    public static void main(String[] args) {
        Student s1 = new Student("Ramesh", 18);
        s1.write();
    }
}

//without functions

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Ramesh", 18);

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}
*/

//Polymorphism
/* 
class Student {
    String name;
    int age;

    // Method 1
    public void printInfo(String name) {
        System.out.println(name);
    }

    // Method 2
    public void printInfo(int age) {
        System.out.println(age);
    }

    // Method 3
    public void printInfo(String name, int age) {
        System.out.println(name+" "+age);
    }
}

public class demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Ramesh";
        s1.age = 18;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
*/
//inheritance

class Shape{
    String color;
}
class Triangle extends Shape{

}
public class demo {
    public static void main(String[] args) {

        Triangle s1 = new Triangle();
        s1.color = "Red";
        System.out.println(s1.color);

    }
}





class demo{

static int sum(int a){
    return a;
}
static int sum(int a, int b){
    return a+b;
}
static int sum(int b){
    return b;
}

    public static void main(String args[]{

    })
}



class Shape{
    String color;
}



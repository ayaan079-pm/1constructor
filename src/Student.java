public class Student {


        String name;
        int id;

        Student(String n, int i) {
            name = n;
            id = i;
        }

        void display() {
            System.out.println(name);
            System.out.println(id);
        }

        public static void main(String[] args) {

            Student s1 = new Student("Ahmed", 1001);

            s1.display();
        }
    }


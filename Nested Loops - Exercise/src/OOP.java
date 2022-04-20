public class OOP {

        static class Student {
            String name;
            int age;
            int id;

            public Student(String name, int age, int id) {
                this.name = name;
                this.age = age;
                this.id = id;
            }
            void increaseAge(){
                this.age++;
            }

            String getInfo(){
                return "ID: " + this.id + ", " + "age: " + this.age + ", " + "name: " + this.name;
            }

        }
        public static void main(String[] args) {

            Student a = new Student ("Joro", 30, 12345678);
            a.increaseAge();
            System.out.println(a.getInfo());


            Student b = new Student ("Pesho", 25, 10101010);
            System.out.println(b.getInfo());

            // write your code here            // write your code here
        }
    }




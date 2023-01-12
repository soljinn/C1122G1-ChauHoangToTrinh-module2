package ss10_dsa_list.bai_tap.array_list;

import ss10_dsa_list.bai_tap.array_list.MyList;
import ss5_access_modifier.bai_tap.student.Student;

public class TestMyList {

    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "A");
        Student b = new Student(2, "B");
        Student c = new Student(3, "C");
        Student d = new Student(4, "D");
        Student e = new Student(5, "E");
        Student f = new Student(6, "F");
//            List<String> danhSach =new ArrayList<>();
//            danhSach.

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        studentMyList.add(f);
        studentMyList.size();

        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.element[i];
            System.out.println(student.getId());
            System.out.println(student.getName());

        }
        System.out.println(studentMyList.size());
    }
}
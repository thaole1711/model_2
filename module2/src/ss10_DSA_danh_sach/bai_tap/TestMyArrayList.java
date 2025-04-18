package ss10_DSA_danh_sach.bai_tap;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args)  {
        Student a = new Student(1, "huy");
        Student b = new Student(2, "hoang");
        Student c = new Student(3, "dung");
        Student d = new Student(4, "tu");
        Student e = new Student(5, "anh");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e,2);
//        studentMyArrayList.clear();
//        for (int i = 0; i < studentMyArrayList.size(); i++) {
//            Student student=(Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
        System.out.println(studentMyArrayList.size());
    }

}

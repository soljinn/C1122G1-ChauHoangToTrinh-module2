package ss10_dsa_list.bai_tap.array_list;

import ss10_dsa_list.bai_tap.array_list.MyList;

public class MyListTest {
    public static class Staff {
        private int id;
        private String name;

        public Staff() {
        }

        public Staff(int id, String name) {
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
            return "Staff{" +
                    "id=" + getId() +
                    ", name='" + getName() + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            Staff staff = new Staff(1, "A");
            Staff staff1 = new Staff(2, "B");

            MyList<Staff> staffMyList = new MyList<>();
            staffMyList.add(staff);
            staffMyList.add(staff1);
            staffMyList.remove(1);
            for (int i = 0; i < staffMyList.size(); i++) {
                Staff staff2 = new Staff() ;
                System.out.println(staff2.getId());
                System.out.println(staff2.getName());
            }
            System.out.println(staffMyList.size());
        }
    }
}

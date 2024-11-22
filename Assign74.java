package package2;

public class Assign74 {
    class Student {
        private int rollNo;  // Private variable
        private String name; // Private variable

        // Getter method for rollNo
        public int getRollNo() {
            return rollNo;
        }

        // Setter method for rollNo
        public void setRollNo(int rollNo) {
            if (rollNo > 0) { // Basic validation
                this.rollNo = rollNo;
            } else {
                System.out.println("Invalid roll number.");
            }
        }

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for name
        public void setName(String name) {
            this.name = name;
        }
    }

    public class EncapsulationExample {
        public void main(String[] args) {
            Student student = new Student();

            // Setting values using setter methods
            student.setRollNo(101);
            student.setName("John");

            // Accessing values using getter methods
            System.out.println("Student Roll Number: " + student.getRollNo());
            System.out.println("Student Name: " + student.getName());
        }
    }
}

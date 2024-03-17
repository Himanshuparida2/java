class Student implements Comparable<Student> {
    private String name;
    private int rn;
    private int totalMark;

    public Student(String name, int rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.rn, otherStudent.rn);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rn + ", Total Mark: " + totalMark;
    }
}

 class StudentSort {
    public static void main(String[] himanshu) {
        Student[] students = {
            new Student("Alice", 101, 85),
            new Student("Bob", 102, 78),
            new Student("Charlie", 100, 92),
            new Student("David", 104, 89)
        };

        bubbleSort(students);

        System.out.println("Sorted Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void bubbleSort(Student[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

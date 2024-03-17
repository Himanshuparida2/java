class Students implements Comparable<Students> {
    private String name;
    private int rn;
    private int totalMark;

    public Students(String name, int rn, int totalMark) {
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
    public int compareTo(Students otherStudent) {
        return Integer.compare(this.rn, otherStudent.rn);
    }
}

 class StudentSearch {
    public static void main(String[] himanshu) {
        Students[] students = {
            new Students("Alice", 101, 85),
            new Students("Bob", 102, 78),
            new Students("Charlie", 103, 92),
            new Students("David", 104, 89)
        };

        int rollNumberToSearch = 102;

        boolean found = false;
        for (Students student : students) {
            if (student.getRn() == rollNumberToSearch) {
                found = true;
                System.out.println("Student found:");
                System.out.println("Name: " + student.getName());
                System.out.println("Roll Number: " + student.getRn());
                System.out.println("Total Marks: " + student.getTotalMark());
                break;
            }
        }

        if (!found) {
            System.out.println("Student with roll number " + rollNumberToSearch + " not found.");
        }
    }
}
package work_6;

public class Student implements Comparable {
    private int age;
    private String name;
    private int grade;

    public Student(int age, String name, int grade) {
        this.setAge(age);
        this.setName(name);
        this.setGrade(grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Student))
            throw new IllegalArgumentException("Объект не является студентом!");
        return this.age - ((Student) o).age;
    }
}

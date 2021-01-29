public class Employee {
    final String name;
    final String post;
    final String email;
    final String telephone;
    final String salary;
    final int age;


    public Employee(String name, String post, String email, String telephone, String salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    void showInfo() {
        System.out.println(name + " " + post + " " + email + " " + telephone + " " + salary + " " + age + " ");
    }

    public int getAge(){
        return age;
    }
}

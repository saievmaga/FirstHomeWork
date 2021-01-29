
public class Main {


    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Иванов Иван", "Инженер", "ivanovivan@mail.ru", "89280011010", "30000", 30);
        empArr[1] = new Employee("Рубанов Алекс", "Механик", "ivanovivan@mail.ru", "89286665555", "35000", 39);
        empArr[2] = new Employee("Шуткин Сергей", "Электрик", "ivanovivan@mail.ru", "89296644897", "25000", 41);
        empArr[3] = new Employee("Штыркин Николай", "Сварщик", "ivanovivan@mail.ru", "89633218944", "40000", 43);
        empArr[4] = new Employee("Качалов Василий", "Перевозчик", "ivanovivan@mail.ru", "89659574477", "35000", 35);
        for (Employee employee : empArr) {
            if (employee.getAge() > 40) {
                employee.showInfo();
            }
        }
    }
}
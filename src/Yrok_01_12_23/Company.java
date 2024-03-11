package Yrok_01_12_23;

    public class Company {
        String name;
        Employee[] employees;

        // TODO: добавление сотрудника
        void hire(Employee employee) {
            for (int i = 0; i < employees.length; i++) {
                if (employees [i] == null) {
                    employees [i] = employee;
                    employees[i].companyName = name;
                    break;
                }
            }
            System.out.println("Сотрудник " + employee.name + " теперь в компании ");
        }

        // TODO: увольнение сотрудника
        void fire(String employeeName) {
            for (int i = 0; i < employees.length; i++) {
                if (employees [i] != null) {
                    if (employeeName == employees[i].name) {
                        employees[i] = null;
                        System.out.println("Сотрудник " + employeeName + " уволен из компании ");
                        return;
                    }
                }

            }
            System.out.println("Сотрудник не найден");
        }
    }



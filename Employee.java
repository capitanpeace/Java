package homework_5;

public class Employee {
        String name;
        String position;
        String email;
        long telephoneNumber;
        int salary;
        int age;

        public Employee(String name,String position,String email, long telephoneNumber, int salary, int age)
        {
                this.name=name;
                this.position= position;
                this.email=email;
                this.telephoneNumber=telephoneNumber;
                this.salary=salary;
                this.age =age;
        }
        void getFullInfo() {
                System.out.println("  name: " + name + " | position: " + position + " | email: " + email + " | salary: " + salary + " | age: " + age);
        }
        int getAge(){
                return age;
        }

        public static void main(String[] args){
            Employee employee1=new Employee("Ivanov Ivan Ivanovich","Engineer","Ivanov98@mail.ru",89234567890L,55000,45);
            System.out.print(employee1.name + " " + employee1.position + " " + employee1.email + " " + employee1.telephoneNumber + " "+ employee1.salary + " " + employee1.age);
            Employee[] empArray= new Employee[5];
            empArray[0]= new Employee( "Ivanov Ivan Ivanovich","Engineer","Ivanov98@mail.ru",89234567890L,55000,45);
            empArray[1]= new Employee("Borisov Nikolay Petrovich","Manager","Nikolay87@mail.ru",89122567890L,70000,41);
            empArray[2]= new Employee("Dovetov Igor Alexsandrovich","Senior Manager","Dovetov90@mail.ru",89854567850L,85000,30);
            empArray[3]= new Employee("Rektov Petr Dmitriivich","IT specialist","Petr95@mail.ru",89234567890L,90000,25);
            empArray[4]= new Employee("Mushanev Stanislav Georgievich","Senior IT specialist","Stanislav93@mail.ru",89166767890L,150000,29);
                    for (Employee f: empArray) if (f.getAge()>40)  f.getFullInfo();
                    }
            }




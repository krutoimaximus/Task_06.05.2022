package core;

import liga.Employee;
import liga.Schoolboy;
import liga.Student;
import liga.Team;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Schoolboy schoolboy_1 = new Schoolboy("Иван", 8);
            Schoolboy schoolboy_2 = new Schoolboy("Мария", 10);

            Schoolboy schoolboy_3 = new Schoolboy("Коля", 11);
            Schoolboy schoolboy_4 = new Schoolboy("Ирина", 12);

        Student student_1 = new Student("Николай", 20);
        Student student_2 = new Student("Ксения", 19);

        Employee employee_1 = new Employee("Аркадий", 32);
        Employee employee_2 = new Employee("Михаил", 47);


        Team <Schoolboy> schoolboyTeam_1 = new Team <> ("Драконы");
        schoolboyTeam_1.addNewParticipant(schoolboy_1);
        schoolboyTeam_1.addNewParticipant(schoolboy_2);

        Team <Schoolboy> schoolboyTeam_2 = new Team <> ("Однокласники");
        schoolboyTeam_2.addNewParticipant(schoolboy_3);
        schoolboyTeam_2.addNewParticipant(schoolboy_4);

        Team <Student> studentTeam_1 = new Team<>("Гидра");
        studentTeam_1.addNewParticipant(student_1);
        studentTeam_1.addNewParticipant(student_2);

        Team <Employee> employeeTeam_1 = new Team<>("Тигры");
        employeeTeam_1.addNewParticipant(employee_1);
        employeeTeam_1.addNewParticipant(employee_2);

        schoolboyTeam_1.playWith(schoolboyTeam_2);

        } catch(IOException ex) {
            System.out.println(ex);
        }
    }
}

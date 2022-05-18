package liga;

import java.io.IOException;

public class Employee extends Participant {

    public Employee(String name, int age) throws IOException {

        super(name, age);

        if (age < 30){
            throw new IOException( "У " + name + " слишком малый возраст");
        }
        else if(age > 60) {
            throw new IOException("У " + name + " слишком большой возраст");
        }
        }
    }


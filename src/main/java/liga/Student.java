package liga;

import java.io.IOException;

public class Student extends Participant {

    public Student(String name, int age) throws IOException {

        super(name, age);
        if (age < 19){
            throw new IOException( "У " + name + " слишком малый возраст");
        }
        else if(age > 30) {
            throw new IOException("У " + name + " слишком большой возраст");
        }
    }
}

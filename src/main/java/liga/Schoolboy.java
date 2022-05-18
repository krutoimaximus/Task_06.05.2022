package liga;

import java.io.IOException;

public class Schoolboy extends Participant  {

    public Schoolboy(String name, int age) throws IOException {

        super(name, age);
        if (age < 7){
            throw new IOException( "У " + name + " слишком малый возраст");
        }
        else if(age > 18) {
            throw new IOException("У " + name + " слишком большой возраст");
        }
    }
}

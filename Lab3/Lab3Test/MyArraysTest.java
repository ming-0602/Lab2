import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {
    @Test
    void arraysinsert(){
        final int SIZE = 100;

        int [] values = new int[SIZE];
        values[0] = 23;
        values[1] = 60;
        values[2] = 92;
        values[3] = 78;
        values[4] = 56;


        int result = MyArrays.insert(values, 5,6,2);
        assertEquals(6, result );
//        System.out.println(MyArrays.insert(intarray,2,1,2));
    }
}
package Calculator;

import static org.junit.Assert.*;

public class ContextTest {

    @org.junit.Test
    public void run() {
        Context context = new Context();
        assertEquals(0,context.run("C"));
        assertEquals(2,context.run("C2"));
        assertEquals(25,context.run("C25"));
        assertEquals(5,context.run("C2+3="));
        assertEquals(100,context.run("C130-30="));
        assertEquals(25,context.run("C5*5="));
        assertEquals(5,context.run("C10/2="));
        assertEquals(10,context.run("C4*5/2="));
        assertEquals(0,context.run("C354346*00="));
        assertEquals(8,context.run("C2+2*2="));
    }
}
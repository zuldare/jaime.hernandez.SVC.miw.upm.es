package es.upm.miw.practica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C11Test {

    @Test
    public void testM1() {
        assertEquals("m1", new C11().m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", new C11().m2());
    }

}

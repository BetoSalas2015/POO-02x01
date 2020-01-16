

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestHora.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestHora
{
    /**
     * Default constructor for test class TestHora
     */
    public TestHora()
    {
    }


    @Test
    public void testCase01()
    {
        Hora hora1 = new Hora();
        assertEquals("12:00:00 AM", hora1.toString());
    }

    @Test
    public void testCase02()
    {
        Hora hora1 = new Hora(5);
        assertEquals(5, hora1.getHoras());
    }

    @Test
    public void testCase03()
    {
        Hora hora1 = new Hora(13, 10);
        assertEquals("1:10:00 PM", hora1.toString());
    }

    @Test
    public void testCase04()
    {
        Hora hora1 = new Hora(17, 66);
        assertEquals("5:00:00 PM", hora1.toString());
    }

    @Test
    public void testCase05()
    {
        Hora hora1 = new Hora(99, 99, 99);
        assertEquals("12:00:00 AM", hora1.toString());
    }

    @Test
    public void testCase06()
    {
        Hora hora1 = new Hora(13, 44, 12);
        hora1.setHoras(22, 12, 12);
        assertEquals("10:12:12 PM", hora1.toString());
    }

    @Test
    public void testCase07()
    {
        Hora hora1 = new Hora();
        hora1.setHoras(99, 99, 99);
        assertEquals("12:00:00 AM", hora1.toString());
    }

    @Test
    public void testCase08()
    {
        Hora hora1 = new Hora(12, 15);
        hora1.tick();
        assertEquals("12:15:01 PM", hora1.toString());
    }

    @Test
    public void testCase09()
    {
        Hora hora1 = new Hora(12, 13, 14);
        hora1.tick();
        assertEquals("12:13:15 PM", hora1.toString());
    }

    @Test
    public void testCase10()
    {
        Hora hora1 = new Hora(99, 99, 99);
        hora1.setHoras(23, 59, 58);
        hora1.tick();
        hora1.tick();
        hora1.tick();
        assertEquals("12:00:01 AM", hora1.toString());
    }
}











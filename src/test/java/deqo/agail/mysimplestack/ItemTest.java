package deqo.agail.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item testedItem;

    @Before
    public void setUp() {
        testedItem = new Item();
    }

    @Test
    public void testGetValue() {
        assertEquals(0, testedItem.getValue());
    }

    @Test
    public void testSetValue() {
        testedItem.setValue(3);
        assertEquals(3, testedItem.getValue());
    }

}
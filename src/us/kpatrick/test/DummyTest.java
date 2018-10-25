package us.kpatrick.test;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;
import us.kpatrick.Dummy;

import static org.junit.Assert.*;

public class DummyTest {



    @org.junit.Test
    public void TestStringable() {
        Dummy superdummy = new Dummy("astring");
        assertEquals("astring", superdummy.stringable());
        assertNotEquals("notastring",superdummy.stringable());
    }

    @org.junit.Test
    public void TestToString() {
        Dummy superdummy = new Dummy("astring");
        assertEquals("astring", superdummy.toString());
        assertNotEquals("notastring",superdummy.toString());

    }
}

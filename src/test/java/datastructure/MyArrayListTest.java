package datastructure;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MyArrayListTest {
    private MyList<Integer> list;
    @BeforeTest
    public void setUp(){
        list = new MyArrayList<>(10);

    }

    @Test
    public void testSize() {
        list.add(1);
        Assert.assertEquals(list.size(), 0);
    }

    @Test
    public void testIsEmpty() {
    }

    @Test
    public void testContains() {
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void testRemove() {
    }

    @Test
    public void testClear() {
    }

    @Test
    public void testGet() {
    }

    @Test
    public void testSet() {
    }

    @Test
    public void testTestAdd() {
    }

    @Test
    public void testTestRemove() {
    }

    @Test
    public void testIndexOf() {
    }

    @Test
    public void testLastIndexOf() {
    }

    @Test
    public void testTestToString() {
    }
}

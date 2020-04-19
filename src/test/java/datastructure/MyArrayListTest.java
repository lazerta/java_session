package datastructure;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyArrayListTest {

    private MyList<Integer> myList;

    @BeforeMethod
    public void setUp() {
        myList = new MyArrayList<>(16);
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
    }

    @AfterMethod
    public void tearDown() {
    }
    @DataProvider()
    public Object[][] provider(){
     String[][] data = {

             {"username","password"},
             {"shawn","123"},
             {"admin","admin"}

     };
     return data;

    }
    @Test(dataProvider = "provider")
    public void testLogin(String username,String password){
        System.out.println("username = "+username);
        System.out.println("password = " + password);
    }
    @Test()
    public void testSize() {
        int expected = 10;
        Assert.assertEquals(myList.size(), expected);
    }
    @Test()
    public void testIsEmpty() {
        Assert.assertFalse(myList.isEmpty());
    }

    @Test
    public void testContains() {
        int testData = 0;
        Assert.assertTrue(myList.contains(testData));

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
}

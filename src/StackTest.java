import org.junit.*;
import org.junit.jupiter.api.BeforeEach;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack(2);
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsNotEmpty() {
        stack.push(1);
        Assert.assertFalse(stack.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPushNegativeValue() {
        stack.push(-1);
    }

    @Test(expected = StackOverflowError.class)
    public void testPushMoreThanMaxSize() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    @Test
    public void testPushValidValue() {
        stack.push(1);
        Assert.assertEquals(1, stack.stackArr[0]);
    }

    @Test
    public void testPopIsEmptyArray() {
        Assert.assertEquals(-1, stack.pop());
    }

    @Test
    public void testPopIsNotEmptyArray() {
        stack.push(1);
        Assert.assertEquals(1, stack.pop());
    }

    @Test
    public void testSize() {
        Assert.assertEquals(0, stack.size());
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.size());
    }

    @Test
    public void testTopIsEmpty() {
        Assert.assertEquals(-1, stack.top());
    }

    @Test
    public void testTopIsNotEmpty() {
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.top());
    }
}

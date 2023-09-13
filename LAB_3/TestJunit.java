package LAB_3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class Message {
    private String message;

    Message(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }
}

public class TestJunit {
    String message = "Hello World";
    Message messageUtil = new Message(message);

    @Test
    public void testPrintMessage() {
        assertEquals("This String will fail the test", messageUtil.printMessage());
    }
}

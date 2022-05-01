import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CLITest {

    String[] args;

    @Before
    public void setUp() {
        args = new String[]{"-K", "10", "-A", ".90", "-K", "20", "-P", "-K", "30", "-C"};
    }

    @Test
    public void testCLI() {
        Configuration configuration = CLIClassique.configuration(args);
        //Assert.assertEquals(configuration.toString(), "alpha=0.9, epsilon=-1.0, indice=30, mode=CREUSE");
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("CLITest");
    }

}

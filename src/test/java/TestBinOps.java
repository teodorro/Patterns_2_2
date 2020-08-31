import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestBinOps {
    @Test
    public void testSum(){
        BinOps binOps = new BinOps();
        String arg1 = "11";
        String arg2 = "100";

        String sum = binOps.sum(arg1, arg2);

        Assertions.assertEquals("111", sum);
    }

    @Test
    public void testMul(){
        BinOps binOps = new BinOps();
        String arg1 = "11";
        String arg2 = "100";

        String mult = binOps.mult(arg1, arg2);

        Assertions.assertEquals("1100", mult);
    }
}

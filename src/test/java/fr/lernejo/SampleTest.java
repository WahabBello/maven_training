package fr.lernejo;
import org.junit.jupiter.api.Test;


public class SampleTest {
    @Test
    void testFact(){
        var Sample = new Sample();
        Sample.fact(3);
    }
    @Test
    void testOperation(){
        var Sample = new Sample();
        Sample.op(fr.lernejo.Sample.Operation.MULT,5,7);
    }
}

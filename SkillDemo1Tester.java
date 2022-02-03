import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Tester {
    @Test
    public void test1(){
        assertEquals(1, SkillDemo1.alwaysZero(1));
    }
}

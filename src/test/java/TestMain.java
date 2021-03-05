import static org.junit.jupiter.api.Assertions.*;

import com.ou.gilstad.MainClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMain {
    int testArray[] = {1, 2, 3, 4, 5};
    int myArray[];

    @BeforeEach
    void setUp() throws Exception {
        myArray = testArray.clone();
    }

    @Test
    void testDoubleValues() {
        int newArray[] = MainClass.doubleValues(myArray);
        int expected[] = {2, 4, 6, 8, 10};

        assertArrayEquals(expected, newArray);

    }

}

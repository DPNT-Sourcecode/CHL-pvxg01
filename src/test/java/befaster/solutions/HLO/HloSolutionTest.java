package befaster.solutions.HLO;

import befaster.solutions.SUM.SumSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HloSolutionTest {
    private HelloSolution helloSolution;

    @Before
    public void setUp() {

        helloSolution = new HelloSolution();
    }

    @Test
    public void hello__wrold_test() {
        assertThat(helloSolution.hello("Fred"), equalTo("Hello World!"));
    }
}


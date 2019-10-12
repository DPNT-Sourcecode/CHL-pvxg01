package befaster.solutions.CHK;

import befaster.solutions.HLO.HelloSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutSolutionTest {
    private CheckoutSolution checkoutSolution;

    @Before
    public void setUp() {

        checkoutSolution = new CheckoutSolution();
    }

    @Test
    public void checkout_olution_test()
    {
        assertThat(checkoutSolution.checkout("A"), equalTo(50));
        assertThat(checkoutSolution.checkout("3A"), equalTo(130));
        assertThat(checkoutSolution.checkout("B"), equalTo(30));
        assertThat(checkoutSolution.checkout("2B"), equalTo(45));
        assertThat(checkoutSolution.checkout("C"), equalTo(20));
        assertThat(checkoutSolution.checkout("D"), equalTo(15));
        assertThat(checkoutSolution.checkout("E"), equalTo(-1));
    }
}


package befaster.solutions.CHK;

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
    public void checkout_solution_test()
    {
        assertThat(checkoutSolution.checkout("A"), equalTo(50));
        assertThat(checkoutSolution.checkout("3A"), equalTo(-1));
        assertThat(checkoutSolution.checkout("AAA"), equalTo(130));
        assertThat(checkoutSolution.checkout("AAAA"), equalTo(180));
        assertThat(checkoutSolution.checkout("AA"), equalTo(100));
        assertThat(checkoutSolution.checkout("AAAAAA"), equalTo(250));
        assertThat(checkoutSolution.checkout("AAABB"), equalTo(175));
        assertThat(checkoutSolution.checkout("AAABBC"), equalTo(195));
        assertThat(checkoutSolution.checkout("ABCD"), equalTo(115));
        assertThat(checkoutSolution.checkout("B"), equalTo(30));
        assertThat(checkoutSolution.checkout("BB"), equalTo(45));
        assertThat(checkoutSolution.checkout("BBBB"), equalTo(90));
        assertThat(checkoutSolution.checkout("C"), equalTo(20));
        assertThat(checkoutSolution.checkout("CC"), equalTo(40));
        assertThat(checkoutSolution.checkout("D"), equalTo(15));
        assertThat(checkoutSolution.checkout("DC"), equalTo(35));
        assertThat(checkoutSolution.checkout("AAAAA"), equalTo(200));
        assertThat(checkoutSolution.checkout("BBB"), equalTo(75));
        assertThat(checkoutSolution.checkout(""), equalTo(0));
        assertThat(checkoutSolution.checkout(null), equalTo(0));
    }

    @Test
    public void checkout_solution_test_R2()
    {
//        assertThat(checkoutSolution.checkout("AAAAAAAA"), equalTo(330));
//        assertThat(checkoutSolution.checkout("AAAAAAAAA"), equalTo(380));
//        assertThat(checkoutSolution.checkout("AAAAAAAAAA"), equalTo(400));
//        assertThat(checkoutSolution.checkout("AAAAAAAAAAA"), equalTo(450));
//        assertThat(checkoutSolution.checkout("AAAA"), equalTo(180));
//        assertThat(checkoutSolution.checkout("EEB"), equalTo(80));
//        assertThat(checkoutSolution.checkout("EEEB"), equalTo(120));
//        assertThat(checkoutSolution.checkout("EEEBB"), equalTo(150));
//        assertThat(checkoutSolution.checkout("EEEEBB"), equalTo(160));
        assertThat(checkoutSolution.checkout("EEEEB"), equalTo(160));
    }
}


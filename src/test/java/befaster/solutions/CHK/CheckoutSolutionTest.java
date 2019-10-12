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
        assertThat(checkoutSolution.checkout("AAAAAAAA"), equalTo(330));
        assertThat(checkoutSolution.checkout("AAAAAAAAA"), equalTo(380));
        assertThat(checkoutSolution.checkout("AAAAAAAAAA"), equalTo(400));
        assertThat(checkoutSolution.checkout("AAAAAAAAAAA"), equalTo(450));
        assertThat(checkoutSolution.checkout("AAAA"), equalTo(180));
        assertThat(checkoutSolution.checkout("EEB"), equalTo(80));
        assertThat(checkoutSolution.checkout("EEEB"), equalTo(120));
        assertThat(checkoutSolution.checkout("EEEBB"), equalTo(150));
        assertThat(checkoutSolution.checkout("EEEEBB"), equalTo(160));
        assertThat(checkoutSolution.checkout("EBB"), equalTo(85));
        assertThat(checkoutSolution.checkout("EEEEB"), equalTo(160));
        assertThat(checkoutSolution.checkout("EEB"), equalTo(80));
        assertThat(checkoutSolution.checkout("EEBB"), equalTo(110));
        assertThat(checkoutSolution.checkout("EEBBB"), equalTo(125));

        assertThat(checkoutSolution.checkout("AAAAAEEBAAABB"), equalTo(455));
        assertThat(checkoutSolution.checkout("ABCDECBAABCABBAAAEEAA"), equalTo(665));
    }

    @Test
    public void checkout_solution_test_R3()
    {
        assertThat(checkoutSolution.checkout("FFF"), equalTo(20));
        assertThat(checkoutSolution.checkout("FF"), equalTo(20));
        assertThat(checkoutSolution.checkout("FFFFF"), equalTo(40));
        assertThat(checkoutSolution.checkout("FFFFFF"), equalTo(40));
        assertThat(checkoutSolution.checkout("FFFFFFF"), equalTo(50));
        assertThat(checkoutSolution.checkout("FFFFFFFFF"), equalTo(60));
        assertThat(checkoutSolution.checkout("FFFFFFFFFF"), equalTo(70));
        assertThat(checkoutSolution.checkout("FFFFFFFFFFF"), equalTo(80));
        assertThat(checkoutSolution.checkout("FFFFFFFFFFFF"), equalTo(80));
        assertThat(checkoutSolution.checkout("ABCDECBAABCABBAAAEEAAFFFFFFF"), equalTo(715));
    }

    @Test
    public void checkout_solution_test_R4()
    {
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), equalTo(965));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZK"), equalTo(1035));
        assertThat(checkoutSolution.checkout("ABCDEFGIJKLMNOPQRSTUVWXYZ"), equalTo(955));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZHHHHHHHHH"), equalTo(1045));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHH"), equalTo(1070));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHH"), equalTo(1110));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHH"), equalTo(1115));

        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZNN"), equalTo(1030));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZNNM"), equalTo(1045));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZNNMNN"), equalTo(1125));

        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZLL"), equalTo(1145));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZJLL"), equalTo(1205));

        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZNNMNNPPP"), equalTo(1275));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZNNMNNPPPP"), equalTo(1275));

        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHQQ"), equalTo(1160));

        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHQ"), equalTo(1140));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHQRR"), equalTo(1210));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHQQRR"), equalTo(1240));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHQQQRR"), equalTo(1260));

        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQ"), equalTo(1165));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQ"), equalTo(1225));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQ"), equalTo(1245));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQUU"), equalTo(1325));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQUUU"), equalTo(1325));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQUUUUUU"), equalTo(1445));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQUUUUUUU"), equalTo(1445));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQUUUUUV"), equalTo(1445));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQUUUUUVV"), equalTo(1485));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQUUUUUVVVV"), equalTo(1575));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQUUUUUVVVVV"), equalTo(1615));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQUUUUUVVVVVVV"), equalTo(1705));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQUUUUUVVVVVVVV"), equalTo(1745));
    }
}

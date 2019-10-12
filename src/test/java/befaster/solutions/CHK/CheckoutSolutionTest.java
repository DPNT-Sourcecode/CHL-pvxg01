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

        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHQQ"), equalTo(1160));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQ"), equalTo(1165));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQ"), equalTo(1225));
        assertThat(checkoutSolution.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZKHHHHHHHHHQQQQQ"), equalTo(1245));
    }

//    Our price table and offers:
//            +------+-------+------------------------+
//            | Item | Price | Special offers         |
//            +------+-------+------------------------+
//            | A    | 50    | 3A for 130, 5A for 200 |
//            | B    | 30    | 2B for 45              |
//            | C    | 20    |                        |
//            | D    | 15    |                        |
//            | E    | 40    | 2E get one B free      |
//            | F    | 10    | 2F get one F free      |
//            | G    | 20    |                        |
//            | H    | 10    | 5H for 45, 10H for 80  |
//            | I    | 35    |                        |
//            | J    | 60    |                        |
//            | K    | 80    | 2K for 150             |
//            | L    | 90    |                        |
//            | M    | 15    |                        |
//            | N    | 40    | 3N get one M free      |
//            | O    | 10    |                        |
//            | P    | 50    | 5P for 200             |
//            | Q    | 30    | 3Q for 80              |
//            | R    | 50    | 3R get one Q free      |
//            | S    | 30    |                        |
//            | T    | 20    |                        |
//            | U    | 40    | 3U get one U free      |
//            | V    | 50    | 2V for 90, 3V for 130  |
//            | W    | 20    |                        |
//            | X    | 90    |                        |
//            | Y    | 10    |                        |
//            | Z    | 50    |                        |
//            +------+-------+------------------------+
}





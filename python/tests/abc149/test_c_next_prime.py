from abc149.c_next_prime import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""20""", """23
""", main)

    def test_second_case(self):
        self.helper("""2""", """2
""", main)

    def test_third_case(self):
        self.helper("""99992""", """100003
""", main)

from abc148.b_strings_with_the_same_length import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""2
ip cc
""", "icpc\n", main)

    def test_second_case(self):
        self.helper("""8
hmhmnknk uuuuuuuu
""", "humuhumunukunuku\n", main)

    def test_third_case(self):
        self.helper("""5
aaaaa aaaaa
""", "aaaaaaaaaa\n", main)

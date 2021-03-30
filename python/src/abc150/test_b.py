from abc150.b_count_abc import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""10
ZABCDBABCQ
""", """2
""", main)

    def test_main2(self):
        self.helper("""19
THREEONEFOURONEFIVE
""", """0
""", main)

    def test_main3(self):
        self.helper("""33
ABCCABCBABCCABACBCBBABCBCBCBCABCB
""", """5
""", main)

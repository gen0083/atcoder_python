from tests.si_so_test_case import SISOTestCase
from abc150.e_change_a_little_bit import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""1
1000000000
""", """999999993
""", main)

    def test_main2(self):
        self.helper("""2
5 8
""", """124
""", main)

    def test_main3(self):
        self.helper("""5
52 67 72 25 79
""", """269312
""", main)

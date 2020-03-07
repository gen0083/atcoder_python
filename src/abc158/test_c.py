from tests.si_so_test_case import SISOTestCase
from abc158.c_tax_increase import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2 2
""", """25
""", main)

    def test_main2(self):
        self.helper("""8 10
""", """100
""", main)

    def test_main3(self):
        self.helper("""19 99
""", """-1
""", main)

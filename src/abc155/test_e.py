from tests.si_so_test_case import SISOTestCase
from abc155.e_payment import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""36
""", """8
""", main)

    def test_main2(self):
        self.helper("""91
""", """3
""", main)

    def test_main3(self):
        self.helper("""314159265358979323846264338327950288419716939937551058209749445923078164062862089986280348253421170
""", """243
""", main)

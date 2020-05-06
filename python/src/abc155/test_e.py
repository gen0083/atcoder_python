from abc155.e_payment import main
from tests.si_so_test_case import SISOTestCase


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

    def test_main4(self):
        self.helper("78995", "10\n", main)

    def test_main5(self):
        self.helper("557490", "18\n", main)

    def test_main6(self):
        self.helper("3755105", "21\n", main)

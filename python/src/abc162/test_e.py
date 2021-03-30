from abc162.e import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 2
""", """9
""", main)

    def test_main2(self):
        self.helper("""3 200
""", """10813692
""", main)

    def test_main3(self):
        self.helper("""100000 100000
""", """742202979
""", main)

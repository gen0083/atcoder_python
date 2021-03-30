from abc163.d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 2
""", """10
""", main)

    def test_main2(self):
        self.helper("""200000 200001
""", """1
""", main)

    def test_main3(self):
        self.helper("""141421 35623
""", """220280457
""", main)

from abc165.a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""7
500 600
""", """OK
""", main)

    def test_main2(self):
        self.helper("""4
5 7
""", """NG
""", main)

    def test_main3(self):
        self.helper("""1
11 11
""", """OK
""", main)

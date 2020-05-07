from problems.abc130d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 10
6 1 2 7""", """2
""", main)

    def test_main2(self):
        self.helper("""3 5
3 3 3""", """3
""", main)

    def test_main3(self):
        self.helper("""10 53462
103 35322 232 342 21099 90000 18843 9010 35221 19352""", """36
""", main)

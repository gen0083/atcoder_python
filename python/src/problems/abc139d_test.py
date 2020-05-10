from problems.abc139d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2
""", """1
""", main)

    def test_main2(self):
        self.helper("""13
""", """78
""", main)

    def test_main3(self):
        self.helper("""1
""", """0
""", main)

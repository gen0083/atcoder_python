from problems.arc110a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3
""", """7
""", main)

    def test_main2(self):
        self.helper("""10
""", """39916801
""", main)

    def test_main3(self):
        self.helper("""30
""", """1
""", main)

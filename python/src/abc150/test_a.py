from abc150.a_500yen_coins import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2 900
""", """Yes
""", main)

    def test_main2(self):
        self.helper("""1 501
""", """No
""", main)

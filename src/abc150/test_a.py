from tests.si_so_test_case import SISOTestCase
from abc150.a import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2 900
""", """Yes
""", main)

    def test_main2(self):
        self.helper("""1 501
""", """No
""", main)

    def test_main3(self):
        self.helper("""""", """""", main)

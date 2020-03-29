from abc160.a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""sippuu""", """Yes
""", main)

    def test_main2(self):
        self.helper("""iphone""", """No
""", main)

    def test_main3(self):
        self.helper("""coffee
""", """Yes
""", main)

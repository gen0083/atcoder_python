from abc159.b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""akasaka
""", """Yes
""", main)

    def test_main2(self):
        self.helper("""level
""", """No
""", main)

    def test_main3(self):
        self.helper("""atcoder
""", """No
""", main)

    def test_main4(self):
        self.helper("""abbascccc
""", """No
""", main)

    def test_main5(self):
        self.helper("abc", "No\n", main)

    def test_main6(self):
        self.helper("aba", "Yes\n", main)

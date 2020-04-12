from abc162.a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""117""", """Yes
""", main)

    def test_main2(self):
        self.helper("""123
""", """No
""", main)

    def test_main3(self):
        self.helper("""777
""", """Yes
""", main)

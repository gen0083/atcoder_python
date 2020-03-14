from panasonic2020.c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2 3 9""", """No
""", main)

    def test_main2(self):
        self.helper("""2 3 10
""", """Yes
""", main)

    def test_main3(self):
        self.helper("""4 4 16
""", """No
""", main)

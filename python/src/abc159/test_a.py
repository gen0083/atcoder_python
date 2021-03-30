from abc159.a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2 1
""", """1
""", main)

    def test_main2(self):
        self.helper("""4 3
""", """9
""", main)

    def test_main3(self):
        self.helper("""1 1
""", """0
""", main)

    def test_main4(self):
        self.helper("""13 3
""", """81
""", main)

    def test_main5(self):
        self.helper("""0 3
""", """3
""", main)

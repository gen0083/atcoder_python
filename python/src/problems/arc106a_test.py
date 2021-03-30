from problems.arc106a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""106
""", """4 2
""", main)

    def test_main2(self):
        self.helper("""1024
""", """-1
""", main)

    def test_main3(self):
        self.helper("""10460353208
""", """21 1
""", main)

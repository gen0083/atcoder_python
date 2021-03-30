from past201912.past201912a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""678""", """1356
""", main)

    def test_main2(self):
        self.helper("""abc""", """error
""", main)

    def test_main3(self):
        self.helper("""0x8""", """error
""", main)

    def test_main4(self):
        self.helper("""012""", """24
""", main)

from panasonic2020.a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""6""", """2
""", main)

    def test_main2(self):
        self.helper("""27""", """5
""", main)

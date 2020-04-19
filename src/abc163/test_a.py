from abc163.a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""1
""", """6.28318530717958623200
""", main)

    def test_main2(self):
        self.helper("""73
""", """458.67252742410977361942
""", main)

from abc151.a_next_alphabet import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""a
""", """b
""", main)

    def test_main2(self):
        self.helper("""y
""", """z
""", main)

from abc162.d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4
RRGB
""", """1
""", main)

    def test_main2(self):
        self.helper("""39
RBRBGRBGGBBRRGBBRRRBGGBRBGBRBGBRBBBGBBB
""", """1800
""", main)

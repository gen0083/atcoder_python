from abc164.d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""1817181712114
""", """3
""", main)

    def test_main2(self):
        self.helper("""14282668646
""", """2
""", main)

    def test_main3(self):
        self.helper("""2119
""", """0
""", main)

    def test_main4(self):
        self.helper("2" * 200000, """0
""", main)

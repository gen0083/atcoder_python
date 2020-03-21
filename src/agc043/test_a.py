from agc043.a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 3
.##
.#.
##.
""", """1
""", main)

    def test_main2(self):
        self.helper("""2 2
#.
.#
""", """2
""", main)

    def test_main3(self):
        self.helper("""4 4
..##
#...
###.
###.
""", """0
""", main)

    def test_main4(self):
        self.helper("""5 5
.#.#.
#.#.#
.#.#.
#.#.#
.#.#.
""", """4
""", main)

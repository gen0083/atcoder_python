from tests.si_so_test_case import SISOTestCase
from abc151.d import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 3
...
...
...
""", """4
""", main)

    def test_main2(self):
        self.helper("""3 5
...#.
.#.#.
.#...
""", """10
""", main)

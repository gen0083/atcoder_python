from problems.aising2020d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3
011""", """2
1
1
""", main)

    def test_main2(self):
        self.helper("""23
00110111001011011001110""", """2
1
2
2
1
2
2
2
2
2
2
2
2
2
2
2
2
2
2
2
2
1
3
""", main)

    def test_main3(self):
        self.helper(f"""200000
{"10" * 100000}""", """a
""", main)

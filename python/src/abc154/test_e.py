from abc154.e_almost_everywhere_zero import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""100
1
""", """19
""", main)

    def test_main2(self):
        self.helper("""25
2
""", """14
""", main)

    def test_main3(self):
        self.helper("""314159
2
""", """937
""", main)

    def test_main4(self):
        self.helper("""9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999
3
""", """117879300
""", main)

    def test_main5(self):
        self.helper("1000\n2\n", "243\n", main)

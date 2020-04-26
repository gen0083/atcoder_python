from abc164.c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3
apple
orange
apple
""", """2
""", main)

    def test_main2(self):
        self.helper("""5
grape
grape
grape
grape
grape
""", """1
""", main)

    def test_main3(self):
        self.helper("""4
aaaa
a
aaa
aa
""", """4
""", main)

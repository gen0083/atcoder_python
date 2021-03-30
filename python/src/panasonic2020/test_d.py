from panasonic2020.d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""1""", """a
""", main)

    def test_main2(self):
        self.helper("""2""", """aa
ab
""", main)

    def test_main3(self):
        self.helper("""3""", """aaa
aab
aba
abb
abc
""", main)

from abc156.d_bouquet import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("4 1 3", "7\n", main)

    def test_main2(self):
        self.helper("1000000000 141421 173205", "34076506\n", main)

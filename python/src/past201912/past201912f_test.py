from past201912.past201912f import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""FisHDoGCaTAAAaAAbCAC
""", """AAAaAAbCACCaTDoGFisH
""", main)

    def test_main2(self):
        self.helper("""AAAAAjhfgaBCsahdfakGZsZGdEAA
""", """AAAAAAAjhfgaBCsahdfakGGdEZsZ
""", main)

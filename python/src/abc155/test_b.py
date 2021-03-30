from abc155.b_papers_please import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
6 7 9 10 31
""", """APPROVED
""", main)

    def test_main2(self):
        self.helper("""3
28 27 24
""", """DENIED
""", main)

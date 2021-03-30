from algorithm_and_data_structure.alds1_4_c_dictionary import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""6
insert AAA
insert AAC
find AAA
find CCC
insert CCC
find CCC
""", """yes
no
yes
""", main)

    def test_second_case(self):
        self.helper("""13
insert AAA
insert AAC
insert AGA
insert AGG
insert TTT
find AAA
find CCC
find CCC
insert CCC
find CCC
insert T
find TTT
find T
""", """yes
no
no
yes
yes
yes
""", main)

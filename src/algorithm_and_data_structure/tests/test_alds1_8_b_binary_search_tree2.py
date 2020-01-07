from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_8_b_binary_search_tree2 import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""10
insert 30
insert 88
insert 12
insert 1
insert 20
find 12
insert 17
insert 25
find 16
print
""", """yes
no
 1 12 17 20 25 30 88
 30 12 1 20 17 25 88
""", main)

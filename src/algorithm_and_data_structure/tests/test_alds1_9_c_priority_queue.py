from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_9_c_priority_queue import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""insert 8
insert 2
extract
insert 10
extract
insert 11
extract
extract
end
""", """8
10
11
2
""", main)

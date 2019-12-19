from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_3_c_doubly_linked_list import main


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("7\ninsert 5\ninsert 2\ninsert 3\ninsert 1\ndelete 3\ninsert 6\ndelete 5",
                    "6 1 2\n", main)

    def test_second_case(self):
        self.helper("9\ninsert 5\ninsert 2\ninsert 3\ninsert 1\ndelete 3\ninsert 6\ndelete 5\ndeleteFirst\ndeleteLast",
                    "1\n", main)

    def test_third_case(self):
        self.helper("21\ninsert 1\ninsert 2\ninsert 3\ninsert 4\ninsert 5\ninsert 6\ninsert 7\ninsert 8\ndelete 5\ndelete 7\ninsert 9\ndeleteLast\ndeleteLast\ninsert 10\ndeleteFirst\ndeleteFirst\ndelete 8\ninsert 7\ninsert 8\ndelete 4\ninsert 1",
                    "1 8 7 6 3\n", main)

    def test_fourth_case(self):
        self.helper("5\ninsert 7\ninsert 3\ndeleteFirst\ndeleteLast\ninsert 1",
                    "1\n", main)

    def test_fifth_case(self):
        self.helper("""8
insert 1000000000
insert 999999999
deleteLast
insert 1234566890
insert 5
deleteFirst
insert 7
delete 5""",
                    "7 1234566890 999999999\n", main)

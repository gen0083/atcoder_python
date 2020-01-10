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

    def test_main2(self):
        with open("alds1_9_c_in.txt") as i:
            with open("alds1_9_c_out.txt") as o:
                input_data = "".join(i.readlines())
                output_data = "".join(o.readlines())
                self.helper(input_data, output_data, main)

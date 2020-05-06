from algorithm_and_data_structure.alds1_12_c_single_source_shortest_path2 import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
0 3 2 3 3 1 1 2
1 2 0 2 3 4
2 3 0 3 3 1 4 1
3 4 2 1 0 1 1 4 4 3
4 2 2 1 3 3
""", """0 0
1 2
2 2
3 1
4 3
""", main)

    def test_main2(self):
        with open("alds1_12_c_case7_in.txt") as i:
            with open("alds1_12_c_case7_out.txt") as o:
                input_data = "".join(i.readlines())
                output_data = "".join(o.readlines())
                self.helper(input_data, output_data, main)

    def test_main3(self):
        with open("alds1_12_c_case8_in.txt") as i:
            with open("alds1_12_c_case8_out.txt") as o:
                input_data = "".join(i.readlines())
                output_data = "".join(o.readlines())
                self.helper(input_data, output_data, main)

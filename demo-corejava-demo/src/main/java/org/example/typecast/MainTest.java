package practice.typecast;
class SampleClass1 {
        public void test(){}
}
class SampleClass2 {
        public void test(){}
}

class MainTest {

        public void main(String[] args) {
        SampleClass1 sc1 = new SampleClass1();
        SampleClass2 sc2 = (SampleClass2) sc1;
        }
}

/*
It will give Compile Time Error: "Cannot cast from SampleClass1 to SampleClass2".
Casting is possible only if there is Parent-child relationship between classes.
*/
package Latihan4;
class DemoOverride2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.setA(50);
        obj.setB(150);
        //Akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}

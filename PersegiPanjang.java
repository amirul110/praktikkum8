
package my.company.praktikum8;



public class PersegiPanjang extends BangunDatar implements Keliling, Simetri {
    // attributes
    public int panjang;
    public int lebar;

    // methods

    @Override
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (this.lebar + this.panjang);
    }

    @Override
    public double hitungSimPutar() {
        return 2.0;
    }

    @Override
    public double hitungSimLipat() {
        return 2.0;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Persegi Panjang");
        System.out.println("------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim. Lipat: " + this.hitungSimLipat());
        System.out.println("Sim. Putar: " + this.hitungSimPutar());
    }

}

//
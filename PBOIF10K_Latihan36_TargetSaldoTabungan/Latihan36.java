/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 */
class SaldoTabungan {
    public void HitungSaldoTabungan(int saldo, double bulan, double bunga){
    int i;
    for(i = 1; saldo<=6000000; i++){
        bulan = bunga * saldo;
        saldo = (int) (saldo + bulan);
        System.out.println("Saldo di Bulan ke-" + i +" Rp." + saldo);
        }

    }   
    
}
public interface Fakultas {
    double TARIF_KEBERSIHAN = 50000; 

    default double getTarifKebersihan() { 
        return TARIF_KEBERSIHAN;
    }
}

package entity07196;

public class DaftarPegawaiEntity07196 {
    private PegawaiEntity07196 pegawai;
    private int IndexPekerjaan;

    public DaftarPegawaiEntity07196(PegawaiEntity07196 pegawai, int IndexPekerjaan) {
        this.pegawai = pegawai;
        this.IndexPekerjaan = IndexPekerjaan;
    }

    public PegawaiEntity07196 getPegawai() {
        return pegawai;
    }

    public void setPegawai(PegawaiEntity07196 pegawai) {
        this.pegawai = pegawai;
    }

    public int getIndexPekerjaan() {
        return IndexPekerjaan;
    }

    public void setIndexPekerjaan(int IndexPekerjaan) {
        this.IndexPekerjaan = IndexPekerjaan;
    }
}


package matkul;
import java.util.ArrayList; 
import java.util.List;

/**
 * @author Mael 
 */
public class Matkul {
    private int matkulId; 
    private String namaMatkul; 
    private String deskripsi; 
    private List<Material> daftarMaterial;

    public Matkul(int matkulId, String namaMatkul, String deskripsi) {
        this.matkulId = matkulId;
        this.namaMatkul = namaMatkul;
        this.deskripsi = deskripsi;
        this.daftarMaterial = new ArrayList<>(); 
    }

    public void tambahMaterial(Material material) {
        this.daftarMaterial.add(material);
    }

    public void jalankanSemuaMateri() {
        System.out.println("Membuka mata kuliah: " + namaMatkul);
        for (Material m : daftarMaterial) {
            m.tampilkanKonten(); 
        }
    }


    public List<Material> getDaftarMaterial() { 
        return daftarMaterial; 
    }
    
    public int getMatkulId() { 
        return matkulId; 
    }
    
    public void setMatkulId(int matkulId) { 
        this.matkulId = matkulId; 
    }

    public String getNamaMatkul() { 
        return namaMatkul; 
    }
    
    public void setNamaMatkul(String namaMatkul) { 
        this.namaMatkul = namaMatkul; 
    }

    public String getDeskripsi() { 
        return deskripsi; 
    }
    
    public void setDeskripsi(String deskripsi) { 
        this.deskripsi = deskripsi; 
    }
}

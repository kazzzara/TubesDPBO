package matkul;

/**
 * @author Mael
 */
public abstract class Material { 
    private int materialId; 
    private String title; 
    private String content; 
    private String status; 
    private double urgencyPercentage; 
    private String difficultyLevel;

    public Material(int materialId, String title, String content, String status) {
        this.materialId = materialId;
        this.title = title;
        this.content = content;
        this.status = status;
    }

    public abstract void tampilkanKonten();

    public int getMaterialId() { 
        return materialId; 
    }
    
    public void setMaterialId(int materialId) { 
        this.materialId = materialId; 
    }

    public String getTitle() { 
        return title; 
    }
    
    public void setTitle(String title) { 
        this.title = title; 
    }

    public String getContent() { 
        return content; 
    }
    
    public void setContent(String content) { 
        this.content = content; 
    }

    public String getStatus() { 
        return status; 
    } 
    
    public void setStatus(String status) { 
        this.status = status; 
    } 

    public double getUrgencyPercentage() { 
        return urgencyPercentage; 
    }
    
    public void setUrgencyPercentage(double urgencyPercentage) { 
        this.urgencyPercentage = urgencyPercentage; 
    }

    public String getDifficultyLevel() { 
        return difficultyLevel; 
    }
    public void setDifficultyLevel(String difficultyLevel) { 
        this.difficultyLevel = difficultyLevel; 
    }
}

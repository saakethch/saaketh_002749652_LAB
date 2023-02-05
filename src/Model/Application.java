/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nidhi Raghavendra
 */
public class Application {
    VitalSignHistory history;
    MedicineCatalog catalog;
    
    public Application() {
        this.catalog = new MedicineCatalog();
        this.history = new VitalSignHistory();
    }

    public VitalSignHistory getHistory() {
        return history;
    }

    public void setHistory(VitalSignHistory history) {
        this.history = history;
    }

    public MedicineCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(MedicineCatalog catalog) {
        this.catalog = catalog;
    }
    
    
}

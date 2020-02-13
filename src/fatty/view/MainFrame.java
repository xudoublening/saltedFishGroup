package fatty.view;

import java.awt.Component;
import javax.swing.JFrame;

/**
 * Created by Xnn on 2020/2/13 19:59
 */
public class MainFrame extends JFrame {
    private Panel lp = new Panel();
    private static MainFrame mf;
    
    public static MainFrame getMainFrame() {
        if (mf == null) {
            mf = new MainFrame();
        }
        
        return mf;
    }
    
    private MainFrame() {
        this.setTitle("Generate Txt File Tool");
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.add(this.lp);
        this.pack();
        this.setLocationRelativeTo((Component)null);
        this.setVisible(true);
    }
    
    public Panel getLp() {
        
        return lp;
    }
    
    public void setLp(Panel lp) {
        
        this.lp = lp;
    }
}

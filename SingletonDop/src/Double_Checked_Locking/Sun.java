package Double_Checked_Locking;

import java.util.HashMap;
import java.util.Map;

public class Sun {
    private boolean existence;
    private Map<String, Double> structure = new HashMap<>
            (Map.of("hydrogen", 73.46, "helium", 24.85, "other", 1.69));

    private static Sun unSun;

    private Sun() {}

    public static Sun getInstance() {
        if (unSun == null) {
            synchronized (Sun.class) {
                if (unSun == null) {
                    unSun = new Sun();
                }
            }
        }
        return unSun;
    }

    public boolean isExistence() {
        return existence;
    }

    public Map<String, Double> getStructure() {
        return structure;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "existence=" + existence +
                ", structure=" + structure +
                '}';
    }

    public void destruction(){
        existence = false;
        structure = null;
    }
     public void decay(){
         System.out.println("происходит термоядерный синтез за счет перерабатывания водорода в гелий и" +
                 " выделяется очень много энергии");
     }

     public void turnover(){
         System.out.println("происходит оборот вокруг своей оси");
     }




}

package enumS;

import java.util.HashMap;
import java.util.Map;

public enum Sun {

    unSun;

    private boolean existence;
    private Map<String, Double> structure = new HashMap<>
            (Map.of("hydrogen", 73.46, "helium", 24.85, "other", 1.69));


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

package stacks;

import common.Repair;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RepairStack {

    private static RepairStack repairStackInstance = null;
    private List<Repair> instances = null;

    private RepairStack() {
        instances = new ArrayList<Repair>();
    }

    public static RepairStack getInstance() {
        if (repairStackInstance == null) {
            repairStackInstance = new RepairStack();
        }
        return repairStackInstance;
    }

    public void addRepair(Repair repair) {
        instances.add(repair);
    }

    public List<Repair> getInstances() {
        return this.instances;
    }

    public void getInformation(UUID uuid) {
        for (Repair repair : instances) {
            if (repair.getUuid().equals(uuid)) {
                System.out.println(repair);
            }
        }
    }
}
